import java.util.Objects;

/**
 * This class represents an IPad.
 * @author Marc-André Baron-Campeau
 * @version 1.0
 */
public class IPad extends IDevice {
    private boolean hasCase;
    private String osVersion;

    /**
     * Case presence getter.
     * @return true if the IPad has a case, false otherwise
     */
    public boolean hasCase() {
        return this.hasCase;
    }

    /**
     * Operating system version getter.
     * @return operating system version
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * Case presence setter.
     * @param hasCase true if the IPad has a case
     */
    public void setHasCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }

    /**
     * Operating system version setter.
     * @param osVersion the new operating system version
     */
    public void setOsVersion(final String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * Builds an IPad.
     * @param purpose the device purpose
     * @param hasCase true if the IPad has a case
     * @param osVersion operating system version
     */
    public IPad(final String purpose, final boolean hasCase, final String osVersion) {
        super(purpose);
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Prints IPad details.
     */
    @Override
    public void printDetails() {
        System.out.println("hasCase=" + this.hasCase +", osVersion='" + this.osVersion + '\'');
    }

    /**
     * Returns a string representation of the IPad.
     * @return IPad as a string
     */
    @Override
    public String toString() {
        return "IPhone{" +
                "hasCase=" + this.hasCase +
                ", osVersion='" + this.osVersion + '\'' +
                "} " + super.toString();
    }

    /**
     * Compares this IPad to another object.
     * @param o the object to compare
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPad iPad = (IPad) o;
        return Objects.equals(this.osVersion, iPad.osVersion);
    }

    /**
     * Generates a hash code for the IPad.
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.osVersion);
    }
}
