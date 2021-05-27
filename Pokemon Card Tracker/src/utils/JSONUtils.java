package utils;

import org.json.JSONObject;

import main.Main;

public class JSONUtils {

	public static JSONObject createCardJSONObject(String name, boolean obtained) {
		JSONObject obj = new JSONObject();
		
		obj.put("name", name);
		obj.put("obtained", obtained);
		
		return obj;
	}
	
	public static String getCardName(JSONObject obj) {
		String name = obj.getString("name");
		return name;
	}
	
	public static boolean getObtained(JSONObject obj) {
		boolean obtained = obj.getBoolean("obtained");
		return obtained;
	}
	
	public static void updateObtained(String cardname, boolean obtained) {
		for(int i = 0; i < Main.getDarknessAblazeCardList().size(); i++) {
			if(Main.getDarknessAblazeCardList().get(i).get("name").equals(cardname)) {
				Main.getDarknessAblazeCardList().get(i).remove("obtained");
				Main.getDarknessAblazeCardList().get(i).put("obtained", obtained);
			}
		}
	}
	
}
