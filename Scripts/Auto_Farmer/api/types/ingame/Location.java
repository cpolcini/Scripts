import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

public enum Location {
	
	SOUTH_FALADOR(new RSArea(new RSTile[] {new RSTile(3057, 3313, 0), new RSTile(3060, 3313, 0), new RSTile(3057, 3310, 0), new RSTile(3060, 3310, 0), }), 8150),
	CATHERBY(new RSArea(new RSTile[] {new RSTile(2812, 3465, 0), new RSTile(2815, 3465, 0), new RSTile(2812, 3462, 0), new RSTile(2815, 3462, 0), }), 8151),
	AROUGNE(new RSArea(new RSTile[] {new RSTile(2669, 3376, 0), new RSTile(2272, 3376, 0), new RSTile(2269, 3373, 0), new RSTile(2272, 3373, 0), }), 8152),
	PORT_PHASMATY(new RSArea(new RSTile[] {new RSTile(3604, 3531, 0), new RSTile(3607, 3531, 0), new RSTile(3604, 3528, 0), new RSTile(3607, 3528, 0), }), 8153),
	GREAT_KOUREND(new RSArea(new RSTile[] {new RSTile(1817, 3484, 0), new RSTile(1820, 3484, 0), new RSTile(1817, 3481, 0), new RSTile(1820, 3481, 0), }), 0000),
	TROLLHEIM(new RSArea(new RSTile[] {new RSTile(2825, 3696, 0), new RSTile(2828, 3696, 0), new RSTile(2825, 3693, 0), new RSTile(2828, 3693, 1), }), 18816),
	HARMONY_ISLAND(new RSArea(new RSTile[] {new RSTile(0000, 0000, 1), new RSTile(0000, 0000, 1), new RSTile(0000, 0000, 1), new RSTile(0000, 0000, 1), }), 0000),
	WEISS(new RSArea(new RSTile[] {new RSTile(0000, 0000, 1), new RSTile(0000, 0000, 1), new RSTile(0000, 0000, 1), new RSTile(0000, 0000, 1), }), 0000);
	
	private RSArea plant_patch_area;
	private int plant_patch_id;

	Location(RSArea patch_area, int plant_patch_id) {
		this.plant_patch_area = plant_patch_area;
		this.plant_patch_id = plant_patch_id;
	}
	
	public RSArea getPlantPatchArea() {
		return this.plant_patch_area;
	}
	
	public int getPlantPatchId() {
		return this.plant_patch_id;
	}
}
