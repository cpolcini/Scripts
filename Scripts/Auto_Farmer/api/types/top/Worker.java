package sripts.Auto_Farmer.api.types.top;

import scripts.Auto_Farmer.api.types.bottom.DescriptiveBoolean;

public interface Worker {

	public abstract DescriptiveBoolean shouldExecute();

	public abstract void execute();
	
}
