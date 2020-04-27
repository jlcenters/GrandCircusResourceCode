package gcdemos.fileio;

/**
 * An implementation of LineConverter that converts Player objects
 */
public class PlayerLineConverter implements LineConverter<Player> {

	@Override
	public String toLine(Player player) {	//toFile
		return String.format("%s\t%d\t%s", player.getName(),player.getJerseyNum(),player.getTeamName());
	}

	@Override
	public Player fromLine(String line) {	//fromFile
		String[] parts = line.split("\t");
		String name = parts[0];
		int jerseyNum = Integer.parseInt(parts[1]);
		String teamName = parts[2];
		return new Player(name,jerseyNum,teamName);
	}

}
