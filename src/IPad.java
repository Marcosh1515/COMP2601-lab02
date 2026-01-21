public class IPad extends IDevice {
    private final boolean hasCase;
    private final String osVersion;

    public IPad(String purpose, boolean hasCase, String osVersion) {
        super(purpose);
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String toString() {
        return "IPhone{" +
                "hasCase=" + this.hasCase +
                ", osVersion='" + this.osVersion + '\'' +
                '}';
    }
}
