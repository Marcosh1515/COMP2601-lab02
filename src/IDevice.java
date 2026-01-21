public abstract class IDevice {

    private final String purpose;

    public void GetPurpose() {

    };

    public abstract void printDetails();

    public IDevice(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "";
    }
}
