import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        DocHandler docHandler = (DocHandler) context.getBean("handler", DocHandler.class);
        ToFilePrinter docHandler = context.getBean("toFilePrinter", ToFilePrinter.class);
        docHandler.print("hello world");


    }
}
