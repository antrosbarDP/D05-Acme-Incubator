<%@page language="java"%>
<%@taglib prefix="jstl" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir ="/WEB-INF/tags"%>


<acme:form>
	<acme:form-textbox code="authenticated.technology-record.form.label.title" path="title" />
	<acme:form-textbox code="authenticated.technology-record.form.label.inventor" path="inventor" />
	<acme:form-textbox code="authenticated.technology-record.form.label.activitySector" path="activitySector" />
	<acme:form-integer code="authenticated.technology-record.form.label.stars" path="stars" />
	<acme:form-url code="authenticated.technology-record.form.label.contactEmail" path="contactEmail" />
	<acme:form-url code="authenticated.technology-record.form.label.website" path="website" />
	<acme:form-checkbox code="authenticated.technology-record.form.label.openSource" path="openSource" />
	<acme:form-textarea code="authenticated.technology-record.form.label.description" path="description" />
	
	
	<acme:form-return code="authenticated.technology-record.form.button.return"/>
</acme:form>