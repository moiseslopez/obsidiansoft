(function() {
	'use strict';
	
	angular.module('projectApp').factory('MainService', MainService);
	
	MainService.$inject = ['$http', '$q'];
	
	function MainService($http,$q){
		var ENDPOINT = "http://localhost:8080/project";
		
		function authenticate(user) {
			console.log('In service, user : ' + JSON.stringify(user));
			var d = $q.defer();
			
			$http({
				method : 'POST',
				url : ENDPOINT + "/user/authenticate",
				data : user
			})
			.then(function success(response){
				d.resolve(response.data);
			}, function error(response) {
				d.reject(response);
			});
			
			return d.promise;
		}
		
		function loadInformation(userId) {
			var d = $q.defer();
			
			$http({
				method : 'GET',
				url : ENDPOINT + "/channel/info/" + userId
			})
			.then(function success(response){
				d.resolve(response.data);
			}, function error(response) {
				d.reject(response);
			});
			
			return d.promise;
		}
		
		function getUsers(id) {
			console.log('In service, user : ' + JSON.stringify(user));
			var d = $q.defer();
			var user = {
					userName : "mlopez",
					email : "email",
					password : "pass"
			}
			$http({
				method : 'POST',
				url : ENDPOINT + "/channel/usuarios",
				data : user
			})
			.then(function success(response){
				d.resolve(response.data);
			}, function error(response) {
				d.reject(response);
			});
			
			return d.promise;
		}
		
		return {
			authenticate : authenticate,
			getUsers : getUsers,
			loadInformation : loadInformation
		}
	}
})();