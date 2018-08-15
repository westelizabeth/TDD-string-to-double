import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class StringToDoubleTest {
    @Test
    public void shouldReturnNullGivenNull() {
        verifyStringToDouble(null, null);
    }

    @Test
    public void shouldReturnNullGivenAnEmptyString() {
        verifyStringToDouble(null, "");
    }

    @Test
    public void shouldReturnDoubleZeroGivenStringZero() {
        verifyStringToDouble(0.0, "0");
    }

    @Test
    public void shouldReturnDoubleOneGivenStringOne() {
        verifyStringToDouble(1.0, "1");
    }

    @Test
    public void shouldReturnDoubleTwoGivenStringTwo() {
        verifyStringToDouble(2.0, "2");
    }

    @Test
    public void shouldReturnDoubleThreeGivenStringThree() {
        verifyStringToDouble(3.0, "3");
    }

    @Test
    public void shouldReturnDoubleFourGivenStringFour() {
        verifyStringToDouble(4.0, "4");
    }

    @Test
    public void shouldReturnDoubleFiveGivenStringFive() {
        verifyStringToDouble(5.0, "5");
    }

    @Test
    public void shouldReturnDoubleSixGivenStringSix() {
        verifyStringToDouble(6.0, "6");
    }

    @Test
    public void shouldReturnDoubleSevenGivenStringSeven() {
        verifyStringToDouble(7.0, "7");
    }

    @Test
    public void shouldReturnDoubleEightGivenStringEight() {
        verifyStringToDouble(8.0, "8");
    }

    @Test
    public void shouldReturnDoubleNineGivenStringNine() {
        verifyStringToDouble(9.0, "9");
    }

    @Test
    public void shouldReturnDoubleTenGivenStringTen() {
        verifyStringToDouble(10.0, "10");
    }

    private static class StringToDouble {
/*
        private static Map<String, Double> stringDoubleMap = new HashMap<>();
        static {
            stringDoubleMap.put("0", 0.0);
            stringDoubleMap.put("1", 1.0);
            stringDoubleMap.put("2", 2.0);
            stringDoubleMap.put("3", 3.0);
            stringDoubleMap.put("4", 4.0);
            stringDoubleMap.put("5", 5.0);
            stringDoubleMap.put("6", 6.0);
            stringDoubleMap.put("7", 7.0);
            stringDoubleMap.put("8", 8.0);
            stringDoubleMap.put("9", 9.0);
        }
*/
        private static Double convertStringToDouble(String s) {
            if (null == s || s.length() == 0)
                return null;

            int power = s.length() - 1;
            int index = 0;
            Double theDouble = 0.0;
            for (; power >= 0; index++, power--) {
                // theDouble += stringDoubleMap.get("" + s.charAt(index)) * Math.pow(10, power);
                theDouble += (s.charAt(index) - 48) * Math.pow(10, power);
            }
            return theDouble;
        }
    }

    private void verifyStringToDouble(Double expected, String input) {
        assertThat(StringToDouble.convertStringToDouble(input), equalTo(expected));
    }
}
