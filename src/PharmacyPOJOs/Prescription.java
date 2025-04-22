package PharmacyPOJOs;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
/*TODO:resolver lo de date
 *  
 */

public class Prescription implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4458377507371493828L;
	
	private Integer id;
	private Date dateIssued;
	private Integer validity;
	
	public Prescription() {
		super();
	} 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	
	@Override
	public String toString() {
	    return "Prescription{" +
	            "id=" + id +
	            ", dateIssued=" + dateIssued +
	            ", validity=" + validity +
	            '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateIssued, id, validity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prescription other = (Prescription) obj;
		return Objects.equals(dateIssued, other.dateIssued) && Objects.equals(id, other.id)
				&& Objects.equals(validity, other.validity);
	}

}
