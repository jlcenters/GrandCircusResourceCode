package gcdemos.fileio;

import java.util.Arrays;
import java.util.List;

public class PlayersApp {

	// FileHelper constructor requires file path and a line converter.
	private static FileHelper<Player> helper = new FileHelper<>(		//TO USE: COPY FILEHELPER; DO STRINGPARSE; STRING FORMAT
			"players.txt", new PlayerLineConverter());

	public static void main(String[] args) {
		
		helper.rewrite(Arrays.asList(new Player("Kortana", 12,"The Guys"), new Player("Breeze", 3,"Ritual")));
	
		helper.append(new Player("Ronda", 77,"The Kicks"));
		helper.append(new Player("Billie", 34,"The Cools"));
		
		List<Player> players = helper.readAll();
		for (Player p : players) {
			System.out.println(p);
		}
	}
	
	
}