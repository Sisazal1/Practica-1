public class TyreOff extends PitCrewMember {

    private int wheel;  // Wheel position (1-4)

    public TyreOff(String name, int wheel) {
        super(name, "Tyre Off (Wheel " + wheel + ")");
        this.wheel = wheel;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  // Call base class method
        System.out.println(" (Removing tyre from wheel " + wheel + ")");
    }
}
