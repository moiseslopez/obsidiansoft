<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="projectApp" ng-controller="MainController as channelCtrl">
<div class="row">
  <div class="col-xs-12 col-sm-4">

    <div class="panel panel-primary">
      <div class="panel-heading">Channels</div>
      <div class="panel-body">
        Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a
        lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test
        Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with
        a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.Test Content with a lot of stuff.
      </div>
    </div>

    <div class="panel panel-primary">
      <div class="panel-heading">Users</div>
      <div class="panel-body">Test Content</div>
    </div>

  </div>

  <div class="col-xs-12 col-sm-8">
    <div class="panel panel-primary">
      <div class="panel-heading">Hardware Trouble Shooting</div>
      <div id="map" class="panel-body fill">Test Content</div>
    </div>
	</div>
</div>
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/styles.css"/>">
<script src="<c:url value="/resources/js/lib/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/lib/angular-resource.js"/>"></script>
<script src="<c:url value="/resources/js/lib/angular-route.js"/>"></script>
<script src="<c:url value="/resources/js/lib/jquery-1.11.0.min.js"/>"></script>
<script src="<c:url value="/resources/js/lib/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/app/angular_app.js"/>"></script>
<script src="<c:url value="/resources/js/app/controller/main_controller.js"/>"></script>
<script src="<c:url value="/resources/js/app/service/main_service.js"/>"></script>
</body>
</html>