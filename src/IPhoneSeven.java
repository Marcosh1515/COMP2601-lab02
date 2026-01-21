public class IPhoneSeven extends IPhone {
    private final boolean hasHdCamera;
    private final int memoryGB;

    public IPhoneSeven(String purpose, double minutesLeft, String carrier, boolean hasHdCamera, int memoryGB) {
        super(purpose, minutesLeft, carrier);
        this.hasHdCamera = hasHdCamera;
        this.memoryGB = memoryGB;
    }
    
}
