package client;

import entities.Customer;
import entities.Employee;
import entities.Item;
import entities.Mall;
import entities.MallAdmin;
import entities.Order;
import entities.Shop;
import entities.ShopOwner;
import entities.User;
import service.IShopService;
import service.IShopServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		MallAdmin mallAdmin = new MallAdmin();
		IShopService service1 = new IShopServiceImpl();
		
		//MallAdmin class
		//create operation
		mallAdmin.setId(0001);
		mallAdmin.setName("Yash");
		mallAdmin.setPassword("abc321");
		mallAdmin.setPhone("9087654321");
		
		
		//Mall Class
		Mall mall = new Mall();
		mall.setId(001);
		mall.setMallName("Orion");
		mall.setLocation("Bengaluru");
		mall.setCategories("Regional");
		
		//Shop Class
		//create 
		Shop shop = new Shop();
		shop.setShopId(01);
		shop.setShopCategory("Restaurant");
		shop.setShopEmployeeID(1);
		shop.setShopName("Pizza hut");
		shop.setCustomers("John");
		shop.setShopStatus("Open");
		shop.setShopOwner("Reena");
		shop.setLeaseStatus("5 years");
		
		//Retrieve
	/*	shop = service1.searchShopById(01);
		System.out.println("Id is: "+shop.getShopEmployeeID());
		System.out.println("name is: "+shop.getShopName());
		System.out.println("shopOwner is: "+shop.getShopOwner());
		System.out.println("shopLease is: "+shop.getLeaseStatus());
		
		//update
		shop=service1.searchShopById(41);
		shop.setShopName("Dominos");
		service1.updateShop(shop);
		System.out.println("update is successful");
	
		//delete
		shop= service1.searchShopById(100);
		service1.deleteShop(100);
		System.out.println("delete is successful"); */
		
		//ShopOwner Class
		ShopOwner owner = new ShopOwner();
		owner.setId(05);
		owner.setName("Sudeep");
		owner.setDob("18-06-1998");
		owner.setAddress("Mysuru");
		owner.setShop_id(04);
		
		//Item Class
		Item item = new Item();
		item.setId(02);
		item.setName("Pizza");
		item.setPrice(350);
		item.setManufacturingDate("31-05-2022");
		item.setExpiryDate("02-06-2022");
		item.setCategory("Veg");
		
		//Employee Class
		Employee employee = new Employee();
		employee.setId(002);
		employee.setName("Ramika");
		employee.setDob("15-05-2000");
		employee.setSalary(30000.0f);
		employee.setAddress("Bengaluru");
		employee.setDesignation("Accountant");
		employee.setShop_id(03);
		
		//Order Class
		Order order = new Order();
		order.setId(23);
		order.setCustomer_id(07);
		order.setShop_id(18);
		order.setTotal(550.0f);
		order.setPaymentMode("Online");
		order.setDateOfPurchase("25-05-2022");
		
		//Customer Class
		Customer customer = new Customer();
		customer.setId(12);
		customer.setName("Shubha");
		customer.setOrder_id(20);
		customer.setPhone("9845704023");
		customer.setEmail("abc@gmail.com");
		
		//User Class
		User user = new User();
		user.setId(05);
		user.setName("Dhoni");
		user.setPassword("xt@32");
		user.setType("Regular");	
		
	}

}
