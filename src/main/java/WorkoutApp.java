import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkoutApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach cricketCoach = (Coach) context.getBean("cricketCoach");
        // or no need to cast
        Coach cricketCoach2 = context.getBean("cricketCoach", Coach.class);

        System.out.println(cricketCoach2.getWorkout());
    }
}
