package scripts.Auto_Farmer.api.types.bottom;

import scripts.Auto_Farmer.api.types.top.Reason;

public class DescriptiveBoolean {

	private boolean bool;
	private Reason reason;

	public DescriptiveBoolean(boolean bool, Reason reason) {
		this.bool = bool;
		this.reason = reason;
	}

	public boolean getBoolean() {
		return this.bool;
	}

	public Reason getReason() {
		return this.reason;
	}
}