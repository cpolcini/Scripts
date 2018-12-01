package scripts.Auto_Farmer.api.types.ingame;

public enum PlantType {

	HERB("Herb"), ALLOTMENT("Allotment"), FLOWER("Flower"), HOPS("Hops"), BUSH("Bush"), TREE("Tree"), 
	FRUIT_TREE("Fruit Tree");

	private String plant_type;
	private int amount_planted;

	PlantType(String plant_type) {
		this.plant_type = plant_type;
		this.amount_planted = 0;
	}

	public String getType() {
		return this.plant_type;
	}

	public void incrementAmountPlanted() {
		this.amount_planted++;
		PlantType.total_planted++;
	}

	public int getAmountPlanted() {
		return this.amount_planted;
	}

	public static int getTotalNumberPlanted() {
		return total_planted;
	}

	private static int total_planted = 0;

	
}