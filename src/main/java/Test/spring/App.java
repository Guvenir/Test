package Test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Hello h = ctx.getBean(Hello.class);
        h.setMessage("Hello Java");
        Hello he = ctx.getBean(Hello.class);
        System.out.println(he.getMessage());
    }
}
