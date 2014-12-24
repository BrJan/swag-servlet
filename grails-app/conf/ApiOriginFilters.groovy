
class ApiOriginFilters {

	def filters = {
		addHeader(uri: '/*') {
			after = {
				response.addHeader("Access-Control-Allow-Origin:", "*")
				response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
				response.addHeader("Access-Control-Allow-Headers", "Content-Type");
			}
		}
	}
	
}
