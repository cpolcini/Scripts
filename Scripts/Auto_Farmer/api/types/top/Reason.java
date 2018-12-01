package sripts.Auto_Farmer.api.types.top;

public enum Reason {
	
	UNKNOWN(null), NEED_TO_NOTE_ITEMS(WorkerFactory.INVENTORY_MANAGER), NEED_TO_DROP_WEEDS(WorkerFactory.INVENTORY_MANAGER),
	NEED_TO_BANK(WorkerFactory.BANKER), NEED_TO_FARM(WorkerFactory.FARMER), NEED_TO_TRAVEL(WorkerFactory.TRAVELER),
	NEED_TO_ENTER_HOUSE(WorkerFactory.HOUSE_ENTERER);
	
	private WorkerFactory Factory;

	Reason(WorkerFactory Factory) {
		this.Factory = Factory;
	}

	public Worker getNextWorker() {
		if (Factory == null)
			return null;
		return Factory.getWorker();
	}
}
