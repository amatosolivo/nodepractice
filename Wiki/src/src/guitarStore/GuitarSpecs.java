package guitarStore;

public class GuitarSpecs {
	String model;
	Builder builder;
	Type type;
	int numStrings;
	Wood backWood, topWood;

	public GuitarSpecs(String model, Builder builder, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public boolean matches(GuitarSpecs otherSpec) {
		String model = otherSpec.getModel().toLowerCase();
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel()))) {
			return false;
		}

		if (builder != otherSpec.getBuilder()) {
			return false;
		}

		if (type != otherSpec.getType()) {
			return false;
		}
		
		if (numStrings != otherSpec.getNumStrings()) {
			return false;
		}

		if (backWood != otherSpec.getBackWood()) {
			return false;
		}

		if (topWood != otherSpec.getTopWood()) {
			return false;
		}
		return true;
	}
}
