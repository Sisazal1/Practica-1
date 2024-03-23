public class TyreGunner extends PitCrewMember {

    private int wheel;  // Wheel position (1-4)

    public TyreGunner(String name, int wheel) {
        super(name, "Tyre Gunner (Wheel " + wheel + ")");
        this.wheel = wheel;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  // Call base class method
        System.out.println(" (Operating wheel gun on wheel " + wheel + ")");
    }
}
