import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        F1Team f1TeamA = new F1Team("Team A", 1990, "Italy", 7);
        F1Team f1TeamB = new F1Team("Team B", 1985, "Germany", 5);

        
        PitCrewTeam pitCrewTeam = new PitCrewTeam();

        
        pitCrewTeam.addMember(new TyreGunner("John", 1));
        pitCrewTeam.addMember(new TyreGunner("Alice", 2));
        pitCrewTeam.addMember(new TyreGunner("Bob", 3));
        pitCrewTeam.addMember(new TyreGunner("Charlie", 4));
        pitCrewTeam.addMember(new TyreOff("David", 1));
        pitCrewTeam.addMember(new TyreOff("Eve", 2));
        pitCrewTeam.addMember(new TyreOff("Fred", 3));
        pitCrewTeam.addMember(new TyreOff("Grace", 4));
        pitCrewTeam.addMember(new TyreOn("Henry", 1));
        pitCrewTeam.addMember(new TyreOn("Isla", 2));
        pitCrewTeam.addMember(new TyreOn("Jack", 3));
        pitCrewTeam.addMember(new TyreOn("Kim", 4));
        pitCrewTeam.addMember(new JackOperator("Lily", "Front"));
        pitCrewTeam.addMember(new JackOperator("Michael", "Rear"));
        pitCrewTeam.addMember(new Steadier("Nolan"));
        pitCrewTeam.addMember(new FrontWingFlapAdjuster("Olivia"));
        pitCrewTeam.addMember(new PitCrewMember("Peter", "Driver A's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Quinn", "Driver A's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Ray", "Driver A's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Stella", "Driver A's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Ted", "Driver A's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Ugo", "Driver B's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Valerie", "Driver B's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("William", "Driver B's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Xavier", "Driver B's Crew"));
        pitCrewTeam.addMember(new PitCrewMember("Yvonne", "Driver B's Crew"));

       
        pitCrewTeam.assignDriverCrews();

        
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            
            System.out.println("\nF1 Pit Crew Management System");
            System.out.println("------------------------------");
            System.out.println("1. View Pit Crew for Driver A");
            System.out.println("2. View Pit Crew for Driver B");
            System.out.println("3. View Entire Pit Crew");
            System.out.println("4. View Teams Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    
                    System.out.println("\nPit Crew for Driver A:");
                    System.out.println("----------------------");
                    for (PitCrewMember member : pitCrewTeam.getDriverACrew()) {
                        System.out.println(member.getName() + " (" + member.getRole() + ")");
                    }
                    break;
                case 2:
                    
                    System.out.println("\nPit Crew for Driver B:");
                    System.out.println("----------------------");
                    for (PitCrewMember member : pitCrewTeam.getDriverBCrew()) {
                        System.out.println(member.getName() + " (" + member.getRole() + ")");
                    }
                    break;
                case 3:
                    
                    System.out.println("\nEntire Pit Crew:");
                    System.out.println("----------------");
                    for (PitCrewMember member : pitCrewTeam.getMembers()) {
                        System.out.println(member.getName() + " (" + member.getRole() + ")");
                    }
                    break;
                case 4:
                    
                    System.out.println("\nTeam A Info:");
                    System.out.println("Name: " + f1TeamA.getName());
                    System.out.println("Country: " + f1TeamA.getCountry());
                    System.out.println("Championships: " + f1TeamA.getChampionships());
                    System.out.println("\nTeam B Info:");
                    System.out.println("Name: " + f1TeamB.getName());
                    System.out.println("Country: " + f1TeamB.getCountry());
                    System.out.println("Foundation Year: " + f1TeamB.getFoundationYear());
                    System.out.println("Championships: " + f1TeamB.getChampionships());
                break;
                        case 5:
                      System.out.println("\nExiting F1 Pit Crew Management System.");
                                    break;
                    default:
             System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                            }
                        }

                        scanner.close(); 
                    }
                }
