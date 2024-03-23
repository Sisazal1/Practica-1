import java.util.ArrayList;

public class PitCrewTeam {

  private ArrayList<PitCrewMember> members;
  private ArrayList<PitCrewMember> driverACrew;
  private ArrayList<PitCrewMember> driverBCrew;

  public PitCrewTeam() {
    members = new ArrayList<>();
    driverACrew = new ArrayList<>();
    driverBCrew = new ArrayList<>();
  }

  public void addMember(PitCrewMember member) {
    members.add(member);
  }

  private void assignDriverCrew() {
    if (members.size() >= 10) {
      for (int i = 0; i < 5; i++) {
        PitCrewMember member = members.remove(0);
        driverACrew.add(member);
        member = members.remove(0);
        driverBCrew.add(member);
      }
    } else {
      System.out.println("Insufficient crew members to assign driver crews. Minimum 10 required.");
    }
  }

  public void assignDriverCrews() {
    assignDriverCrew(); // Call the private method to avoid direct member manipulation
  }

  public ArrayList<PitCrewMember> getDriverACrew() {
    return driverACrew;
  }

  public ArrayList<PitCrewMember> getDriverBCrew() {
    return driverBCrew;
  }

  public ArrayList<PitCrewMember> getMembers() {
    return members;
  }
}
