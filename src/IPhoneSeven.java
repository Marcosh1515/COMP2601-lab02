import java.util.Objects;

public class IPhoneSeven extends IPhone {
    private final boolean hasHdCamera;
    private final int memoryGB;

    public boolean isHasHdCamera() {
        return hasHdCamera;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public IPhoneSeven(String purpose, double minutesLeft, String carrier, boolean hasHdCamera, int memoryGB) {
        super(purpose, minutesLeft, carrier);
        this.hasHdCamera = hasHdCamera;
        this.memoryGB = memoryGB;
    }

    @Override
    public void printDetails() {
        System.out.println("hasHdCamera=" + this.hasHdCamera +", memoryGB=" + this.memoryGB);
    }

    @Override
    public String toString() {
        return "IPhoneSeven{" +
                "hasHdCamera=" + hasHdCamera +
                ", memoryGB=" + memoryGB +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IPhoneSeven iPhoneSeven = (IPhoneSeven) o;
        return (this.hasHdCamera == iPhoneSeven.hasHdCamera && Double.compare(this.getMinutesLeft(), iPhoneSeven.getMinutesLeft()) == 0);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.hasHdCamera, this.getMinutesLeft());
    }
}
