package question4;

public class question4 {

	/*
	 * A. What do you mean by IoC (Inversion of Control) Container?
	 * IoC or Spring core container is the base container for all other Spring containers .
	 * The process of injecting dependency object to the dependent class will be done by external entity.
	 * here the external entity is our IOC container 
	 * Basically the main control's work will be given to IOC container thats why we call it as Inversion of control.
	 *
	 * B. What are Spring Beans?
	 * Spring beans is nothing but a java bean class which is registered with spring container.
	 * Spring beans is basically a pojo class.
	 * 
	 * C. What are the bean scopes available in Spring?
	 * [i]  Singleton scope
	 * [ii] Prototype Scope
	 * 
	 * D. What is auto-wiring and name the different modes of it.What are the limitations 
	 * 	  of auto-wiring?
	 * There are two types of dependency injection in spring.
	 * [i] Explicit injection
	 * [ii] Implicit injection
	 * 
	 * Auto-wiring comes under Implicit injection. Where we need to use auto-wiring keyword inside 
	 * bean tag it will automatically search for dependency name or type from spring beans and assign to it.
	 * 
	 * The default value for auto-wiring in spring is disable;
	 * There are Three types of auto-wiring.
	 * [i]  ByName AutoWiring
	 * [ii]  ByType AutoWiring
	 * [iii]  constructor AutoWiring
	 * 
	 * Auto wiring can cause ambiguity if dependencies are in same name or in same type for auto-wiring class.
	 * 
	 * */
	
}
