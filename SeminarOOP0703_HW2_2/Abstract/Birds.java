package SeminarOOP0703_HW2_2.Abstract;

public abstract class Birds extends Animal {
    protected int flightAltitude;

    public Birds(int height, int weight, String eyesColor, int flightAltitude) {
        super(height, weight, eyesColor);
        this.flightAltitude = flightAltitude;
    }
    public int getFlightAltitude() {
        return flightAltitude;
    }

    public String fly() {
        return String.format("Я лечу на высоте %d м!" , flightAltitude);
    }
}
