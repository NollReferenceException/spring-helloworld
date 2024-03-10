import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBeanFirst =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBeanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBeanFirst =
                (Cat) applicationContext.getBean("cat");
        Cat catBeanSecond =
                (Cat) applicationContext.getBean("cat");

        System.out.println(helloWorldBeanFirst == helloWorldBeanSecond);
        System.out.println(catBeanFirst == catBeanSecond);
    }
}