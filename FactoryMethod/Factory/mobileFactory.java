package FactoryMethod.Factory;

import FactoryMethod.Interface.Mobile;
import FactoryMethod.model.Samsung;
import FactoryMethod.model.Sony;

public class mobileFactory {
	public static Mobile getMobile(String mobileType) {
//		switch (mobileType) {
//		case "Samsung":
//			return new Samsung();
//		case "Sony":
//			return new Sony();
//		default:
//			throw new RuntimeException("Invalid type!!!");
//		}
		
		if(mobileType.trim().equalsIgnoreCase("samsung"))
		{
			return new Samsung();
		}else if(mobileType.trim().equalsIgnoreCase("Sony"))
		{
			return new Sony();
		}
		return null;
	}

}
