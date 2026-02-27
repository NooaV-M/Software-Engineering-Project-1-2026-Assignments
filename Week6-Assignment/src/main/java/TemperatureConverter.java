public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public boolean isExtremeTemperatureCelsius(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("TemperatureConverter demo:");
        System.out.printf("32 F -> %.2f C\n", tc.fahrenheitToCelsius(32));
        System.out.printf("0 C -> %.2f F\n", tc.celsiusToFahrenheit(0));
        System.out.printf("273.15 K -> %.2f C\n", tc.kelvinToCelsius(273.15));
    }
}

