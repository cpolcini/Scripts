package scripts.Auto_Farmer.api.types.bottom.workers;

import org.tribot.api2007.WebWalking;

import scripts.Auto_Farmer.api.types.bottom.DescriptiveBoolean;
import scripts.Auto_Farmer.api.types.ingame.PlantPatch;
import scripts.Auto_Farmer.api.types.top.Reason;
import scripts.Auto_Farmer.api.types.top.Worker;
import scripts.Auto_Farmer.api.types.variables.Vars;

public class Progressor implements Worker {

	@Override
	public void execute() {
		moveToNewArea(Vars.get().progression_type.getNextMove());
	}

	private void moveToNewArea(PlantPatch plant_patch) {
		System.out.println("Moving to "+plant_patch);
		WebWalking.walkTo((Vars.get().current_location = plant_patch).getPlantPatchArea()
				.getRandomTile());
		Vars.get().last_location_change = System.currentTimeMillis();
	}

	@Override
	public DescriptiveBoolean shouldExecute() {
		if (!Vars.get().progression_type.shouldProgress())
			return new DescriptiveBoolean(false, Reason.NEED_TO_FARM);
		return new DescriptiveBoolean(true, null);
	}

}