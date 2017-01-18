package org.hawkular.apm.example.ordermgr.orders;

public class Order {

	private String accountId;
	private String itemId;
	private int quantity;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [accountId=" + accountId + ", itemId=" + itemId + ", quantity=" + quantity + "]";
	}

}
