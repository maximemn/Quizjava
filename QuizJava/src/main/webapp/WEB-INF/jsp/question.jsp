<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
">
<header class="main-content-header clearfix">
	<h1>
		<s:property value="getText('accueil.titre')" />
	</h1>
</header>
<br />
<h1>
	<s:property value="question" />
</h1>
<form  method="post" name="myForm2"
	id="questionForm">
	<s:iterator value="answers" var="item">

		<input type="radio" name="answer" />
		<label><s:property value="#item" /> </label>
		<br>
	</s:iterator>
	<br>
	<input type="submit" class="btn" name="precedentBtn"
		value="<s:property value="getText('acceuil.question.precedente')"/>" action="previousQuestion" />
	<input type="submit" class="btn" name="suivantBtn"
		value="<s:property value="getText('acceuil.question.suivante')"/>" action="previousQuestion"/>
	

</form>



