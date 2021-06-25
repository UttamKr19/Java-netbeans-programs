
package com.me.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.me.ws package. 
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

    private final static QName _Operation1Response_QNAME = new QName("http://ws.me.com/", "operation1Response");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.me.com/", "helloResponse");
    private final static QName _Operation1_QNAME = new QName("http://ws.me.com/", "operation1");
    private final static QName _Operation2_QNAME = new QName("http://ws.me.com/", "operation2");
    private final static QName _Hello_QNAME = new QName("http://ws.me.com/", "hello");
    private final static QName _Operation2Response_QNAME = new QName("http://ws.me.com/", "operation2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.me.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Operation2 }
     * 
     */
    public Operation2 createOperation2() {
        return new Operation2();
    }

    /**
     * Create an instance of {@link Operation1 }
     * 
     */
    public Operation1 createOperation1() {
        return new Operation1();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Operation1Response }
     * 
     */
    public Operation1Response createOperation1Response() {
        return new Operation1Response();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Operation2Response }
     * 
     */
    public Operation2Response createOperation2Response() {
        return new Operation2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.me.com/", name = "operation1Response")
    public JAXBElement<Operation1Response> createOperation1Response(Operation1Response value) {
        return new JAXBElement<Operation1Response>(_Operation1Response_QNAME, Operation1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.me.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.me.com/", name = "operation1")
    public JAXBElement<Operation1> createOperation1(Operation1 value) {
        return new JAXBElement<Operation1>(_Operation1_QNAME, Operation1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.me.com/", name = "operation2")
    public JAXBElement<Operation2> createOperation2(Operation2 value) {
        return new JAXBElement<Operation2>(_Operation2_QNAME, Operation2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.me.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.me.com/", name = "operation2Response")
    public JAXBElement<Operation2Response> createOperation2Response(Operation2Response value) {
        return new JAXBElement<Operation2Response>(_Operation2Response_QNAME, Operation2Response.class, null, value);
    }

}
