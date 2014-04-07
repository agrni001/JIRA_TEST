package com.staples.asgard.core.constants;

import java.math.RoundingMode;

public class PriceConstants {
	public static final String DEFAULT_PRICE = "9999999999.99";
	public static final String DEFAULT_UOM = "EACH";

	public static final String WAS_PRICE = "WASPRICE";
	public static final String REG_PRICE = "REGPRICE";

	// TODO pick from the MONGO.
	public static final String DEFAULT_ZONE = "25";

	public static final int DEFAULT_SCALE = 4;
	public static final RoundingMode DEFAULT_RM = RoundingMode.HALF_DOWN;

	public static final String PRICE_COLLECTION = "price";

	public static final String PROD_DOC_KEY = "prod_doc_key";

	public static final String PIVOT_PROD_DOC_KEY = "$prod_doc_key";

	public static final String IN = "$in";

	public static final String LTE = "$lte";

	public static final String GTE = "$gte";

	public static final String UNWIND = "$unwind";

	public static final String MATCH = "$match";

	public static final String SORT = "$sort";

	public static final String FIRST = "$first";

	public static final String PUSH = "$push";

	public static final String MIN = "$min";

	public static final String GROUP = "$group";

	public static final String PROJECT = "$project";

	public static final String START_DATE = "start_date";

	public static final String END_DATE = "end_date";

	public static final String _ID = "_id";

	public static final String _ID_PROD_DOC_KEY = "_id.prod_doc_key";

	public static final String PIVOT_ID_PROD_DOC_KEY = "$_id.prod_doc_key";

	public static final String _ID_ZONE = "$_id.zone";

	public static final String ZONE = "zone";

	public static final String PIVOT_ZONE = "$zone";

	public static final String PRECEDENCE = "precedence";

	public static final String PIVOT_PRECEDENCE = "$precedence";

	public static final String OFFERS = "offers";

	public static final String OFFER = "offer";

	public static final String OFFER_PRICE = "offer.price";

	public static final String PIVOT_OFFER_PRICE = "$offer.price";

	public static final String PIVOT_OFFER = "$offer";

	public static final String MIN_OFFER_PRICE = "minOfferPrice";

	// "$price.values" - change post 841
	public static final String PIVOT_PRICE_VALUES = "$values";

	// "price.values.zone.id" - change post 841
	public static final String PIVOT_PRICE_VALUES_ID = "values.zone.id";

	// "$price.values.precedence" - change post 841
	public static final String PIVOT_PRICE_VALUES_PRECEDENCE = "$values.precedence";

	// "$price.values.zone" - change post 841
	public static final String PIVOT_PRICE_VALUES_ZONE = "$values.zone";

	// "$price.values.offer" - change post 841
	public static final String PIVOT_PRICE_VALUES_OFFER = "$values.offer";

	// "price.uom" - change post 841
	public static final String PRICE_UOM = "uom";

	// "price.currency" - change post 841
	public static final String PRICE_CURRENCY = "currency";

	// "price.promotions" - change post 841
	public static final String PRICE_PROMOTIONS = "promotions";

	// "price.rebates" - change post 841
	public static final String PRICE_REBATES = "rebates";

	public static final String PIVOT_UOM = "$uom";

	public static final String PIVOT_CURRENCY = "$currency";
	public static final String PIVOT_PROMOTIONS = "$promotions";
	public static final String PIVOT_REBATES = "$rebates";
	public static final String PIVOT_OFFERS = "$offers";

}
