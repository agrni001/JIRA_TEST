package com.staples.asgard.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.staples.asgard.core.domain.model.PriceOutputVO;
import com.staples.asgard.core.domain.model.PriceRequestVO;
import com.staples.asgard.core.domain.model.SKURequestVO;
import com.staples.asgard.price.repository.PriceRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:config-context.xml" })
public class PriceRepositoryTest {

	@Autowired
	PriceRepository priceRepository;

	private static String geoZoneId_Z1 = "18";

	private static String geoZoneId_Z2 = "Z002";

	private static String suffixId = "Z005";

	private static String topCustomerZoneId = "19";

	private static String privateSavingId = "20";

	private static String stapleSKUId = "12345678";

	private static String nonStapleSKUId = "Z0001";

	private static String marketPlaceSKUId = "IM1234";

	private static String storeId = "10001";

	@Test
	public void assertPriceListfromPRICECollection() {
		List<PriceOutputVO> priceOutputVO = priceRepository
				.getPriceForAllSkus(mockRequestForPriceRequestVOTypeOne());
		assertEquals("Result is", 2, priceOutputVO.size());
	}

	private PriceRequestVO mockRequestForPriceRequestVOTypeOne() {
		PriceRequestVO priceRequestVO = new PriceRequestVO();
		priceRequestVO.setLocale(new Locale("en_US"));
		priceRequestVO.setGeoZoneId(geoZoneId_Z1);
		priceRequestVO.setTopCustomerZoneId(topCustomerZoneId);
		priceRequestVO.setPrivateSavingId(privateSavingId);
		priceRequestVO.setStoreId(storeId);
		List<SKURequestVO> skuList = new ArrayList<SKURequestVO>();

		SKURequestVO skuRequestVO = new SKURequestVO();
		skuRequestVO
				.setDocKey("StaplesCACAS/en_CA/20058/CC00099CL169552/586026");
		skuRequestVO.setUser_price_flag(1);
		skuList.add(skuRequestVO);

		skuRequestVO = new SKURequestVO();
		skuRequestVO
				.setDocKey("StaplesCACAS/en_CA/20058/CC00099CL169552/test001");
		skuRequestVO.setUser_price_flag(1);
		skuList.add(skuRequestVO);

		priceRequestVO.setSkuList(skuList);
		return priceRequestVO;
	}

	@Test
	public void assertEMPTYPriceListfromPRICECollection() {
		List<PriceOutputVO> priceOutputVO = priceRepository
				.getPriceForAllSkus(mockRequestForPriceRequestVOTypeFour());
		assertEquals("Result is", 0, priceOutputVO.size());
	}

	private PriceRequestVO mockRequestForPriceRequestVOTypeFour() {
		PriceRequestVO priceRequestVO = new PriceRequestVO();
		priceRequestVO.setLocale(new Locale("en_US"));
		priceRequestVO.setGeoZoneId(geoZoneId_Z1);
		priceRequestVO.setTopCustomerZoneId(topCustomerZoneId);
		priceRequestVO.setPrivateSavingId(privateSavingId);
		priceRequestVO.setStoreId(storeId);
		List<SKURequestVO> skuList = new ArrayList<SKURequestVO>();

		SKURequestVO skuRequestVO = new SKURequestVO();
		skuRequestVO.setDocKey("PriceData_1");
		skuRequestVO.setUser_price_flag(1);
		skuList.add(skuRequestVO);

		skuRequestVO = new SKURequestVO();
		skuRequestVO.setDocKey("PriceData_2");
		skuRequestVO.setUser_price_flag(1);
		skuList.add(skuRequestVO);

		priceRequestVO.setSkuList(skuList);
		return priceRequestVO;
	}

	@Test
	public void assertPriceListfromPRODUCTCollection() {
		List<PriceOutputVO> priceOutputVO = priceRepository
				.getPriceForAllSkus(mockRequestForPriceRequestVOTypeTwo());
		assertEquals("Result is", 1, priceOutputVO.size());
	}

	private PriceRequestVO mockRequestForPriceRequestVOTypeTwo() {
		PriceRequestVO priceRequestVO = new PriceRequestVO();
		priceRequestVO.setLocale(new Locale("en_US"));
		priceRequestVO.setGeoZoneId(geoZoneId_Z1);
		priceRequestVO.setTopCustomerZoneId(topCustomerZoneId);
		priceRequestVO.setPrivateSavingId(privateSavingId);
		priceRequestVO.setStoreId(storeId);
		List<SKURequestVO> skuList = new ArrayList<SKURequestVO>();

		SKURequestVO skuRequestVO = new SKURequestVO();

		skuRequestVO
				.setDocKey("StaplesUSCAS/en_US/10051/CL161746/testoffshore");
		skuRequestVO.setUser_price_flag(0);
		skuList.add(skuRequestVO);

		skuRequestVO = new SKURequestVO();
		skuRequestVO
				.setDocKey("StaplesCACAS/en_CA/20058/CC00099CL169552/test001");
		skuRequestVO.setUser_price_flag(0);
		skuList.add(skuRequestVO);

		priceRequestVO.setSkuList(skuList);
		return priceRequestVO;
	}

	@Test
	public void assertEMPTYPriceListfromPRODUCTCollection() {
		List<PriceOutputVO> priceOutputVO = priceRepository
				.getPriceForAllSkus(mockRequestForPriceRequestVOTypeThree());
		assertEquals("Result is", 0, priceOutputVO.size());
	}

	private PriceRequestVO mockRequestForPriceRequestVOTypeThree() {
		PriceRequestVO priceRequestVO = new PriceRequestVO();
		priceRequestVO.setLocale(new Locale("en_US"));
		priceRequestVO.setGeoZoneId(geoZoneId_Z1);
		priceRequestVO.setTopCustomerZoneId(topCustomerZoneId);
		priceRequestVO.setPrivateSavingId(privateSavingId);
		priceRequestVO.setStoreId(storeId);
		List<SKURequestVO> skuList = new ArrayList<SKURequestVO>();

		SKURequestVO skuRequestVO = new SKURequestVO();

		skuRequestVO.setDocKey("TESTDATA_1");
		skuRequestVO.setUser_price_flag(0);
		skuList.add(skuRequestVO);

		skuRequestVO = new SKURequestVO();
		skuRequestVO.setDocKey("TESTDATA_2");
		skuRequestVO.setUser_price_flag(0);
		skuList.add(skuRequestVO);

		priceRequestVO.setSkuList(skuList);
		return priceRequestVO;
	}
}
