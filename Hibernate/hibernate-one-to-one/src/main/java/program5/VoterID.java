package program5;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoterID {

	@Id
	private String issueDate;
	private String issueState;
	
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueState() {
		return issueState;
	}
	public void setIssueState(String issueState) {
		this.issueState = issueState;
	}
	
}
