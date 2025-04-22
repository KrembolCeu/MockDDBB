package PharmacyPOJOs;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/*TODO:resolver lo de date
 *  
 */
public class Consult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8574852082839862455L;

	private Integer id;
	private Date date;
	private String status;
	 

	public Consult() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date consultDate) {
		this.date = consultDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
	    return "Consult{" +
	            "id=" + id +
	            ", date=" + date +
	            ", status='" + status + '\'' +
	            '}';
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, id, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consult other = (Consult) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(status, other.status);
	}
}
