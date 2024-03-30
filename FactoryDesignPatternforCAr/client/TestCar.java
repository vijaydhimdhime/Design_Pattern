package FactoryDesignPatternforCAr.client;

import FactoryDesignPatternforCAr.Car;
import FactoryDesignPatternforCAr.Mahindra;
import FactoryDesignPatternforCAr.Tata;
import FactoryDesignPatternforCAr.CarFactory.CarFactory;

public class TestCar {
	public static void main(String[] args) {
//		Car car = new Tata("Harier", "four wheeler", "2022");
//		System.out.println(car);
//		Car mahindra = new Mahindra();
//		mahindra.carName();
//		mahindra.carType();
//		mahindra.carModel();
		Car tata = CarFactory.getCar("tata");
		System.out.println(tata);
		Car MAHINDRA = CarFactory.getCar("MAHINDRA");
		MAHINDRA.carName();
		MAHINDRA.carType();
		MAHINDRA.carModel();
	}
}
