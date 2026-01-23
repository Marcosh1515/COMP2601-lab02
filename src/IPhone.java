import java.util.Objects;

public class IPhone extends IDevice {
    private double minutesLeft;
    private final String carrier;

    public double getMinutesLeft() {
        return minutesLeft;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setMinutesLeft(double minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    public IPhone(final String purpose, final double minutesLeft, final String carrier) {
        super(purpose);
        this.minutesLeft = minutesLeft;
        this.carrier = carrier;
    }

    @Override
    public void printDetails() {
        System.out.println("minutesLeft=" + this.minutesLeft +", carrier=" + this.carrier);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "minutesLeft=" + this.minutesLeft +
                ", carrier='" + this.carrier + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPhone iPhone = (IPhone) o;
        return Double.compare(this.minutesLeft, iPhone.minutesLeft) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.minutesLeft);
    }
}
