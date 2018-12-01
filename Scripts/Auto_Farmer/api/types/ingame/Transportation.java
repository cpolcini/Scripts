package scripts.Auto_Farmer.api.types.ingame;

public enum Transportation {
	
	ECTOPHIAL()

	private String transportation_option;
	private int transportation_id;
	
	Transportation(String transportation_option, int transportation_id;) {
		this.transportation_option = transportation_option;
		this.transportation_id = transportation_id;
	}
	
	public String getTransportationOption() {
		return this.transportation_option;
	}
	
}
