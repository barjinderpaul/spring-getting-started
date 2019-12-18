public class FootballCoach implements Coach {

    FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Go to the field and practice penalty shootouts";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
