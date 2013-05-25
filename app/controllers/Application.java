package controllers;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void addNewPersonAndRelation() {
		render();
	}

	public static void listFamilyTree() {
		render();
	}

	public static void parseJson() {
		
//		List<String> names = new ArrayList<String>();
//		List<String> ids = new ArrayList<String>();
//		JSONArray array = new JSONArray(jsonString);
//		for (int i = 0; i < array.length(); i++) {
//			JSONArray subArray = (JSONArray) array.get(i);
//			String name = (String) subArray.get(0);
//			names.add(name);
//			String id = (String) subArray.get(1);
//			ids.add(id);
//		}
//
//		// to convert the lists to arrays
//		String[] nameArray = names.toArray(new String[0]);
//		String[] idArray = ids.toArray(new String[0]);
		render();
	}
}