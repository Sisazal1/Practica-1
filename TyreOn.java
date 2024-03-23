public class TyreOn extends PitCrewMember {

    private int wheel;  // Wheel position (1-4)

    public TyreOn(String name, int wheel) {
        super(name, "Tyre On (Wheel " + wheel + ")");
        this.wheel = wheel;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  // Call base class method
        System.out.println(" (Fitting tyre on wheel " + wheel + ")");
    }
}
