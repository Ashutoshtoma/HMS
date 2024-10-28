package api;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Deserialization {
	void serializations() {
		pojo_postRequest p = new pojo_postRequest();
		p.setName("AAAshutosh");
		p.setGender("Male");
		p.setEmail("Aaaashu@456gmail.com");
		p.setStatus("Active");
		
		ObjectMapper m = new ObjectMapper();
		String s1 = p.writerWithDefaultPrettyPrinter().writerValueAsString();
		System.out.println(s1);
	}
	
	

}
