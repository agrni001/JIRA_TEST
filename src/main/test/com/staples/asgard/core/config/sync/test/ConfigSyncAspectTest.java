package com.staples.asgard.core.config.sync.test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.service.ConfigService;
import com.staples.asgard.core.config.sync.ConfigSyncAspect;
import com.staples.asgard.core.config.util.ConfigUtil;

/**
 * Class to test the <code>ConfigSyncApsect</code> code.
 * 
 * @author Staples
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ConfigUtil.class)
public class ConfigSyncAspectTest {

    /**
     * InjectMocks tells Mockito to inject @Mock into this Object for use with @Autowire
     */
    @InjectMocks
    private ConfigSyncAspect configSyncAspect;

    @Mock
    private ConfigService configService;

    /**
     * Using AppConfig object because it is the parent to all Config elements (even though they don't inherit from it)
     */
    @Mock
    private AppConfig appConfig;

    @Mock
    private Signature signature;

    @Mock
    private JoinPoint joinPoint;

    @Mock
    private ConfigUtil configUtil;

    @Before
    public void setUp() {
        // Since using @Mock annotation, must call this to initialize them
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSync() {

        // setup the values to use and to test for at the end
        String configValue = "true";
        String beanId = "MVSConfig";
        String configKey = "ActiveStatus";
        // signature has a setter
        String signatureName = "set" + configKey;
        String serverId = "BROWSE_JVM1";

        // use PowerMockito for the static method
        PowerMockito.mockStatic(ConfigUtil.class);
        when(ConfigUtil.getServerId()).thenReturn(serverId);

        // mock the necessary methods
        when(joinPoint.getArgs()).thenReturn(new Object[] { configValue });
        when(joinPoint.getThis()).thenReturn(appConfig);
        when(joinPoint.getSignature()).thenReturn(signature);
        when(appConfig.getBeanId()).thenReturn(beanId);
        when(appConfig.getConfigKey()).thenReturn(configKey);
        when(signature.getName()).thenReturn(signatureName);
        when(configService.updateBeanConfiguration(anyString(), anyString(), anyString(), anyString())).thenReturn(true);

        // Test the actual code
        configSyncAspect.sync(joinPoint);

        // check that the updateBeanConfiguration method was called with the
        // original values and returns true
        verify(configService).updateBeanConfiguration(serverId, beanId, configKey, configValue);

    }
}
