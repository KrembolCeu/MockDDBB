package PharmacyPOJOs;
import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6510590609092054025L;
	
	private Integer Id;
	private Integer Phone;
	private String Email;
	private String Address;
	private String Name;
	
	public Client() {
		super();
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getPhone() {
		return Phone;
	}

	public void setPhone(Integer phone) {
		this.Phone = phone;
	}

	public String getAdress() {
		return Address;
	}

	public void setAdress(String adress) {
		Address = adress;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(Address,Email,Id,Name,Phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Email, other.Email)
				&& Objects.equals(Id, other.Id) && Objects.equals(Name, other.Name)
				&& Objects.equals(Phone, other.Phone);
	}
	
	

}
