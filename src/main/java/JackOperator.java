public class JackOperator extends PitCrewMember {

    private String jackPosition;  // "Front" or "Rear"

    public JackOperator(String name, String jackPosition) {
        super(name, "Jack Operator (" + jackPosition + " Jack)");
        this.jackPosition = jackPosition;
    }

    @Override
    public void performTask(int carNumber) {
        super.performTask(carNumber);  // Call base class method
        System.out.println(" (Operating the " + jackPosition + " jack)");
    }
}
