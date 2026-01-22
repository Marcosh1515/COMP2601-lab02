import java.util.Objects;

public abstract class IDevice {

    private final String purpose;

    public String getPurpose() {
        return this.purpose;
    };

    public IDevice(String purpose) {
        this.purpose = purpose;
    }

    public abstract void printDetails();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IDevice iDevice = (IDevice) o;
        return Objects.equals(purpose, iDevice.purpose);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(purpose);
    }

    @Override
    public String toString() {
        return "IDevice{" +
                "purpose='" + purpose + '\'' +
                '}';
    }
}
