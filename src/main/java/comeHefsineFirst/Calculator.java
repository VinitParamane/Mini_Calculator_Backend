package comeHefsineFirst;
import java.util.HashMap;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
@CrossOrigin
@RestController
public class Calculator{

	
	
	
	
        @RequestMapping("add{num1}and{num2}")
	    public int add(@PathVariable int num1,@PathVariable int num2)
	        {
		return num1+num2;
		}
		
		@RequestMapping("sub{num1}and{num2}")
	    public int sub(@PathVariable int num1,@PathVariable int num2)
	        {
			int result=num1-num2; 
		return result;
		}
		
		@RequestMapping("mult{num1}and{num2}")
	    public int mult(@PathVariable int num1,@PathVariable int num2)
	        {
		return num1*num2;
		}
		
		@RequestMapping("div{num1}and{num2}")
	    public String div(@PathVariable int num1,@PathVariable int num2)
	        {

			try {
				String s="";
				int z=num1/num2;
				
				return Integer.toString(z);
				
				
				
		  
		}
			catch(Exception e)
			{
				String s="Error";
				
				System.out.println(e.getStackTrace());
				return s;
			}
			
	        }
		
	}

