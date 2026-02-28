package program7;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		MedicalRecord medRecord = new MedicalRecord();
		medRecord.setDiagnosis("Migraine");
		medRecord.setIssueDate("08/05/2025");
		
		Patient patient = new Patient();
		patient.setPatientId(1001);
		patient.setPatientName("Arya");
		patient.setMedRecord(medRecord);
		
		em.persist(patient);
		em.getTransaction().commit();
		
	}
}
