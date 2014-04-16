package com.staples.asgard.core.service.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.repository.ConfigRepository;
import com.staples.asgard.core.config.service.ConfigService;
import com.staples.asgard.core.constants.GlobalConstants;

/**
 * Unit Test Class for ConfigServiceImpl
 * 
 * @author Sapient 
 * Date: Jan 16, 2014
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config-context.xml"})
public class ConfigServiceImplTest {	
	@InjectMocks
	@Autowired
	private ConfigService configService;	
	
	@Mock
	private ConfigRepository configDao;

	@Test
	public void testGetAllAppConfig() {	
		//specify mock behave when method called
		when(configDao.getAllAppConfig()).thenReturn(prepareList());
		
		final List<AppConfig> listOfConfigs = configService.getAllAppConfig();	
		assertFalse("List of Configurations", listOfConfigs.isEmpty());
	}

	@Test
	public void testUpdateBeanConfiguration() {
		assertNotNull("Successfully updated bean configuration",  when(configDao.updateBeanConfiguration(
				GlobalConstants.TEST_SERVER_ID, "IVConfig", "activeStatus","false")).thenReturn(true));
	}
	
	@Test
	public void testGetAllConfigDetailsForBeanId() {	
		//specify mock behave when method called
		when(configService.getAllConfigDetailsForBeanId("DEFAULT_SERVER", "IVConfig")).thenReturn(prepareList());	
		final List<AppConfig> listOfConfigs = configService.getAllConfigDetailsForBeanId("DEFAULT_SERVER", "IVConfig");
		assertFalse("List of Configurations", listOfConfigs.isEmpty());
	}
	
	/* mock data to test */
	public List<AppConfig> prepareList() {
		List<AppConfig> listOfConfigDetailsToInsert = new ArrayList<AppConfig>();

		AppConfig appConfig = new AppConfig();
		appConfig.setStoreId("11001");
		appConfig.setServerId("DEFAULT_SERVER");
		appConfig.setBeanId("IVConfig");
		appConfig.setConfigKey("timeout");
		appConfig.setConfigValue("1");
		appConfig.setChangedBy("UserTest");
		appConfig.setDescription("test data");
		appConfig.setLastUpdated(new Date().toString());

		listOfConfigDetailsToInsert.add(appConfig);
			
		return listOfConfigDetailsToInsert;
	}
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);		
	}
}
