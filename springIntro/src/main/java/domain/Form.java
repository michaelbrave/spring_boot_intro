package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Form {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    private String firstName;
    private String lastName;
    private String nickName;
    
	public Form () {
    	// non argument constructor
    }
	
	public Form(String firstName, String lastName, String nickName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	}
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Form [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName
				+ "]";
	}

}
