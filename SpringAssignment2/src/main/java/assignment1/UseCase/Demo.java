package assignment1.UseCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment1.PresentationLayer.Presentation;
import assignment1.Util.AppConfig;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Presentation presentation = ctx.getBean(Presentation.class,"present");
		presentation.present();
	}
}
