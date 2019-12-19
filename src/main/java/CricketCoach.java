public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;

    FortuneService fortuneService;
    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "10 minutes running, 20 minutes fielding, 30 minutes batting";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
