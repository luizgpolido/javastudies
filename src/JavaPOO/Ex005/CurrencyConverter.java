package JavaPOO.Ex005;

public class CurrencyConverter {

    public static double dolarPrice;
    public static double dolarQuantity;

    public static double convertedCurrency(){
        return dolarPrice * dolarQuantity;
    }

    public static double dolarInReal(){
        return convertedCurrency() * 1.06;

    }




}
