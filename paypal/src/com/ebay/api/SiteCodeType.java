
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="Australia"/>
 *     &lt;enumeration value="Austria"/>
 *     &lt;enumeration value="Belgium_French"/>
 *     &lt;enumeration value="France"/>
 *     &lt;enumeration value="Germany"/>
 *     &lt;enumeration value="Italy"/>
 *     &lt;enumeration value="Belgium_Dutch"/>
 *     &lt;enumeration value="Netherlands"/>
 *     &lt;enumeration value="Spain"/>
 *     &lt;enumeration value="Switzerland"/>
 *     &lt;enumeration value="Taiwan"/>
 *     &lt;enumeration value="eBayMotors"/>
 *     &lt;enumeration value="HongKong"/>
 *     &lt;enumeration value="Singapore"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteCodeType")
@XmlEnum
public enum SiteCodeType {


    /**
     * 
     * 						USA
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						Canada
     * 					
     * 
     */
    @XmlEnumValue("Canada")
    CANADA("Canada"),

    /**
     * 
     * 						United Kingdom
     * 					
     * 
     */
    UK("UK"),

    /**
     * 
     * 						Australia
     * 					
     * 
     */
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),

    /**
     * 
     * 						Austria
     * 					
     * 
     */
    @XmlEnumValue("Austria")
    AUSTRIA("Austria"),

    /**
     * 
     * 						Belgium (French)
     * 					
     * 
     */
    @XmlEnumValue("Belgium_French")
    BELGIUM_FRENCH("Belgium_French"),

    /**
     * 
     * 						France
     * 					
     * 
     */
    @XmlEnumValue("France")
    FRANCE("France"),

    /**
     * 
     * 						Germany
     * 					
     * 
     */
    @XmlEnumValue("Germany")
    GERMANY("Germany"),

    /**
     * 
     * 						Italy
     * 					
     * 
     */
    @XmlEnumValue("Italy")
    ITALY("Italy"),

    /**
     * 
     * 						Belgium (Dutch)
     * 					
     * 
     */
    @XmlEnumValue("Belgium_Dutch")
    BELGIUM_DUTCH("Belgium_Dutch"),

    /**
     * 
     * 						Netherlands
     * 					
     * 
     */
    @XmlEnumValue("Netherlands")
    NETHERLANDS("Netherlands"),

    /**
     * 
     * 						Spain
     * 					
     * 
     */
    @XmlEnumValue("Spain")
    SPAIN("Spain"),

    /**
     * 
     * 						Switzerland
     * 					
     * 
     */
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),

    /**
     * 
     * 						Taiwan
     * 					
     * 
     */
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),

    /**
     * 
     * 						eBay Motors
     * 					
     * 
     */
    @XmlEnumValue("eBayMotors")
    E_BAY_MOTORS("eBayMotors"),

    /**
     * 
     * 						Hong Kong
     * 					
     * 
     */
    @XmlEnumValue("HongKong")
    HONG_KONG("HongKong"),

    /**
     * 
     * 						Singapore
     * 					
     * 
     */
    @XmlEnumValue("Singapore")
    SINGAPORE("Singapore"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SiteCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteCodeType fromValue(String v) {
        for (SiteCodeType c: SiteCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}