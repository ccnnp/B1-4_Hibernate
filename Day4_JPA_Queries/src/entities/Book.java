package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Book2")
@NamedQueries(@NamedQuery(name="getAllBooks",query="SELECT book FROM Book book"))
public class Book implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	private Integer Id;
	private String Titile;
	private String Author;
	private Double Price;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitile() {
		return Titile;
	}
	public void setTitile(String titile) {
		Titile = titile;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Titile=" + Titile + ", Author=" + Author + ", Price=" + Price + "]";
	}
	
}
