import java.util.Objects;

public class IPad extends IDevice {
    private boolean hasCase;
    private String osVersion;

    public boolean hasCase() {
        return hasCase;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public IPad(String purpose, boolean hasCase, String osVersion) {
        super(purpose);
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    @Override
    public void printDetails() {
        System.out.println("hasCase=" + this.hasCase +", osVersion='" + this.osVersion + '\'');
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "hasCase=" + this.hasCase +
                ", osVersion='" + this.osVersion + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPad iPad = (IPad) o;
        return Objects.equals(this.osVersion, iPad.osVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.osVersion);
    }
}
