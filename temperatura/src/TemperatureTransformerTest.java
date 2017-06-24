import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TemperatureTransformerTest{
	
	@Test
    public void testConvert1() throws Exception{
        Temperature t = new FahrenheitTemperature();
        t.setValue(32);
        TemperatureTransformer tc = new TemperatureTransformer();
        Temperature c = tc.convert(t);
        assertTrue(c.getValue() == 0);
    }
	
	@Test
    public void testConvert2() throws Exception{
        Temperature t = new FahrenheitTemperature();
        t.setValue(212);
        TemperatureTransformer tc = new TemperatureTransformer();
        Temperature c = tc.convert(t);
        assertTrue(c.getValue() == 100);
    }
	
	@Test
    public void testConvert3() throws Exception{
        Temperature t = new FahrenheitTemperature();
        t.setValue(-459.4);
        TemperatureTransformer tc = new TemperatureTransformer();
        Temperature c = tc.convert(t);
        assertTrue(c.getValue() == -273);
    }	
	
	@Test
    public void testConvert4() throws Exception{
        Temperature t = new CelsiusTemperature();
        t.setValue(0);
        TemperatureTransformer tc = new TemperatureTransformer();
        Temperature c = tc.convert(t);
        assertTrue(c.getValue() == 32);
    }
	
	@Test
    public void testConvert5() throws Exception{
        Temperature t = new CelsiusTemperature();
        t.setValue(100);
        TemperatureTransformer tc = new TemperatureTransformer();
        Temperature c = tc.convert(t);
        assertTrue(c.getValue() == 212);
    }
	
	@Test
    public void testConvert6() throws Exception{
        Temperature t = new CelsiusTemperature();
        t.setValue(-273);
        TemperatureTransformer tc = new TemperatureTransformer();
        Temperature c = tc.convert(t);
        assertTrue(c.getValue() == -459.4);
    }
    
} 
