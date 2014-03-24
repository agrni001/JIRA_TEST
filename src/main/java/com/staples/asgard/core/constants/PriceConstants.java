package com.staples.asgard.core.constants;

import java.math.RoundingMode;

public class PriceConstants {
	public static final String DEFAULT_PRICE = "9999999999.99";
	public static final String DEFAULT_UOM = "EACH";

	public static final String WAS_PRICE = "WASPRICE";
	public static final String REG_PRICE = "REGPRICE";

	public static final String DATE_FORMAT = "EEE MMM dd HH:mm:ss z yyyy";

	// TODO move to property file.
	public static final String DEFAULT_ZONE = "25";

	public static final int DEFAULT_SCALE = 2;
	public static final RoundingMode DEFAULT_RM = RoundingMode.HALF_DOWN;

}
