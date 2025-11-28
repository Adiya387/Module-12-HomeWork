package Module12HomeWork;

public class HiringProcessService {

    public ApplicationStatus processVacancyRequest(VacancyRequest request) {
        System.out.println("Руководитель создал заявку: " + request.getTitle());
        System.out.println("HR проверяет заявку...");

        if (request.isMeetsRequirements()) {
            System.out.println("Заявка соответствует требованиям. Утверждена.");
            return ApplicationStatus.APPROVED;
        } else {
            System.out.println("Заявка не соответствует требованиям. Отправлена на доработку.");
            return ApplicationStatus.NEEDS_REWORK;
        }
    }

    public CandidateStatus processCandidate(Candidate candidate) {
        System.out.println("\nКандидат подал заявку: " + candidate.getName());

        if (!candidate.isHrInterviewPassed()) {
            System.out.println("Кандидат не прошёл первичное интервью HR. Отказ.");
            return CandidateStatus.REJECTED_AFTER_INTERVIEW;
        }
        System.out.println("Кандидат успешно прошёл первичное интервью.");

        if (!candidate.isTechInterviewPassed()) {
            System.out.println("Кандидат провалил техническое собеседование. Отказ.");
            return CandidateStatus.REJECTED_AFTER_INTERVIEW;
        }
        System.out.println("Кандидат прошёл техническое собеседование. Предложен оффер.");

        if (!candidate.isOfferAccepted()) {
            System.out.println("Кандидат отказался от оффера.");
            return CandidateStatus.OFFER_DECLINED;
        }

        System.out.println("Кандидат принял оффер. Добавляем сотрудника в базу данных.");
        System.out.println("HR уведомляет IT-отдел о необходимости настроить рабочее место.");
        System.out.println("IT-отдел настраивает рабочее место.");

        return CandidateStatus.HIRED;
    }
}
