package program4;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	private int orderId;
	private String ordersStatus;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
	@JoinColumn(name="customer_order")
	private Customer customer;

	public Orders() {
		
	}

	public Orders(int orderId, String ordersStatus, Customer customer) {
		super();
		this.orderId = orderId;
		this.ordersStatus = ordersStatus;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrdersStatus() {
		return ordersStatus;
	}

	public void setOrdersStatus(String ordersStatus) {
		this.ordersStatus = ordersStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
