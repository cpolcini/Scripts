
public enum FarmRunItem {

	MAGIC_SECATEURS(7409), RAKE(5341), SEED_DIBBER(5343), SPADE(952), ULTRACOMPOST(21483), SUPERCOMPOST(6034), 
	LAW_RUNE(563), FIRE_RUNE(554), WATER_RUNE(555), AIR_RUNE(556),EARTH_RUNE(557), 
	DUST_BATTLESTAFF(20736);
	
	private int id;

	FarmRunItem(int id) {
		this.id = id;
	}
	
	public int getFarmRunItem() {
		return id;
	}
}
