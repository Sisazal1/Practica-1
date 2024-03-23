public class Steadier extends PitCrewMember {

    public Steadier(String name) {
        super(name, "Steadier/Side Jack Operator");
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  
        System.out.println(" (Operating the steadier/side jack)");
    }
}
