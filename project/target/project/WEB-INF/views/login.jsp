<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Slack</title>
</head>
<body ng-app="projectApp" ng-controller="LoginController as mainCtrl">
<div class="row">
${contextPath}
<!-- 	<aside class="col-sm-4"> -->
<div class="col-md-4 col-md-offset-4">
<div class="col-md-8 text-center">
<div class="login-panel panel panel-default">
          <div class="panel-heading">
              <h3 class="panel-title">Sign In</h3>
          </div>
          <div class="panel-body">
              <form role="form">
                  <fieldset>
                      <div class="form-group">
                          <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus="" ng-model="mainCtrl.user.email">
                      </div>
                      <div class="form-group">
                          <input class="form-control" placeholder="Password" name="password" type="password" value="" ng-model="mainCtrl.user.password">
                      </div>
                      <div class="checkbox">
                          <label>
                              <input name="remember" type="checkbox" value="Remember Me">Remember Me
                          </label>
                      </div>
                      <!-- Change this to a button or input when using this as a form -->
                      <a href="javascript:void(0)" ng-click="mainCtrl.authenticate()" class="btn btn-sm btn-success">Login</a>
                  </fieldset>
              </form>
          </div>
      </div>
</div>
</div> <!-- card.// -->
<!-- </aside> -->
</div>
<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css"/>">

<script src="<c:url value="/resources/js/lib/angular.min.js"/>"></script>
<script>var ctxPath = "${pageContext.request.contextPath}"</script>
<script src="<c:url value="/resources/js/lib/angular-resource.js"/>"></script>
<script src="<c:url value="/resources/js/lib/angular-route.js"/>"></script>
<script src="<c:url value="/resources/js/lib/jquery-1.11.0.min.js"/>"></script>
<script src="<c:url value="/resources/js/lib/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/app/angular_app.js"/>"></script>
<script src="<c:url value="/resources/js/app/controller/login_controller.js"/>"></script>
<script src="<c:url value="/resources/js/app/service/main_service.js"/>"></script>
</body>
</html>