package PharmacyPOJOs;

import java.io.Serializable;
import java.util.Objects;

public class Pharmacist implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3421762158473307461L;
	
	private Integer id;
	private String name;
	private String shift;
	
	public Pharmacist() {
		super();
	}
 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
	@Override
	public String toString() {
	    return "Pharmacist{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", shift='" + shift + '\'' +
	            '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, shift);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pharmacist other = (Pharmacist) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(shift, other.shift);
	}
	
	

}
