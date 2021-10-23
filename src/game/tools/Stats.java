package game.tools;

public class Stats {
	
	static int davorVinst = 0;
	static int userVinst = 0;
	
	public static void updateStats(int id) {
		if(id == 0) davorVinst++;
		else userVinst++;
	}
	
	public static int[] getStats() {
		
		int[] stats = new int[2];
		stats[0] = davorVinst;
		stats[1] = userVinst;
		return stats;
	}
}
