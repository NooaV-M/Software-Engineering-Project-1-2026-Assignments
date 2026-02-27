import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void fahrenheitToCelsiusTest_positive() {
        assertEquals((double) ((1 - 32) * 5) /9,converter.fahrenheitToCelsius(1));
    }

    @Test
    public void fahrenheitToCelsiusTest_large_positive() {
        assertEquals((double) ((1000 - 32) * 5) /9,converter.fahrenheitToCelsius(1000));
    }

    @Test
    public void fahrenheitToCelsiusTest_negative() {
        assertEquals((double) ((-1 - 32) * 5) /9,converter.fahrenheitToCelsius(-1));
    }

    @Test
    public void fahrenheitToCelsiusTest_large_negative() {
        assertEquals((double) ((-1000 - 32) * 5) /9,converter.fahrenheitToCelsius(-1000));
    }

    @Test
    public void fahrenheitToCelsiusTest_zero() {
        assertEquals((double) ((0 - 32) * 5) /9,converter.fahrenheitToCelsius(0));
    }

    @Test
    public void celsiusToFahrenheitTest_positive_fractional() {
        assertEquals((double) ((0.5 * 9) /5) + 32,converter.celsiusToFahrenheit(0.5));
    }

    @Test
    public void celsiusToFahrenheitTest_negative_fractional() {
        assertEquals((double) ((-0.5 * 9) /5) + 32,converter.celsiusToFahrenheit(-0.5));
    }

    @Test
    public void celsiusToFahrenheitTest_incorrect_input() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            converter.celsiusToFahrenheit(Double.parseDouble("abc"));
        });
        String expectedMessage = "For input string: \"abc\"";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void celsiusToFahrenheitTest_positive() {
        assertEquals((double) ((1 * 9.0) /5.0) + 32,converter.celsiusToFahrenheit(1));
    }

    @Test
    public void celsiusToFahrenheitTest_large_positive() {
        assertEquals((double) ((1000 * 9) /5) + 32,converter.celsiusToFahrenheit(1000));
    }

    @Test
    public void celsiusToFahrenheitTest_negative() {
        assertEquals((double) ((-1 * 9.0) /5.0) + 32,converter.celsiusToFahrenheit(-1));
    }

    @Test
    public void celsiusToFahrenheitTest_large_negative() {
        assertEquals((double) ((-1000 * 9) /5) + 32,converter.celsiusToFahrenheit(-1000));
    }

    @Test
    public void celsiusToFahrenheitTest_zero() {
        assertEquals((double) ((0 * 9) /5) + 32,converter.celsiusToFahrenheit(0));
    }

    @Test
    public void kelvinToCelsiusTest_positive() {
        assertEquals(26.85, converter.kelvinToCelsius(300), 0.01);
    }

    @Test
    public void kelvinToCelsiusTest_large_positive() {
        assertEquals(726.85, converter.kelvinToCelsius(1000), 0.01);
    }

    @Test
    public void isExtremeTemperatureCelsiusTest_below_lower_bound() {
        assertTrue(converter.isExtremeTemperatureCelsius(-41));
    }

    @Test
    public void isExtremeTemperatureCelsiusTest_at_lower_bound() {
        assertFalse(converter.isExtremeTemperatureCelsius(-40));
    }

    @Test
    public void isExtremeTemperatureCelsiusTest_within_bounds() {
        assertFalse(converter.isExtremeTemperatureCelsius(20));
    }

    @Test
    public void isExtremeTemperatureCelsiusTest_at_upper_bound() {
        assertFalse(converter.isExtremeTemperatureCelsius(50));
    }

    @Test
    public void isExtremeTemperatureCelsiusTest_above_upper_bound() {
        assertTrue(converter.isExtremeTemperatureCelsius(51));
    }

}
