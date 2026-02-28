package program8;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="employeee")
public class Employee {

	@Id
	private int empId;
	private String empName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_salDetails")
	private SalaryDetails salDetails;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public SalaryDetails getSalDetails() {
		return salDetails;
	}
	public void setSalDetails(SalaryDetails salDetails) {
		this.salDetails = salDetails;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, SalaryDetails salDetails) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salDetails = salDetails;
	}
	
	
	
	
	
}
