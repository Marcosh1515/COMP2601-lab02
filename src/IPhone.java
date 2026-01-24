import java.util.Objects;

/**
 * This class represents an IPhone.
 * @author Marc-André Baron-Campeau
 * @version 1.0
 */
public class IPhone extends IDevice {
    private double minutesLeft;
    private final String carrier;

    /**
     * Minutes remaining getter.
     * @return minutes remaining on the phone plan
     */
    public double getMinutesLeft() {
        return this.minutesLeft;
    }

    /**
     * Carrier getter.
     * @return phone carrier
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Minutes remaining setter.
     * @param minutesLeft the new number of minutes remaining
     */
    public void setMinutesLeft(final double minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    /**
     * Builds an IPhone.
     * @param purpose the device purpose
     * @param minutesLeft minutes remaining on the phone plan
     * @param carrier phone carrier
     */
    public IPhone(final String purpose, final double minutesLeft, final String carrier) {
        super(purpose);
        this.minutesLeft = minutesLeft;
        this.carrier = carrier;
    }

    /**
     * Prints IPhone details.
     */
    @Override
    public void printDetails() {
        System.out.println("minutesLeft=" + this.minutesLeft +", carrier=" + this.carrier);
    }

    /**
     * Returns a string representation of the IPhone.
     * @return IPhone as a string
     */
    @Override
    public String toString() {
        return "IPhone{" +
                "minutesLeft=" + this.minutesLeft +
                ", carrier='" + this.carrier + '\'' +
                "} " + super.toString();
    }

    /**
     * Compares this IPhone to another object.
     * @param o the object to compare
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPhone iPhone = (IPhone) o;
        return Double.compare(this.minutesLeft, iPhone.minutesLeft) == 0;
    }

    /**
     * Generates a hash code for the IPhone.
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.minutesLeft);
    }
}
