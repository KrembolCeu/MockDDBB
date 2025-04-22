package PharmacyPOJOs;

import java.io.Serializable;
import java.util.Objects;

public class Medicine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8846301878551480254L;
	
	private Integer id;
	private String name;
	private double price;
	private String type;
	private Integer stock;
	private Integer requiresPrescription;
	 
	public Medicine() {
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

	public double getMedicinePrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getRequiresPrescription() {
		return requiresPrescription;
	}

	public void setRequiresPrescription(Integer requiresPrescription) {
		this.requiresPrescription = requiresPrescription;
	}
	
	@Override
	public String toString() {
	    return "Medicine{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", price=" + price +
	            ", type='" + type + '\'' +
	            ", stock=" + stock +
	            ", requiresPrescription=" + requiresPrescription +
	            '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, type, requiresPrescription, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicine other = (Medicine) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(type, other.type)
				&& Objects.equals(requiresPrescription, other.requiresPrescription)
				&& Objects.equals(stock, other.stock);
	}


}
