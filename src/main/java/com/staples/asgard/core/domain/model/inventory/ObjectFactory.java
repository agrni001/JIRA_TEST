
package com.staples.asgard.core.domain.model.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.staples.dotcom.consumer.getinventory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNearByReq_QNAME = new QName("http://staples.com/dotcom/consumer/getinventory", "getNearByReq");
    private final static QName _GetNearByRes_QNAME = new QName("http://staples.com/dotcom/consumer/getinventory", "getNearByRes");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.staples.dotcom.consumer.getinventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NearBySearchParams }
     * 
     */
    public NearBySearchParams createNearBySearchParams() {
        return new NearBySearchParams();
    }

    /**
     * Create an instance of {@link NearByRes }
     * 
     */
    public NearByRes createNearByRes() {
        return new NearByRes();
    }

    
    /**
     * Create an instance of {@link StoreOnHandDetailType }
     * 
     */
    public StoreOnHandDetailType createStoreOnHandDetailType() {
        return new StoreOnHandDetailType();
    }

    /**
     * Create an instance of {@link NearByResHdrType }
     * 
     */
    public NearByResHdrType createNearByResHdrType() {
        return new NearByResHdrType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearBySearchParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staples.com/dotcom/consumer/getinventory", name = "getNearByReq")
    public JAXBElement<NearBySearchParams> createGetNearByReq(NearBySearchParams value) {
        return new JAXBElement<NearBySearchParams>(_GetNearByReq_QNAME, NearBySearchParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearByRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staples.com/dotcom/consumer/getinventory", name = "getNearByRes")
    public JAXBElement<NearByRes> createGetNearByRes(NearByRes value) {
        return new JAXBElement<NearByRes>(_GetNearByRes_QNAME, NearByRes.class, null, value);
    }

     
 

     

}
