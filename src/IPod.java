import java.util.Objects;

/**
 * This class represents an IPod.
 * @author Marc-André Baron-Campeau
 * @version 1.0
 */
public class IPod extends IDevice {
    private int noSongs;
    private final double maxVolDB;

    /**
     * Number of songs getter.
     * @return number of songs
     */
    public int getNoSongs() {
        return this.noSongs;
    }

    /**
     * Maximum volume getter.
     * @return maximum volume in decibels
     */
    public double getMaxVolDB() {
        return this.maxVolDB;
    }

    /**
     * Number of songs setter.
     * @param noSongs the new number of songs
     */
    public void setNoSongs(final int noSongs) {
        this.noSongs = noSongs;
    }

    /**
     * Builds an IPod.
     * @param purpose the device purpose
     * @param noSongs number of songs
     * @param maxVolDB maximum volume in decibels
     */
    public IPod(final String purpose, final int noSongs, final double maxVolDB) {
        super(purpose);
        this.noSongs = noSongs;
        this.maxVolDB = maxVolDB;
    }

    /**
     * Prints IPod details.
     */
    @Override
    public void printDetails() {
        System.out.println("noSongs=" + this.noSongs +", maxVolDB=" + this.maxVolDB);
    }

    /**
     * Returns a string representation of the IPod.
     * @return IPod as a string
     */
    @Override
    public String toString() {
        return "IPod{" +
                "noSongs=" + this.noSongs +
                ", maxVolDB=" + this.maxVolDB +
                "} " + super.toString();
    }

    /**
     * Compares this IPod to another object.
     * @param o the object to compare
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPod iPod = (IPod) o;
        return this.noSongs == iPod.noSongs;
    }

    /**
     * Generates a hash code for the IPod.
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.noSongs);
    }
}
