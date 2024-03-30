package FactoryDesignPatternforCAr.CarFactory;

import FactoryDesignPatternforCAr.Car;
import FactoryDesignPatternforCAr.Mahindra;
import FactoryDesignPatternforCAr.Tata;

public class CarFactory {
	public static Car getCar(String carType)
	{
		if(carType.equalsIgnoreCase("Tata"))
		{
			return new Tata("SUMO", "4 wheeler", "2023");
		}else if(carType.equalsIgnoreCase("mahindra"))
		{
			return new Mahindra();
		}
		
		
		return null;
		
		
	}
}
