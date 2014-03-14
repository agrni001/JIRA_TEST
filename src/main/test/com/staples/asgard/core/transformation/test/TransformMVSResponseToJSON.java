package com.staples.asgard.core.transformation.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.staples.asgard.core.domain.model.inventory.NearByRes;
import com.staples.asgard.core.domain.model.inventory.NearByResHdrType;
import com.staples.asgard.core.domain.model.inventory.StoreOnHandDetailType;


@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = {"classpath:test-config-context.xml"})
 public class TransformMVSResponseToJSON {
	@InjectMocks
	@Autowired
	ObjectMapper asgardJacksonObjectMapper;
	
	  
		
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);		
	}
	 
	@Test
public void JsonToJava() throws JsonParseException, JsonMappingException, IOException{
	
		String jsonString ="{\"nearByResHdr\":{\"status\":\"00\",\"statusDesc\":\"Success.\",\"histSeqNum\":\"1003269812\",\"searchAddrLn\":\"230 south st\",\"searchCity\":\"northborough\",\"searchState\":\"ma\",\"searchZipCode\":\"01532\",\"searchRadius\":\"25\",\"searchItem\":\"198523\",\"searchLocale\":\"en_US\"},\"nearByStoreOnHandDtl\":[{\"storeNum\":\"1216\",\"addressLine\":\"18 Lyman St\",\"city\":\"Westborough\",\"state\":\"MA\",\"zipCode\":\"01581\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5088708761\",\"plazaMall\":\"\",\"distance\":\"2.39\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"0059\",\"addressLine\":\"571 Boston Turnpike\",\"city\":\"Shrewsbury\",\"state\":\"MA\",\"zipCode\":\"01545\",\"storeHours\":\"Monday - Friday: 0800-2200 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5088421507\",\"plazaMall\":\"\",\"distance\":\"4.06\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"1218\",\"addressLine\":\"541B Lincoln St\",\"city\":\"Worcester\",\"state\":\"MA\",\"zipCode\":\"01604\",\"storeHours\":\"Monday - Friday: 0800-2200 Saturday: 0900-2200 Sunday: 1000-1900\",\"phoneNumber\":\"5088523771\",\"plazaMall\":\"\",\"distance\":\"6.87\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"1525\",\"addressLine\":\"771 Boston Post Rd\",\"city\":\"Marlborough\",\"state\":\"MA\",\"zipCode\":\"01752\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1800\",\"phoneNumber\":\"5082292011\",\"plazaMall\":\"(Rt 20)\",\"distance\":\"8.11\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"1553\",\"addressLine\":\"70 Worcester Providence Tpke \",\"city\":\"Millbury \",\"state\":\"MA\",\"zipCode\":\"01527\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5088653995\",\"plazaMall\":\"\",\"distance\":\"9.95\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"0349\",\"addressLine\":\"659 Worcester Rd\",\"city\":\"Framingham\",\"state\":\"MA\",\"zipCode\":\"01701\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5088203020\",\"plazaMall\":\"\",\"distance\":\"11.28\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"1759\",\"addressLine\":\"220 Fortune Blvd\",\"city\":\"Milford\",\"state\":\"MA\",\"zipCode\":\"01757\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5086346934\",\"plazaMall\":\"\",\"distance\":\"12.43\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"0294\",\"addressLine\":\"436 Southbridge Street (Rt 12)\",\"city\":\"Auburn\",\"state\":\"MA\",\"zipCode\":\"01501\",\"storeHours\":\"Monday - Friday: 0800-2200 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5087219500\",\"plazaMall\":\"\",\"distance\":\"12.55\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"0008\",\"addressLine\":\"881 Worcester Road\",\"city\":\"Natick\",\"state\":\"MA\",\"zipCode\":\"01760\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5086550811\",\"plazaMall\":\"\",\"distance\":\"14.57\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"},{\"storeNum\":\"0348\",\"addressLine\":\"284 Hartford Ave\",\"city\":\"Bellingham\",\"state\":\"MA\",\"zipCode\":\"02019\",\"storeHours\":\"Monday - Friday: 0800-2100 Saturday: 0900-2100 Sunday: 1000-1900\",\"phoneNumber\":\"5089661200\",\"plazaMall\":\"Stallbrook Marketplace\",\"distance\":\"15.94\",\"distanceUnits\":\"mi\",\"availQty\":\"0\",\"damageQty\":\"0\",\"displayQty\":\"0\",\"onHandQty\":\"0\",\"softAllocQty\":\"0\",\"ropsFlag\":\"1\",\"price\":\"0.00\",\"stockLevel\":\"Item not available at this location.\",\"ropsFlag\":\"1\"}]}";
		
		 
			NearByRes responseByRes= asgardJacksonObjectMapper.readValue(jsonString, NearByRes.class);
			
			assertTrue(responseByRes.getNearByResHdr().getSearchZipCode().equalsIgnoreCase("01532"));
			assertTrue(responseByRes.getNearByStoreOnHandDtl().iterator().next().getZipCode().equalsIgnoreCase("01581"));
			
	}
		
		@Test	
 		public void JavaToJson() throws JsonProcessingException{
			//given
			
			NearByRes responseByRes=mock(NearByRes.class);
			NearByResHdrType responseByResHdrType=mock(NearByResHdrType.class);	  
			StoreOnHandDetailType responseStoreOnHandDetailType =mock(StoreOnHandDetailType.class);
		
			given(responseByRes.getNearByResHdr()).willReturn(responseByResHdrType);
			given(responseByRes.getNearByStoreOnHandDtl()).willReturn(Arrays.asList(responseStoreOnHandDetailType));
			given(responseByRes.getNearByResHdr().getSearchZipCode()).willReturn("01532");
			given(responseByRes.getNearByStoreOnHandDtl().iterator().next().getZipCode()).willReturn("01581");
			asgardJacksonObjectMapper.configure( SerializationFeature.FAIL_ON_EMPTY_BEANS , false);
			//when
			String string = asgardJacksonObjectMapper.writeValueAsString(responseByRes);
			
			//then
			assertTrue( string.contains(responseByRes.getNearByResHdr().getSearchZipCode()));
			assertTrue(string.contains(responseByRes.getNearByStoreOnHandDtl().iterator().next().getZipCode()));
			
		}
}