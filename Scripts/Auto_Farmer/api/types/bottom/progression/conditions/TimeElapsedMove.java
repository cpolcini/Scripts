package scripts.Auto_Farmer.api.types.bottom.progression.conditions;

import org.tribot.api.General;
import org.tribot.api.Timing;

import scripts.Herb_Farmer.api.types.bottom.progression.ProgressionMove;
import scripts.Herb_Farmer.api.types.ingame.HerbPatch;
import scripts.woodcutter.api.types.variables.Vars;

public class TimeElapsedMove extends ProgressionMove {

	private long time;

	public TimeElapsedMove(HerbPatch next_herb_patch, double hours) {
		super(next_herb_patch);
		long temp = (long) (hours * 3600);
		this.time = (long) General.randomDouble(temp - (temp * .05), temp
				+ (temp * .05));
	}

	@Override
	public boolean shouldProgress() {
		return Vars.get().last_location_change + time >= System
				.currentTimeMillis() && super.genericProgressionTest();
	}

	@Override
	public String toString() {
		return Timing.msToString(time);
	}
}