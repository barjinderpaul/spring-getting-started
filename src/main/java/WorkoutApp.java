import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkoutApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach cricketCoach = (Coach) context.getBean("cricketCoach");
        // or no need to cast
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(cricketCoach.getWorkout());
        System.out.println(cricketCoach.getFortune());

        System.out.println(trackCoach.getWorkout());
        System.out.println(trackCoach.getFortune());
    }
}
