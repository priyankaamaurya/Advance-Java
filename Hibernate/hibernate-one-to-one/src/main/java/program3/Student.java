package program3;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dob")
	private IDCard idcard;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public IDCard getIdcard() {
		return idcard;
	}
	public void setIdcard(IDCard idcard) {
		this.idcard = idcard;
	}
	
	public Student() {
		
	}
	
	public Student(int studentId, String studentName, IDCard idcard) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.idcard = idcard;
	}
	
}
