package com.staples.asgard.core.standalone;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StreamUtils;

/**
 * ServiceActivator class that will load the specified XML file, unmarshall it
 * and return the object as the response. This class is used to stub external
 * XML services. This class will unmarshall the file once and store the value as
 * an instance variable so that it is not read again.
 * 
 * <p>
 * Sample configuration
 * </p>
 * 
 * <pre>
 * 
 * http://localhost:8101/asgard-browse/certona/v1/10001?cartTotal=0&scheme=sku_pd_box2&pageType=Elite&number=5%3B12&pageId=res14022503231981615535914&lang=en&url=sku_pd_box2&context=325398&clientIp=127.0.0.1&trackingId=&catalog=staplesC01&appId=staples01
 * 
 *     <int:channel id="certona-standalone"></int:channel>
 *     <int:channel id="certona-standalone-router"></int:channel>
 * 
 *     <bean id="certonaStandalone"
 *         class="com.staples.asgard.core.standalone.StandaloneResponseService">
 *         <property name="responseFile" value="certonaresponse.json" />
 *         <property name="sleepTimeMS" value="1000" />
 *     </bean>
 * 
 *     <int:service-activator id="certonaStandAloneActivator"
 *         ref="certonaStandalone" input-channel="certona-standalone"
 *         output-channel="Certona-Responses">
 *     </int:service-activator>
 * 
 *     <int:router input-channel="Certona-Input-Requests"
 *         expression="'#{CertonaConfig.standAlone}'">
 *         <int:mapping value="true" channel="certona-standalone" />
 *         <int:mapping value="false" channel="Certona-Outbound-Gateway" />
 *     </int:router>
 *     
 * </pre>
 * 
 * @author Staples
 * 
 */
@Component
public class StandaloneResponseService {
    private static final Logger log = LoggerFactory.getLogger(StandaloneResponseService.class);

    /**
     * Object returned as the response. This is stored as a instance
     * variable so it can be reused and not read from disk on each request.
     */
    private Object responseObject = null;

    /**
     * The file providing the canned response
     */
    private String responseFile = null;

    /**
     * Time in MS for this service to sleep. If not provided, no Thread.sleep is
     * executed.
     */
    private String sleepTimeMS = null;

    /**
     * Method that loads the file, unmarshall's it then returns the response
     * 
     * @param nearBySearchParams
     * @return
     */
    @ServiceActivator
    public Object standAlone() {

        log.debug("Using %s for response", responseFile);

        if (responseObject == null) {

            log.debug("Loading %s for response", responseFile);
            try {
                ClassPathResource cpr = new ClassPathResource(getResponseFile());
                responseObject = FileCopyUtils.copyToString(new InputStreamReader(cpr.getInputStream()));
            } catch (IOException e) {
            }
        }

        if (sleepTimeMS != null && sleepTimeMS.trim().length() > 0) {
            try {
                log.debug("Sleeping for  %s ms", sleepTimeMS);
                Thread.sleep(Long.parseLong(sleepTimeMS));
                log.debug("Waking up");
            } catch (NumberFormatException e) {
            } catch (InterruptedException e) {
            }
        }

        return responseObject;
    }

    public String getSleepTimeMS() {
        return sleepTimeMS;
    }

    public void setSleepTimeMS(String sleepTimeMS) {
        this.sleepTimeMS = sleepTimeMS;
    }

    public String getResponseFile() {
        return responseFile;
    }

    public void setResponseFile(String responseFile) {
        this.responseFile = responseFile;
    }

}
