import java.util.Objects;

public class IPod extends IDevice {
    private int noSongs;
    private final double maxVolDB;

    public int getNoSongs() {
        return noSongs;
    }

    public double getMaxVolDB() {
        return maxVolDB;
    }

    public void setNoSongs(int noSongs) {
        this.noSongs = noSongs;
    }

    public IPod(final String purpose, final int noSongs, final double maxVolDB) {
        super(purpose);
        this.noSongs = noSongs;
        this.maxVolDB = maxVolDB;
    }

    @Override
    public void printDetails() {
        System.out.println("noSongs=" + this.noSongs +", maxVolDB=" + this.maxVolDB);
    }

    @Override
    public String toString() {
        return "IPod{" +
                "noSongs=" + this.noSongs +
                ", maxVolDB=" + this.maxVolDB +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPod iPod = (IPod) o;
        return this.noSongs == iPod.noSongs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.noSongs);
    }
}
