<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData" %>
<%@ attribute name="entry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData" %>
<%@ attribute name="quantity" required="true" %>
<%@ attribute name="addons" required="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>



<div class="popupCartItem">
	<div class="itemThumb"><product:productPrimaryImage product="${product}" format="cartIcon"/></div>
	<div class="itemDesc">
		<div class="itemName"><c:out value="${product.name}" /></div>
		<div class="itemQuantity"><span class="label"><spring:theme code="popup.cart.quantity.added"/></span>${quantity}</div>
		
		<%-- <div class="addonsList"> <c:out value="${selectedAddons}" /> <br></div> --%>
		</div>
		Selected Add-ons:-
		<c:forEach items="${selectedAddons}" var="addons">
		${addons}
		<br>
		</c:forEach>
		<%-- ${selectedAddons} --%>
		
			<c:forEach items="${product.baseOptions}" var="baseOptions">
				<c:forEach items="${baseOptions.selected.variantOptionQualifiers}" var="baseOptionQualifier">
					<c:if test="${baseOptionQualifier.qualifier eq 'style' and not empty baseOptionQualifier.image.url}">
						<div class="itemColor">
							<span class="label"><spring:theme code="product.variants.colour"/></span>
							<img src="${baseOptionQualifier.image.url}"  alt="${baseOptionQualifier.value}" title="${baseOptionQualifier.value}"/>
						</div>
					</c:if>
					<c:if test="${baseOptionQualifier.qualifier eq 'size'}">
						<div class="itemSize">
							<span class="label"><spring:theme code="product.variants.size"/></span>
							${baseOptionQualifier.value}
						</div>
					</c:if>
				</c:forEach>
			</c:forEach>
		<div class="itemPrice">
			<c:choose>
				<c:when test="${not empty product.variantType and (product.priceRange.minPrice.value ne product.priceRange.maxPrice.value)}">
					<format:price priceData="${product.priceRange.minPrice}"/> - <format:price priceData="${product.priceRange.maxPrice}"/>
				</c:when>
				<c:otherwise>
					<format:price priceData="${entry.basePrice}"/>
				</c:otherwise>
			</c:choose>
		</div>
	</div>

