package main;

import java.util.ArrayList;

import org.json.JSONObject;

import utils.FileUtils;

public class Main {

	private static String darknessAblazeFilename = "darknessablaze.txt";
	private static ArrayList<JSONObject> darknessAblazeCards = new ArrayList<JSONObject>();
	
	public static void main(String aregs[]) {
		FileUtils.createFileDA(darknessAblazeFilename);
		FileUtils.readCardsFromFile(darknessAblazeFilename);
	}
	
	public static ArrayList<JSONObject> getDarknessAblazeCardList(){
		return darknessAblazeCards;
	}
	
	public static String getDarknessAblazeFilename() {
		return darknessAblazeFilename;
	}
	
}
