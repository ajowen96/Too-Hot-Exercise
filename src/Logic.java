
public class Logic {

	public static boolean tooHot(int temperature, boolean isSummer) {
		boolean result = true;
		if (temperature >= 60 && temperature <= 100 && isSummer == true) {
			result = true;
		}
		else if (temperature >= 60 && temperature <= 90 && isSummer == false) {
			result = true;
		}
		else if (temperature < 60 || temperature > 100 && isSummer == true) {
			result = false;
		}
		else if (temperature < 60 || temperature > 90 && isSummer == false) {
			result = false;
		}
		return result;
	}
}
