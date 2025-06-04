package StreamApiFilterQuestions.customer;

public class customer {
	private int custId;
	private String custName;
	private String custOrder;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustOrder() {
		return custOrder;
	}
	public void setCustOrder(String custOrder) {
		this.custOrder = custOrder;
	}
	@Override
	public String toString() {
		return "customer [custId=" + custId + ", custName=" + custName + ", custOrder=" + custOrder + "]";
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customer(int custId, String custName, String custOrder) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custOrder = custOrder;
	}
	
	

}
