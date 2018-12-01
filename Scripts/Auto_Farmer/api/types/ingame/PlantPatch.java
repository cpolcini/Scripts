package scripts.Auto_Farmer.api.types.ingame;

import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSArea;

public enum PlantPatch {
	HERB(PlantType.HERB.getType(), Location.SOUTH_FALADOR, Location.CATHERBY, Location.AROUGNE, Location.PORT_PHASMATY, 
			Location.GREAT_KOUREND, Location.TROLLHEIM, Location.HARMONY_ISLAND, Location.WEISS);

	private PlantType plant_type;
	private Location[] areas;
	private RSArea plant_patch_area;

	PlantPatch(PlantType plant_type, Location... areas) {
		this.plant_type = plant_type;
		this.areas = areas;
	}

	public PlantType getPlantType() {
		return this.plant_type;
	}

	public RSArea getPlantPatchArea() {
		if (this.plant_patch_area != null)
			return this.plant_patch_area;
		int closest_distance = 100;
		RSArea area = null;
		for (Location x : areas) {
			RSArea pparea = x.getPlantPatchArea();
			int distance = Player.getPosition().distanceTo(pparea.getRandomTile());
			if (distance < closest_distance) {
				area = pparea;
				closest_distance = distance;
			}
		}
		this.plant_patch_area = area;
		return area;
	}
	
	public void setPlantPatchArea(Location plant_patch_area) {
		this.plant_patch_area = plant_patch_area;
	}

	public Location[] getAllPlantPatchAreas() {
		return this.areas;
	}

}
