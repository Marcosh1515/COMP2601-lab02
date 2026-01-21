public class IPhone extends IDevice {
    private final double minutesLeft;
    private final String carrier;

    public IPhone(final String purpose, final double minutesLeft, final String carrier) {
        super(purpose);
        this.minutesLeft = minutesLeft;
        this.carrier = carrier;
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String toString() {
        return "IPhone{" +
                "minutesLeft=" + this.minutesLeft +
                ", carrier='" + this.carrier + '\'' +
                '}';
    }
}
