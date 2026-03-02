public class ToKelvin implements BaseConverter{
    @Override
    public double convertTo(double degree) {
        double kelvin = degree+273.15;
        return kelvin;
    }
}
