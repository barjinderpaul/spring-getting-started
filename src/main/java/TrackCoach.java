public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("---------- No-arg constructor called for the TrackCoach class---------");
    }

    FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService) {
        System.out.println(";;;;;;;;; Arged constructor called for the Track Coach class ;;;;;;;;;;;;");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getWorkout() {
        return "Run 5kms, do sprints for 100m, every 100s";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
