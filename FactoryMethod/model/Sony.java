package FactoryMethod.model;

import FactoryMethod.Interface.Mobile;

public class Sony implements Mobile {

	@Override
	public String mobileName() {
		return "sony";
	}

	@Override
	public double mobilePrice() {
		return 25000.99;
	}

}
