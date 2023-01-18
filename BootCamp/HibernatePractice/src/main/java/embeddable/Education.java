package embeddable;

public class Education {
    //Embaddeble gömülebilir bir class olmasını istediğimizde kullanırız.
    //
    private String university;

    private String deparment;

    public Education() {
    }

    public Education(String university, String deparment) {
        this.university = university;
        this.deparment = deparment;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
}
