package com.staples.asgard.core.config.repository.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.staples.asgard.core.config.model.AppConfig;
import com.staples.asgard.core.config.repository.ConfigRepository;
import com.staples.asgard.core.constants.GlobalConstants;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:config-context.xml"})
public class ConfigRepositoryImplTest {
	
	@Autowired
	private ConfigRepository configDao;	

	@Test
	public void testHandleFirstTimeLoad() {
		boolean insertResult = false;
		
		/**
		 * This method clones all the configuration beans of the DEFAULT_SERVERID to the current ServerId
		 */
		insertResult = configDao.handleFirstTimeLoad(GlobalConstants.TEST_SERVER_ID);		
		assertTrue("Record Inserted Successfully", insertResult);
	}	
	
	

	@Test
	public void testInsertConfigDetails() {
		boolean insertResult = false;
		List<AppConfig> listOfConfigDetailsToInsert = new ArrayList<AppConfig>();

		AppConfig appConfig = new AppConfig();
		appConfig.setId(new ObjectId());
		appConfig.setStoreId("10001");
		appConfig.setServerId("Test");
		appConfig.setBeanId("IVConfig");
		appConfig.setConfigKey("throttleLimit");
		appConfig.setConfigValue("111");
		appConfig.setChangedBy("xyz");
		appConfig.setDescription("test data");
		appConfig.setLastUpdated(new Date().toString());
	
		listOfConfigDetailsToInsert.add(appConfig);			
	
		insertResult = configDao.insertConfigDetails(GlobalConstants.TEST_SERVER_ID, listOfConfigDetailsToInsert);		
		assertTrue("Record Inserted Successfully", insertResult);
	}	
	
	
	@Test
	public void testGetAllConfigForServerId() {
		List<AppConfig> listOfConfigDetails = configDao.getAllConfigForServerId(GlobalConstants.TEST_SERVER_ID);
		assertFalse("List of Test Server Id Configurations ", listOfConfigDetails.isEmpty());
	}
	
	@Test
	public void testGetAllConfigDetailsForBeanId() {
		List<AppConfig> listOfConfigDetails = configDao.getAllConfigDetailsForBeanId(GlobalConstants.TEST_SERVER_ID, "IVConfig");
		assertFalse("List of Test Server Id Configurations ", listOfConfigDetails.isEmpty());
	}
	
	@Test
	public void testUpdateBeanConfiguration() {
		boolean result = configDao.updateBeanConfiguration("Test", "IVConfig", "throttleLimit", "999");
		assertTrue("Update a config key value of IVConfig Bean for Test Server :", result);
	}
	
	@Test
	public void deleteTestServerIds() {
		boolean deleteResult = false;		
		/**
		 * This method deletes all the configuration beans of the Test Server id
		 */
		deleteResult = configDao.deleteConfigDetails(GlobalConstants.TEST_SERVER_ID);		
		assertTrue("Record Deleted Successfully", deleteResult);	
	}	
	
	@Test
	public void testGetAllAppConfig() {
		List<AppConfig> listOfConfigDetails = configDao.getAllAppConfig();
		assertFalse("List of All Configurations ", listOfConfigDetails.isEmpty());
	}
	
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);                   
    }	
	
}
