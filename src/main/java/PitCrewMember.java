public class PitCrewMember {

  private String name;
  private String role;

  public PitCrewMember(String name, String role) {
    this.name = name;
    this.role = role;
  }

  public String getName() {
    return name;
  }

  public String getRole() {
    return role;
  }

  public void performTask(int carNumber) {
    System.out.println(getName() + " (" + getRole() + ") is performing a task on car " + carNumber + ".");
  }
}
