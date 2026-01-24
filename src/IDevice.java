import java.util.Objects;

/**
 * This class represents an abstract device.
 * @author Marc-André Baron-Campeau
 * @version 1.0
 */
public abstract class IDevice {
    private final String purpose;

    /**
     * Purpose getter.
     * @return device purpose
     */
    public String getPurpose() {
        return this.purpose;
    };

    /**
     * Builds an IDevice.
     * @param purpose the device purpose
     */
    public IDevice(final String purpose) {
        this.purpose = purpose;
    }

    /**
     * Prints device details.
     */
    public abstract void printDetails();

    /**
     * Returns a string representation of the device.
     * @return device as a string
     */
    @Override
    public String toString() {
        return "IDevice{" +
                "purpose='" + this.purpose + '\'' +
                '}';
    }

    /**
     * Compares this device to another object.
     * @param o the object to compare
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        IDevice iDevice = (IDevice) o;
        return Objects.equals(this.purpose, iDevice.purpose);
    }

    /**
     * Generates a hash code for the device.
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(this.purpose);
    }
}
