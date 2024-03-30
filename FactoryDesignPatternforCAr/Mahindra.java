package FactoryDesignPatternforCAr;

public class Mahindra implements Car{
	@Override
	public void carName() {
		System.out.println("Thar");
		
	}

	@Override
	public void carType() {
		System.out.println("4 wheeler");
	}

	@Override
	public void carModel() {
		System.out.println("2023");
		
	}
}
