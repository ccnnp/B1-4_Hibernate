package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Shop")
public class Shop implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="shopId")
	private int shopId;
	@Column(name="shopCategory")
	private String shopCategory;
	@Column(name="shopEmployeeID")
	private int shopEmployeeID;
	@Column(name="shopName")
	private String shopName;
	@Column(name="customers")
	private String Customers;
	@Column(name="shopStatus")
	private String shopStatus;
	@Column(name="shopOwner")
	private String shopOwner;
	@Column(name="leaseStatus")
	private String leaseStatus;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public int getShopEmployeeID() {
		return shopEmployeeID;
	}
	public void setShopEmployeeID(int shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return Customers;
	}
	public void setCustomers(String customers) {
		Customers = customers;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopEmployeeID=" + shopEmployeeID
				+ ", shopName=" + shopName + ", Customers=" + Customers + ", shopStatus=" + shopStatus + ", shopOwner="
				+ shopOwner + ", leaseStatus=" + leaseStatus + "]";
	}
	
}
