package FactoryDesignPatternforCAr;

public class Tata implements Car{

	public String carName;
	public String carType;
	public String carModel;
	
	
	public Tata(String carName, String carType, String carModel) {
		super();
		this.carName = carName;
		this.carType = carType;
		this.carModel = carModel;
	}

	@Override
	public void carName() {
		this.carName = carName;
		
	}

	@Override
	public void carType() {
		this.carType = carType;
	}

	@Override
	public void carModel() {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Tata [carName=" + carName + ", carType=" + carType + ", carModel=" + carModel + "]";
	}
	

}
