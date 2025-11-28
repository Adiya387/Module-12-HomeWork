package Module12HomeWork;

public class HiringProcessDemo {

    public static void main(String[] args) {
        HiringProcessService service = new HiringProcessService();

        VacancyRequest request = new VacancyRequest("Java-разработчик", true);
        ApplicationStatus status = service.processVacancyRequest(request);

        if (status == ApplicationStatus.APPROVED) {
            Candidate candidate = new Candidate(
                    "Иван Иванов",
                    true,
                    true,
                    true,   
                    true
            );

            CandidateStatus result = service.processCandidate(candidate);
            System.out.println("\nИтоговый статус кандидата: " + result);
        } else {
            System.out.println("\nВакансия не утверждена, процесс найма не запускается.");
        }
    }
}
