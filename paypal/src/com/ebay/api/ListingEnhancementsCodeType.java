
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingEnhancementsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingEnhancementsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Border"/>
 *     &lt;enumeration value="BoldTitle"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Highlight"/>
 *     &lt;enumeration value="HomePageFeatured"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListingEnhancementsCodeType")
@XmlEnum
public enum ListingEnhancementsCodeType {


    /**
     * 
     * 						    Indicates whether an item will be displayed with a  border 
     * 						    that will go around the item (e.g., for category-based search 
     * 						    result page or store search that brings up multiple items) 
     * 						    to differentiate it from the rest of list.
     * 					
     * 
     */
    @XmlEnumValue("Border")
    BORDER("Border"),

    /**
     * 
     * 						   Indicates whether the bolding option was used. 
     * 					
     * 
     */
    @XmlEnumValue("BoldTitle")
    BOLD_TITLE("BoldTitle"),

    /**
     * 
     * 						   Indicates whether it is a featured item. 
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 						    Indicates item's listing is highlighted. 
     * 					
     * 
     */
    @XmlEnumValue("Highlight")
    HIGHLIGHT("Highlight"),

    /**
     * 
     * 						    Indicates item's listing is home page featured. 
     * 					
     * 
     */
    @XmlEnumValue("HomePageFeatured")
    HOME_PAGE_FEATURED("HomePageFeatured"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingEnhancementsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingEnhancementsCodeType fromValue(String v) {
        for (ListingEnhancementsCodeType c: ListingEnhancementsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
