package FactoryMethod.model;

import FactoryMethod.Interface.Mobile;

public class Samsung implements Mobile {

	@Override
	public String mobileName() {
		return "Galuxy Due 7";
	}

	@Override
	public double mobilePrice() {
		return 13500.55;
	}

}
