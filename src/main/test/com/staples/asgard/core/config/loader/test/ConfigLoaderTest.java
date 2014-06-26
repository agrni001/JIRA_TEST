package com.staples.asgard.core.config.loader.test;

import static com.staples.asgard.core.constants.GlobalConstants.DEFAULT_SERVER_ID;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//hi
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.staples.asgard.core.config.loader.ConfigLoader;
import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.service.ConfigService;
import com.staples.asgard.core.config.util.ConfigUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ConfigUtil.class)
public class ConfigLoaderTest {

	@InjectMocks
	@Autowired
	private ConfigLoader configLoader;

	@Mock
	private ConfigService configService;

	@Mock
	private ConfigUtil configUtil;

	@Ignore
	@Test
	public void testPostProcessAfterInitialization() {
		//TODO: tests the core Functionality using a bean that is available in core module
		String beanName = "IVConfig";

		AppConfig appConfigCurrentServer = new AppConfig();
		appConfigCurrentServer.setStoreId("11001");
		appConfigCurrentServer.setServerId("DEFAULT_SERVER");
		appConfigCurrentServer.setBeanId("IVConfig");
		appConfigCurrentServer.setConfigKey("timeout");
		appConfigCurrentServer.setConfigValue("1");
		appConfigCurrentServer.setChangedBy("UserTest");
		appConfigCurrentServer.setDescription("test data");
		appConfigCurrentServer.setLastUpdated(new Date().toString());

		PowerMockito.mockStatic(ConfigUtil.class);
		when(ConfigUtil.getServerId()).thenReturn("BROWSE_JVM1");

		List<AppConfig> listOfConfigsForCurrentServer = new ArrayList<AppConfig>();
		List<AppConfig> listOfConfigCurrentServer = new ArrayList<AppConfig>();
		listOfConfigCurrentServer.add(appConfigCurrentServer);

		AppConfig appConfig = new AppConfig();
		appConfig.setStoreId("11001");
		appConfig.setServerId("DEFAULT_SERVER");
		appConfig.setBeanId("IVConfig");
		appConfig.setConfigKey("timeout");
		appConfig.setConfigValue("1");
		appConfig.setChangedBy("UserTest");
		appConfig.setDescription("test data");
		appConfig.setLastUpdated(new Date().toString());

		List<AppConfig> listOfConfigsForDefaultServer = new ArrayList<AppConfig>();
		listOfConfigsForDefaultServer.add(appConfig);

		when(configService.getAllConfigDetailsForBeanId(DEFAULT_SERVER_ID, beanName)).thenReturn(listOfConfigsForDefaultServer);
		when(configService.getAllConfigDetailsForBeanId(ConfigUtil.getServerId(), beanName)).thenReturn(listOfConfigCurrentServer);
		when(configService.insertBeanConfiguration(listOfConfigsForDefaultServer)).thenReturn(true);
		when(configLoader.insertConfigDetails(listOfConfigsForCurrentServer, listOfConfigsForDefaultServer)).thenReturn(true);
		
		//TODO: tests the core Functionality using a bean that is available in core module
		//IVConfig bean = (IVConfig) configLoader.postProcessAfterInitialization(new IVConfig(), beanName);
		//assertEquals("No Bean Returned :", "1", bean.getTimeout());
	}

	@Ignore
	@Test(expected = RuntimeException.class)
	public void testPostProcessWithNoDefaultConfigBeans() {
		String beanName = "IVConfig";
		PowerMockito.mockStatic(ConfigUtil.class);
		when(ConfigUtil.getServerId()).thenReturn("BROWSE_JVM1");
		List<AppConfig> listOfConfigsForDefaultServer = new ArrayList<AppConfig>();
		when(configService.getAllConfigDetailsForBeanId(DEFAULT_SERVER_ID, beanName)).thenReturn(listOfConfigsForDefaultServer);
		//TODO: tests the core Functionality using a bean that is available in core module
		//IVConfig bean = (IVConfig) configLoader.postProcessAfterInitialization(new IVConfig(), beanName);
	}

}
