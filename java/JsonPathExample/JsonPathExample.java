package Instabug.InstabugAutomation;

import com.jayway.jsonpath.JsonPath;

public class JsonPathExample {
	//This method to take json as string and specific path to return true if the path is not equal null
	//And returns false in case the path is not exist
	public static boolean jsonPathIsExist(String json, String path){
		String value = getJsonPathValue(json, path);
		if (value != null){
			return true;
		}
		return false;
	}
	//This method to take json as string and specific path and returns path value
	//In case the path is not exist, it returns null
	public static String getJsonPathValue (String json, String path){
		try {
			String value = JsonPath.parse(json).read("$." + path);
			return value;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	//Example how to use the previous 2 methods
    public static void main( String[] args ){
    	//The json as string
    	String json = "{\n" +
                "\"fr\":{\n" +
                "\t\"id\":\"123\",\n" +
                "\t\"name\":\"adam\"\n" +
                "},\n" +
                "\"items\":[\n" +
                "\t{\n" +
                "\t\t\"fr\":{\n" +
                "\t\t\t\"id\":\"123\",\n" +
                "\t\t\t\"name\":\"john\"\n" +
                "\t\t\t}\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"fr\":{\n" +
                "\t\t\t\"id\":\"456\",\n" +
                "\t\t\t\"name\":\"ali\"\n" +
                "\t\t\t}\n" +
                "\t}\n" +
                "\t],\n" +
                "\"password\":\"\",\n" +
                "\"projectKey\":\"\",\n" +
                "\"domain\":\"\",\n" +
                "\"type\":\"\",\n" +
                "\"priority\":\"\",\n" +
                "\"Enable\":false,\n" +
                "\"email\":\"\"\n" +
                "}";
    	//Array of json paths
    	String [] paths = {"fr.id", "items[5].fr.id", "password", "nn", "pp"};
    	//Iterate over the paths array to check each element is exist or not
    	for(String path : paths){
    		System.out.println("path >> " + path + " : " + String.valueOf(jsonPathIsExist(json, path)));
    	}
    }
}
