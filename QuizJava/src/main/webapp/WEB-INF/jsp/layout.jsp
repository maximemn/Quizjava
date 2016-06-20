<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>

<html dir="ltr" lang="fr" class="no-js">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=9" />
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
		<meta name="viewport" content="width=device-width, initial-scale=1" />

		<link href="/coecs/assets/toolbox/img/favicons/favicon.ico" rel="shortcut icon" />
		<link href="/coecs/assets/toolbox/img/icons/icons.png" rel="shortcut icon" />
		<link href="/coecs/assets/toolbox/css/master.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/main.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/govbar.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/menuform.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/jquery.ui.theme.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/forms.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/datatables.css" rel="stylesheet" />
		<link href="/coecs/assets/toolbox/css/alerts.css" rel="stylesheet" />

		<!-- Add your site or application custom CSS here :
		<link href="custom/css/custom.css" rel="stylesheet" />-->
		<link href="/coecs/assets/custom/css/forms.css" rel="stylesheet" />
		<link href="/coecs/assets/custom/css/alerts.css" rel="stylesheet" />
		<!-- Modernizr : Only javascript that should be loaded in head section -->
		<script src="/coecs/assets/toolbox/js/vendor/modernizr-2.6.2.min.js"></script>

	</head>

	<body>
	
		<tiles:insertAttribute name="body" />

		<!-- Toolbox javascript here -->
		<script src="/coecs/assets/toolbox/js/vendor/jquery-1.7.1.min.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.core.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.widget.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.datepicker.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.position.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.menu.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.selectmenu.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.ui.popup.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.maxlength.min.js"></script>
		<script src="/coecs/assets/toolbox/js/vendor/jquery.bpopup.min.js"></script>

		<script type="text/javascript" src="/coecs/assets/toolbox/js/globalize/globalize.js"></script>



		<script src="/coecs/assets/toolbox/js/jquery.forms.js"></script>
		<script src="/coecs/assets/custom/js/jquery.forms.js"></script>
		<script src="/coecs/assets/custom/js/jquery.histo.js"></script>



	
	</body>
</html>