package static_fileds_and_methods;

import java.text.NumberFormat;

public class factorymethods {
	public static void main(String[] args) {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat peNumberFormat = NumberFormat.getPercentInstance();
		double x =0.1;
		System.out.println(currencyFormat.format(x));
		System.out.println(peNumberFormat.format(x));
	}
}
