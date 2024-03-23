public class F1Team {
    private String name;
    private int foundationYear;
    private String country;
    private int championships;

    public F1Team(String name, int foundationYear, String country, int championships) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.country = country;
        this.championships = championships;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }
}