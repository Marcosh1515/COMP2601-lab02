public class IPod extends IDevice {
    private final int noSongs;
    private final double maxVolDB;

    public IPod(final String purpose, final int noSongs, final double maxVolDB) {
        super(purpose);
        this.noSongs = noSongs;
        this.maxVolDB = maxVolDB;
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String toString() {
        return "IPhone{" +
                "noSongs=" + this.noSongs +
                ", maxVolDB='" + this.maxVolDB + '\'' +
                '}';
    }
}
