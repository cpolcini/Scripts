package sripts.Auto_Farmer.api.types.top;

import scripts.Auto_Farmer.api.types.bottom.workers.Banker;
import scripts.Auto_Farmer.api.types.bottom.workers.Farmer;
import scripts.Auto_Farmer.api.types.bottom.workers.HouseEnterer;
import scripts.Auto_Farmer.api.types.bottom.workers.InventoryManager;
import scripts.Auto_Farmer.api.types.bottom.workers.Traveler;

public enum WorkerFactory {

	BANKER {
		@Override
		public Worker getWorker() {
			return new Banker();
		}
	},
	FARMER {
		@Override
		public Worker getWorker() {
			return new Farmer();

		}
	},
	TRAVELER {
		@Override
		public Worker getWorker() {
			return new Traveler();
		}
	},
	INVENTORY_MANAGER {
		@Override
		public Worker getWorker() {
			return new InventoryManager();
		}
	},
	HOUSE_ENTERER {

		@Override
		public Worker getWorker() {
			return new HouseEnterer();
		}

	};

	public abstract Worker getWorker();
