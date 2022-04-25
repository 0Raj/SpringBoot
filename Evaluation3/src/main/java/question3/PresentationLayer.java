package question3;

public class PresentationLayer {
	private ServiceLayer service;
	
	public void present() {
		this.service.calculateArea();
	}


	public void setService(ServiceLayer service) {
		this.service = service;
	}
	
}
