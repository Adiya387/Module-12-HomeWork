package Module12HomeWork;

public class VacancyRequest {
    private  String title;
    private  boolean meetsRequirements;

    public VacancyRequest(String title, boolean meetsRequirements) {
        this.title = title;
        this.meetsRequirements = meetsRequirements;
    }

    public String getTitle() {
        return title;
    }

    public boolean isMeetsRequirements() {
        return meetsRequirements;
    }
}
