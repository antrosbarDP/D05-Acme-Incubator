<%@page language="java"%>
<%@taglib prefix="jstl" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir ="/WEB-INF/tags"%>


<acme:list readonly="false">
	<acme:list-column code="authenticated.overture.list.label.title" path="title" width="20%" />
	<acme:list-column code="authenticated.overture.list.label.contactEmail" path="contactEmail" width="20%" />
	<acme:list-column code="authenticated.overture.list.label.deadline" path="deadline" width="60%" />
</acme:list>