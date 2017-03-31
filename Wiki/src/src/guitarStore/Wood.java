package guitarStore;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	
	public String toString(){
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Indian Rosewood";
		case MAHOGANY:
			return "Indian Rosewood";
		case MAPLE:
			return "Indian Rosewood";
		case COCOBOLO:
			return "Indian Rosewood";
		case CEDAR:
			return "Indian Rosewood";
		case ADIRONDACK:
			return "Indian Rosewood";
		case ALDER:
			return "Indian Rosewood";
		case SITKA:
			return "Indian Rosewood";
		default:
			break;
		}

		return null;
	}
}
