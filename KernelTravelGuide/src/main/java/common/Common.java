package common;

public class Common {
	public static String ruleOfPrice (String price) {
		if(price == null) {
			return "0";
		} else {
			return price;
		}
	}
}
