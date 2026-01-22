public class IPod extends IDevice {
    private final int noSongs;
    private final double maxVolDB;

    public IPod(final String purpose, final int noSongs, final double maxVolDB) {
        super(purpose);
        this.noSongs = noSongs;
        this.maxVolDB = maxVolDB;
    }

    public void printDetails() {
        System.out.printf("the purpose of this device is %s", this.getPurpose());
    }

    @Override
    public String toString() {
        return "IPod{" +
                "noSongs=" + noSongs +
                ", maxVolDB=" + maxVolDB +
                '}';
    }
}
