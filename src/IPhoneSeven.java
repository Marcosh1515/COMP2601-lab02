import java.util.Objects;

/**
 * This class represents an IPhoneSeven.
 * @author Marc-André Baron-Campeau
 * @version 1.0
 */
public class IPhoneSeven extends IPhone {
    private final boolean hasHdCamera;
    private final int memoryGB;

    /**
     * High-resolution camera getter.
     * @return true if the phone has a high-resolution camera
     */
    public boolean hasHdCamera() {
        return this.hasHdCamera;
    }

    /**
     * Memory size getter.
     * @return memory size in gigabytes
     */
    public int getMemoryGB() {
        return this.memoryGB;
    }

    /**
     * Builds an IPhoneSeven.
     * @param purpose the device purpose
     * @param minutesLeft minutes remaining on the phone plan
     * @param carrier phone carrier
     * @param hasHdCamera true if the phone has a high-resolution camera
     * @param memoryGB memory size in gigabytes
     */
    public IPhoneSeven(final String purpose, final double minutesLeft, final String carrier, final boolean hasHdCamera, final int memoryGB) {
        super(purpose, minutesLeft, carrier);
        this.hasHdCamera = hasHdCamera;
        this.memoryGB = memoryGB;
    }

    /**
     * Prints IPhoneSeven details.
     */
    @Override
    public void printDetails() {
        System.out.println("hasHdCamera=" + this.hasHdCamera +", memoryGB=" + this.memoryGB);
    }

    /**
     * Returns a string representation of the IPhoneSeven.
     * @return IPhoneSeven as a string
     */
    @Override
    public String toString() {
        return "IPhoneSeven{" +
                "hasHdCamera=" + hasHdCamera +
                ", memoryGB=" + memoryGB +
                "} " + super.toString();
    }

    /**
     * Compares this IPhoneSeven to another object.
     * @param o the object to compare
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPhoneSeven iPhoneSeven = (IPhoneSeven) o;
        return (this.hasHdCamera == iPhoneSeven.hasHdCamera && Double.compare(this.getMinutesLeft(), iPhoneSeven.getMinutesLeft()) == 0);

    }

    /**
     * Generates a hash code for the IPhoneSeven.
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.hasHdCamera, this.getMinutesLeft());
    }
}
