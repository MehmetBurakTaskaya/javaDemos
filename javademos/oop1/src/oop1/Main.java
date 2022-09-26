package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(1);
		product1.setImageUrl("bilmemne.jpg");

		// get value
		// System.out.println(product1.name);
		
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(1);
		product2.setImageUrl("bilmemne2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(1);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(5);
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
		
	}

}
