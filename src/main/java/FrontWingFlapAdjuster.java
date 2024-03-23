public class FrontWingFlapAdjuster extends PitCrewMember {

    public FrontWingFlapAdjuster(String name) {
        super(name, "Front Wing Flap Adjuster");
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber); 
        System.out.println(" (Adjusting the front wing flaps)");
    }
}
