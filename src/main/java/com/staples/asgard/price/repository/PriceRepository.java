package com.staples.asgard.price.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.staples.asgard.core.domain.model.PriceOutputVO;
import com.staples.asgard.core.domain.model.PriceRequestVO;
import com.staples.asgard.core.domain.model.Product;
import com.staples.asgard.core.domain.model.SKURequestVO;

/*
 * This class provides access to the MONGO database for all requirements of Pricing (Math Story) Service
 *  
 */
@Repository
public class PriceRepository<O> {

	@Autowired
	private MongoTemplate mongoTemplate;

	/** Logger */
	private static final Logger LOG = LoggerFactory
			.getLogger(PriceRepository.class);

	/**
	 * @param priceRequestVO
	 * @return
	 */
	public List<PriceOutputVO> getPriceForAllSkus(PriceRequestVO priceRequestVO) {
		System.out.println("priceRequestVO : " + priceRequestVO);
		List<String> docKeyListForPriceCol = new ArrayList<String>();
		List<String> docKeyListForProductCol = new ArrayList<String>();
		if (null != priceRequestVO && null != priceRequestVO.getSkuList()) {
			for (SKURequestVO sku : priceRequestVO.getSkuList()) {
				if (null != sku && StringUtils.isNoneEmpty(sku.getDocKey())) {
					if (sku.getUser_price_flag() == 1) {
						docKeyListForPriceCol.add(sku.getDocKey());
					} else {
						docKeyListForProductCol.add(sku.getDocKey());
					}
				}
			}
		}

		Query query = new Query();

		List<PriceOutputVO> priceListfromPriceCollection = null;

		if (null != docKeyListForPriceCol && docKeyListForPriceCol.size() > 0) {
			query = new Query(Criteria.where("prod_doc_key").in(
					docKeyListForPriceCol));
			priceListfromPriceCollection = (List<PriceOutputVO>) getDocumentBasedOnDocKey(
					docKeyListForPriceCol, (Class<O>) PriceOutputVO.class,
					query, "price");
		}

		List<PriceOutputVO> priceListfromProductCollection = null;

		if (null != docKeyListForProductCol
				&& docKeyListForProductCol.size() > 0) {
			query = new Query(Criteria.where("prod_doc_key").in(
					docKeyListForProductCol));
			List<Product> productList = (List<Product>) getDocumentBasedOnDocKey(
					docKeyListForProductCol, (Class<O>) Product.class, query,
					"products");
			priceListfromProductCollection = getPriceSubDocumentFromProductDocument(productList);
		}

		System.out.println("query : " + query);

		List<PriceOutputVO> finalList = new ArrayList<PriceOutputVO>();
		if (null != priceListfromPriceCollection
				&& priceListfromPriceCollection.size() > 0) {
			finalList.addAll(priceListfromPriceCollection);
		}

		if (null != priceListfromProductCollection
				&& priceListfromProductCollection.size() > 0) {
			finalList.addAll(priceListfromProductCollection);
		}

		return finalList;
	}

	/**
	 * @param skuId
	 * @param zoneIds
	 * @return
	 */
	private List<PriceOutputVO> getPriceSubDocumentFromProductDocument(
			List<Product> productList) {
		List<PriceOutputVO> priceListfromProductCollection = new ArrayList<PriceOutputVO>();
		if (null != productList && productList.size() > 0) {
			for (Product product : productList) {
				if (null != product.getPrice()) {
					priceListfromProductCollection.add(product.getPrice());
				}
			}
		}
		return priceListfromProductCollection;
	}

	private List<O> getDocumentBasedOnDocKey(List<String> priceDocList,
			Class<O> classIdentifier, Query query, String collectionName) {

		return (List<O>) mongoTemplate.find(query, classIdentifier,
				collectionName);
	}

}
