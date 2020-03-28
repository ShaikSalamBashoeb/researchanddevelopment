
package com.adp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adp package. 
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

    private final static QName _GetEmployeeName_QNAME = new QName("http://adp.com/", "getEmployeeName");
    private final static QName _GetEmployeeNameResponse_QNAME = new QName("http://adp.com/", "getEmployeeNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeNameResponse }
     * 
     */
    public GetEmployeeNameResponse createGetEmployeeNameResponse() {
        return new GetEmployeeNameResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeName }
     * 
     */
    public GetEmployeeName createGetEmployeeName() {
        return new GetEmployeeName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://adp.com/", name = "getEmployeeName")
    public JAXBElement<GetEmployeeName> createGetEmployeeName(GetEmployeeName value) {
        return new JAXBElement<GetEmployeeName>(_GetEmployeeName_QNAME, GetEmployeeName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://adp.com/", name = "getEmployeeNameResponse")
    public JAXBElement<GetEmployeeNameResponse> createGetEmployeeNameResponse(GetEmployeeNameResponse value) {
        return new JAXBElement<GetEmployeeNameResponse>(_GetEmployeeNameResponse_QNAME, GetEmployeeNameResponse.class, null, value);
    }

}
