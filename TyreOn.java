public class TyreOn extends PitCrewMember {

    private int wheel; 

    public TyreOn(String name, int wheel) {
        super(name, "Tyre On (Wheel " + wheel + ")");
        this.wheel = wheel;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  
        System.out.println(" (Fitting tyre on wheel " + wheel + ")");
    }
}
