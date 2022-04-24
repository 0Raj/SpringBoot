package autoWire;

public class ServiceBean {

	private DAOBean dao;

//	public void setDao(DAOBean dao) {
//		this.dao = dao;
//	}

	
	public void calculateInterest() {
		dao.findAccount();
		System.out.println("Interest calculated in Service Layer..");
	}

	public ServiceBean(DAOBean dao) {
		super();
		this.dao = dao;
	}
}
