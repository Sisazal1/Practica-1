public class TyreOff extends PitCrewMember {

    private int wheel;  

    public TyreOff(String name, int wheel) {
        super(name, "Tyre Off (Wheel " + wheel + ")");
        this.wheel = wheel;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  
        System.out.println(" (Removing tyre from wheel " + wheel + ")");
    }
}
