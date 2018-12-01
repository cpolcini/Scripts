package scripts.Auto_Farmer.api.types.ingame.plants;

public enum Herb {
	
	RANARR("ranarr", 207, 5295);
	
	private static final String[] ALL_HERBS = new String[] { RANARR.getHerb() };

	private String herb;
	private int herb_id;
	private int seed_id;
	
	Herb(String herb, int herb_id, int seed_id) {
		this.herb = herb;
		this.herb_id = herb_id;
		this.seed_id = seed_id;		
	}
	
	public String getHerb() {
		return herb;
	}
	
	public int getHerbID() {
		return herb_id;
	}
		
	public int getSeedID() {
		return seed_id;
	}
	
	public static String[] getAllHerbs() {
		return ALL_HERBS;
	}
}
