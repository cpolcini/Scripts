package scripts.Auto_Farmer.api.types.bottom.progression;

import scripts.Auto_Farmer.api.types.ingame.PlantPatch;
import scripts.Auto_Farmer.api.types.variables.Vars;

public abstract class ProgressionMove {
	
	private HerbPatch next_plant_patch;
	
	public ProgressionMove(PlantPatch next_plant_patch) {
		this.next_plant_patch = next_plant_patch;
	}
	
	public abstract boolean shouldProgress();

	public PlantPatch getNextPlantPatch() {
		return this.next_plant_patch;
	}

	protected boolean genericProgressionTest() {
		return Vars.get().current_location != this.next_plant_patch;
	}	
}
