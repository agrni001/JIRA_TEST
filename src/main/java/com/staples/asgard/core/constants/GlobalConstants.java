package com.staples.asgard.core.constants;

/**
 * 
 * Class for holding the global constants.
 * 
 */
public final class GlobalConstants {

	/** partNumber parameter for return JSON **/
	public static final String PARTNUMBER_PARAM = "partNumber";

	/** quantity parameter for return JSON **/
	public static final String QUANTITY_PARAM = "quantity";

	/** leadTimeDescription parameter for return JSON **/
	public static final String LEAD_TIME_DESCRIPTION = "leadTimeDescription";

	/** leadTimeMaximum parameter for return JSON **/
	public static final String MAX_LEAD_TIME = "leadTimeMaximum";

	/** leadTimeMin parameter for return JSON **/
	public static final String MIN_LEAD_TIME = "leadTimeMin";

	/** Address for store inventoy JSON */
	public static final String ADDRESS_PARAM = "address";

	/** City for store inventoy JSON */
	public static final String CITY_PARAM = "city";

	/** State for store inventoy JSON */
	public static final String STATE_PARAM = "state";

	/** zipCode for store Inventory JSON */
	public static final String ZIPCODE_PARAM = "zipCode";

	/** zipCode for store Inventory JSON */
	public static final String DISTNACE_PARAM = "distance";

	/** zipCode for store Inventory JSON */
	public static final String AVAILABILITY_PARAM = "available";

	/** ServerID parameter for Config Loader **/
	public static final String CURRENT_SERVER_ID = "ServerID";

	/** Used to handle first time load **/
	public static final String DEFAULT_SERVER_ID = "DEFAULT_SERVER";
	public static final String TEST_SERVER_ID = "Test";
	public static final String PRIMARY_FLAG_N = "N";
	public static final String PRIMARY_FLAG_Y = "Y";

	/** Test the data before updating the DataBase **/
	public static final String INVALID_FIELD = "Please enter valid data";
	public static final String IS_INITIALIZED = "isInitialized";

	/** key IV parameters to update the data in DataBase **/
	public static final String KEY_ACTIVESTATUS = "activeStatus";
	public static final String KEY_AS400MAXNUMOFSKUS = "as400MaxNumOfSKUs";
	public static final String KEY_ZIPPARAMETERSIZE = "zipParameterSize";
	public static final String KEY_SKUPARAMETERSIZE = "skuParameterSize";
	public static final String KEY_REQQTYPARAMETERSIZE = "reqQtyParameterSize";
	public static final String KEY_AVAILQTYPARAMETERSIZE = "availQtyParameterSize";
	public static final String KEY_MINLEADTIMEPARAMETERSIZE = "minLeadTimeParameterSize";
	public static final String KEY_MAXLEADTIMEPARAMETERSIZE = "maxLeadTimeParameterSize";
	public static final String KEY_FULLFILLMENTCODEPARAMETERSIZE = "fullfillmentCodeParameterSize";
	public static final String KEY_MINDELIVDATEPARAMETERSIZE = "minDelivDateParameterSize";
	public static final String KEY_MAXDELIVDATEPARAMETERSIZE = "maxDelivDateParameterSize";
	public static final String KEY_MINDELIVTIMEPARAMETERSIZE = "";
	public static final String KEY_MAXDELIVTIMEPARAMETERSIZE = "maxDelivTimeParameterSize";
	public static final String KEY_SHOPPERLOCATIONPARAMETERSIZE = "shopperLocationParameterSize";
	public static final String KEY_STORENUMBERPARAMETERSIZE = "storeNumberParameterSize";
	public static final String KEY_TIMESTAMP = "timeStamp";
	public static final String KEY_STANDALONESLEEPTIME = "standAloneSleepTime";
	public static final String KEY_STANDALONEMAXDELIVERYINTERVAL = "standAloneMaxDeliveryInterval";
	public static final String KEY_STANDALONEMINDELIVERYINTERVAL = "standAloneMinDeliveryInterval";
	public static final String KEY_KIOSKPARAMETERSSWITCH = "kioskParametersSwitch";
	public static final String KEY_TIMEOUT = "timeout";
	public static final String KEY_STOREDPROCEDURENAME = "storedProcedureName";
	public static final String KEY_DATASOURCEJNDI = "datasourceJNDI";
	public static final String KEY_USERNAME = "userName";
	public static final String KEY_PASSWORD = "password";
	public static final String KEY_AUDITLOGGINGACTIVE = "auditLoggingActive";
	public static final String KEY_AUDITLOGGERQMGR = "auditLoggerQMgr";
	public static final String KEY_AUDITLOGGERQ = "auditLoggerQ";
	public static final String KEY_MAXSTALECONNECTIONRETRY = "maxStaleConnectionReTry";
	public static final String KEY_PERFORMANCELOGGING = "performanceLogging";
	public static final String KEY_THROTTLESTATUS = "throttlestatus";
	public static final String KEY_THROTTLELIMIT = "throttlelimit";

	/** Response Parameters **/
	public static final String APPLICATION_JSON = "application/json";
	public static final String CONTENT_TYPE = "Content-Type";

	/** Used for intercept logging **/
	public static final String LOG_METHOD_ENTER = "Entering method ";
	public static final String LOG_METHOD_EXIT = "Exiting method ";
	public static final String LOG_METHOD_ARGS_START = " Args - [ ";
	public static final String LOG_METHOD_ARGS_END = " ]";
	public static final String LOG_METHOD_EXECUTION_START = "Total execution time for method - ";
	public static final String DOT = ".";
	public static final String LOG_METHOD_EXECUTION_IS = " is : ";
	public static final String LOG_METHOD_EXECUTION_TIME_LIMIT = " ms";

	/** Logger Switch Parameters **/
	public static final String METHOD_LEVEL_TRACE = "methodLevelTrace";
	public static final String PERF_TRACE = "perfTrace";

	public static final String FALSE_STRING = "FALSE";
	public static final String SINGLE_SPACE = " ";
	public static final String ZERO = "0";
	public static final String PIPE_SYMBOL = "|";

	public static final String R = "R";
	public static final String L = "L";
	public static final String YYYYMMDD = "yyyyMMdd";

	/** IV Parameters **/
	public static final String ZIPCODE = "AS400.COMIV3S.ZIPCODE";
	public static final String SKUSERIES = "AS400.COMIV3S.SKUSERIES";
	public static final String REQQUANTITY = "AS400.COMIV3S.REQQUANTITY";
	public static final String AVAILABLEQTY = "AS400.COMIV3S.AVAILABLEQTY";
	public static final String MINIMUMLEADTIME = "AS400.COMIV3S.MINIMUMLEADTIME";
	public static final String MAXIMUMLEADTIME = "AS400.COMIV3S.MAXIMUMLEADTIME";
	public static final String MINIMUMDELIVERYDATE = "AS400.COMIV3S.MINIMUMDELIVERYDATE";
	public static final String MAXIMUMDELIVERYDATE = "AS400.COMIV3S.MAXIMUMDELIVERYDATE";
	public static final String MINIMUMDELIVERYTIME = "AS400.COMIV3S.MINIMUMDELIVERYTIME";
	public static final String MAXIMUMDELIVERYTIME = "AS400.COMIV3S.MAXIMUMDELIVERYTIME";
	public static final String LOOKUPTYPE = "AS400.COMIV3S.LOOKUPTYPE";
	public static final String STOREID = "AS400.COMIV3S.STOREID";

}