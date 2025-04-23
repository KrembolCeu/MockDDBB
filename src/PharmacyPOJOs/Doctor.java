package PharmacyPOJOs;

import java.io.Serializable;
import java.util.Objects;

public class Doctor implements Serializable{

	
	private static final long serialVersionUID = 391461864842310682L;
	
	private Integer id; 
	private String name; 
	private String speciality; 
	private Integer telephone; 
	private String email; 
	private String workplace;
	 
	
	
	public Doctor() {
		super();
	}
	//Empty constructor 



	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", speciality=" + speciality + ", telephone=" + telephone
				+ ", email=" + email + ", workplace=" + workplace + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	// I think it should not exist



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSpeciality() {
		return speciality;
	}



	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}



	public Integer getTelephone() {
		return telephone;
	}



	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getWorkplace() {
		return workplace;
	}



	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, speciality, telephone, workplace);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(speciality, other.speciality) && Objects.equals(telephone, other.telephone)
				&& Objects.equals(workplace, other.workplace);
	} 

}
