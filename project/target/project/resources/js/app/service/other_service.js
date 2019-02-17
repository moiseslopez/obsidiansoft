(function() {
	'use strict';
	
	angular.module('projectApp').service('OtherService', OtherService);
	
	OtherService.$inject = ['$http', '$q'];
	
	function OtherService($http,$q){
		var ENDPOINT = "/api/atencion";
		
		function something() {
			console.log('In service');
//			var d = $q.defer;
//			
//			$http({
//				method : 'PUT',
//				url : ENDPOINT,
//				data : data
//			})
//			.then(function success(response){
//				d.resolve(response.data)
//			}, function error(response) {
//				d.reject(response);
//			});
//			return d.promise;
		}
	}
})