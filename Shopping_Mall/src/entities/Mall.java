package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mall")
public class Mall implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="mallId")
	private long id;
	@Column(name="mallAdmin")
	private String MallAdmin;
	@Column(name="mallName")
	private String mallName;
	@Column(name="Location")
	private String location;
	@Column(name="shopId")
	private int shops_id;
	@Column(name="Categories")
	private String categories;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallAdmin() {
		return MallAdmin;
	}
	public void setMallAdmin(String mallAdmin) {
		MallAdmin = mallAdmin;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getShops_id() {
		return shops_id;
	}
	public void setShops_id(int shops_id) {
		this.shops_id = shops_id;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + ", categories=" + categories
				+ "]";
	}
	
}
