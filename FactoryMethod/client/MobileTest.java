package FactoryMethod.client;

import FactoryMethod.Factory.mobileFactory;
import FactoryMethod.Interface.Mobile;

public class MobileTest {
	public static void main(String[] args) {
		Mobile sony = mobileFactory.getMobile("Sony");
		String mobileName = sony.mobileName();
		double mobilePrice = sony.mobilePrice();
		System.out.println(mobileName+" = Rs."+mobilePrice);
		Mobile mobile = mobileFactory.getMobile("Samsung");
		String mobileName2 = mobile.mobileName();
		double mobilePrice2 = mobile.mobilePrice();
		System.out.println(mobileName2+" = Rs."+mobilePrice2);
	}
}
