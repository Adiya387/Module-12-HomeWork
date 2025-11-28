package Module12HomeWork;

public class Candidate {
    private  String name;
    private  boolean resumeMatches;
    private  boolean hrInterviewPassed;
    private  boolean techInterviewPassed;
    private  boolean offerAccepted;

    public Candidate(String name,
                     boolean resumeMatches,
                     boolean hrInterviewPassed,
                     boolean techInterviewPassed,
                     boolean offerAccepted) {
        this.name = name;
        this.resumeMatches = resumeMatches;
        this.hrInterviewPassed = hrInterviewPassed;
        this.techInterviewPassed = techInterviewPassed;
        this.offerAccepted = offerAccepted;
    }

    public String getName() {
        return name;
    }

    public boolean isResumeMatches() {
        return resumeMatches;
    }

    public boolean isHrInterviewPassed() {
        return hrInterviewPassed;
    }

    public boolean isTechInterviewPassed() {
        return techInterviewPassed;
    }

    public boolean isOfferAccepted() {
        return offerAccepted;
    }
}
