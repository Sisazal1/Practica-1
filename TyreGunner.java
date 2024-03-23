public class TyreGunner extends PitCrewMember {

    private int wheel;  

    public TyreGunner(String name, int wheel) {
        super(name, "Tyre Gunner (Wheel " + wheel + ")");
        this.wheel = wheel;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  
        System.out.println(" (Operating wheel gun on wheel " + wheel + ")");
    }
}
