public class ToFahrenheit implements BaseConverter{
    @Override
    public double convertTo(double degree) {
        double fahrenheit = degree*(9/5)+32;
        return fahrenheit;
    }
}
