package com.bloff.demoWebAppOk.api;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JsonController {

	public String jsonReader(String word) throws JsonParseException, JsonMappingException, IOException {

//		ObjectMapper objectMapper = new ObjectMapper();
//
////		File file = new File("src/main/resources/sample.json");
//		File file = new File("sample.json");
//
////		Person person = objectMapper.readValue((file), Person.class);
//
//		InputStream is = Person.class.getResourceAsStream("/sample.json");
//		Person person = objectMapper.readValue(is, Person.class);
//		
		String name = null;
		String lastName = null;
		String age = null;
		String jasonString = null;
		
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("src/main/resources/sample2.json"));
			JSONObject jsonObject = (JSONObject)obj;
			name = (String)jsonObject.get("firstName");
			lastName = (String)jsonObject.get("lastName");
			age = (String)jsonObject.get("age");
			
			jasonString = jsonObject.toString();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		if (word.equals("name"))
			return name;
		else if(word.equals("lastName"))
			return lastName;
		else if(word.equals("age"))
			return age;
		return jasonString;
	}
	
	public String jsonReaderMapper() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();

//		File file = new File("src/main/resources/sample.json");
		File file = new File("sample2.json");

//		Person person = objectMapper.readValue((file), Person.class);

		InputStream is = Person.class.getResourceAsStream("/sample2.json");
		Person person = objectMapper.readValue(is, Person.class);
		
		String name = null;
		String lastName = null;
		String age = null;
		String jasonString = null;
		
		return person.getFirstName();
	}
	

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		JsonController jsonController = new JsonController();
		
		StringBuilder builder = new StringBuilder("Sample");
		
//		String text = jsonController.jsonReader("");
//		System.out.println(builder.append(text).toString());
		
		String n = "123456789";
		
		System.out.println(n.substring(4));
		
//		System.out.print(jsonController.jsonReader("lastName2"));
//		System.out.print(jsonController.jsonReaderMapper());
		
	}
}
