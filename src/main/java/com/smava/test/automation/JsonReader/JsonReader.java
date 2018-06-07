package com.smava.test.automation.JsonReader;



import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



public class JsonReader {
	private static ObjectMapper mapper;
	static{
	mapper=new ObjectMapper();
	}
	public static <T>T convertJsonToJava(File fi,Class<T> cls){
		T result=null;
		try{
			
			result=mapper.readValue(fi, cls);
			}
			catch(JsonParseException e){
			e.printStackTrace();
			}catch(JsonMappingException e){
			e.printStackTrace();
			}catch(IOException e){
			e.printStackTrace();
			}

		return result;
	}

}
