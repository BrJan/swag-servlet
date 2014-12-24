package org.example
import com.wordnik.swagger.annotations.*;
import grails.converters.JSON
@Api(value="/author", description = "author service", produces = 'application/json,application/xml,text/html')
class AuthorController {
	
	//Added a comment
	@ApiOperation(httpMethod = "GET", value = "Resource to get a author")
    def index() {
		Map indexResponse = ["message": "Hi There"] 
		 render indexResponse as JSON
	}
	
	@ApiOperation(httpMethod = "POST", value = "Resource to save an author")
	def save() {
		
	}
	
}
