package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONObject;

import main.Main;

public class FileUtils {

	public static void createFileDA(String filename) {
		try {
			File myObj = new File(filename);
			if(myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				initDarknessAblazeFile(Main.getDarknessAblazeFilename());
				System.out.println("Card list initiated");
			}else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readCardsFromFile(String filename) {
		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				JSONObject temp = new JSONObject(data);
				Main.getDarknessAblazeCardList().add(temp);
			}
			myReader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateCardsInFile(String filename, ArrayList<JSONObject> obj) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
			for(int i = 0; i < obj.size(); i++) {
				out.write(obj.get(i).toString());
				out.newLine();
			}
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void appendStrToFile(String filename, String str) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
			out.write(str);
			out.newLine();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initDarknessAblazeFile(String filename) {
		appendStrToFile(filename, "{\"name\":\"Butterfree V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Butterfree VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Paras\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Parasect\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Carnivine\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pansage\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Simisage\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Karrablast\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Shelmet\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Accelgor\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rowlet\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Dartrix\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Decidueye\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Bounsweet\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Steenee\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Tsareena\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Wimpod\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Golisopod\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Charizard V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Charizard VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Houndoom V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Torchic\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Combusken\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Blaziken\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Heatran\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pansear\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Simisear\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Darmanitan\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Larvesta\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Volcarona\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Fletchinder\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Talonflame\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Centiskorch V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Centiskorch VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Mr. Mime\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Mr. Rime\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Suicune\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Feebas\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Milotic\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Relicanth\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Panpour\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Simipour\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Darumaka\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Darmanitan\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Vanillite\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Vanillish\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Vanilluxe\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Cubchoo\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Beartic\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Wishiwashi\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Mareanie\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Toxapex\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Dracovish\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Arctovish\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Mareep\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Flaffy\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Ampharos\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Electrike\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Manectric\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Vikavolt V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Tapu Koko\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Toxel\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Toxtricity\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pincurrchin\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Dracozolt\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Arctozolt\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Jigglypuff\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Wigglytuff\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Mew V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Snubbull\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Granbull\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Lunatone\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Gothita\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Gothorita\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Golett\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Golurk\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Dedenne\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Morelull\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Shiinotic\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Mimikyu\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Sinistea\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Polteageist\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Diglett\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Dugtrio\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Larvitar\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pupitar\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Tyranitar\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Trapinch\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Vibrava\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Flygon\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Solrock\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Hippopotas\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Hippowdon\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rhyperior V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Diggersby\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Passimian\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Sirfetch'd\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Slowbro V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Grimer\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Muk\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Spinarak\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Ariados\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Crobat V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Darkrai\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Purrloin\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Liepard\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Deino\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Zweilous\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Hydreigon\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Hoopa\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Nickit\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Thievul\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Grimsnarl V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Grimsnarl VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Eternatus V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Eternatus VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Scizor V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Scizor VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Skarmory\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Aaron\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Lairon\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Aggron\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Escavalier\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Klink\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Klang\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Klinklang\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Stunfisk V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Meltan\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Melmetal\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Cufant\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Copperajah\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Kangaskhan\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Tauros\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Sentret\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Furret\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Dunsparce\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Teddiursa\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Ursaring\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Lugia\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Skitty\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Delcatty\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Salamence V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Salamence VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Starly\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Staravia\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Staraptor\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Ducklett\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Swanna\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Bunnelby\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Fletchling\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Skwovet\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Greedent\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rokidee\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Corvisquire\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Corviknight\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Big Paasol\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Billowing Smoke\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Bird Keeper\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Cape of Toughness\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Familiar Bell\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Glimwood Tangle\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Kabu\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Old PC\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Piers\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pokemon Breeder's Nurturing\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rare Fossil\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rose\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rose Tower\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Spikemuth\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Struggle Gloves\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Turbo Patch\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Yell Horn\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Heat Energy\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Hiding Energy\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Powerful Energy\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Butterfree V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Houndoom V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Centiskorch V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Vikavolt V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rhyperior V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Crobat V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Scizor V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Galarian Stunfisk V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Salamence V\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Kabu\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Piers\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pokemon Breeder's Nurturing\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rose\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Butterfree VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Centiskorch VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Eternatus VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Scizor VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Salamence VMAX\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Pokemon Breeder's Nurturing\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rose\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Rillaboom\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Coalossal\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Big Parasol\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Turbo Patch\",\"obtained\":false}");
		appendStrToFile(filename, "{\"name\":\"Capture Energy\",\"obtained\":false}");
	}
	
	//Saves changes when program closes
	public static void saveDarknessAblazeChangesToFile(String filename) {
		try {
			PrintWriter writer = new PrintWriter(filename);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < Main.getDarknessAblazeCardList().size(); i++) {
			appendStrToFile(filename, Main.getDarknessAblazeCardList().get(i).toString());
		}
	}
}
