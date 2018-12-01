package scripts.Auto_Farmer.api.types.bottom.progression;

public enum ProgressionMoveType {

	HERBS_PICKED("Number of Herbs"), SEEDS_PLANTED("Seeds Planted"), TIME_ELAPSED("Time(Hours) ie 1.5")
	
	private String label_text;

	ProgressionMoveType(String label_text) {
		this.label_text = label_text;
	}

	public String getLabelText() {
		return this.label_text;
	}	
}
