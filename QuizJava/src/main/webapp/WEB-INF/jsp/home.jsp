<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<form action="home" method="post" name="myForm" id="accueilForm">
	<section class="main-wrap page-width forms" role="main">
		<header class="main-content-header clearfix">
			<h1>
				<s:property value="getText('accueil.titre')" />
			</h1>
		</header>
		<br />



		<div class="main-content l-grid">
			<div class="l-gr-col">
				<div class="">

					<div class="fs-content">
						<div class="l-grid frst-line">
							<div class="l-gr-col l-gr-col3">
								<strong><s:property value="getText('accueil.candidat.nom')" /></strong><label>${iaSession.nomCandidat}</label>
							</div>
	
							
		
												
							<div class="l-gr-col l-gr-col2">
								<input type="submit" class="btn"  name="startTest" value="<s:property value="getText('accueil.sartTest')"/>" />
							</div>
						</div>



						

					</div>



				</div>
			</div>
		</div>

	</section>

</form>