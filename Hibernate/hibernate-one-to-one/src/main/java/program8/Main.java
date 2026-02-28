package program8;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	SalaryDetails salDetails = new SalaryDetails();
	salDetails.setBankName("HDFC");
	salDetails.setAccNum(276177457233l);
	
	Employee employee = new Employee();
	employee.setEmpId(901);
	employee.setEmpName("Akshara");
	employee.setSalDetails(salDetails);
	
	em.persist(employee);
	em.getTransaction().commit();
	
	}
}
