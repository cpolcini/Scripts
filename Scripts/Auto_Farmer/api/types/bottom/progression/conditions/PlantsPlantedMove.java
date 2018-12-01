package scripts.Auto_Farmer.api.types.bottom.progression.conditions;

import scripts.Auto_Farmer.api.types.bottom.progression.ProgressionMove;
import scripts.Auto_Farmer.api.types.ingame.HerbPatch;
import scripts.Auto_Farmer.api.types.variables.Vars;

public class PlantsPlantedMove extends ProgressionMove {

	private int plants_planted;

	public PlantsPlantedMove(PlantPatch next_plant_patch, int plants_planted) {
		super(next_plant_patch);
		this.plants_planted = plants_planted;
	}

	@Override
	public boolean shouldProgress() {
		return Vars.get().current_location.getPlantType().getPlantsPlanted() >= plants_planted
				&& super.genericProgressionTest();
	}

	@Override
	public String toString() {
		return this.plants_planted + " plants planted";
	}
}