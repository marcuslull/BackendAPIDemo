package com.example.d288pa.bootstrap;

import com.example.d288pa.dao.CustomerRepository;
import com.example.d288pa.dao.DivisionRepository;
import com.example.d288pa.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoad implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() == 1 ) {
            addCustomers();
        }
    }

    private void addCustomers() {

        System.out.println("---------------------------------------------------------------");
        System.out.println("Detected empty customer list. Populating some sample customers.");
        System.out.println("---------------------------------------------------------------");

        // customer objects
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Customer customer5 = new Customer();

        // first names
        customer1.setFirstName("Alice");
        customer2.setFirstName("Bob");
        customer3.setFirstName("Carol");
        customer4.setFirstName("David");
        customer5.setFirstName("Emily");

        // last names
        customer1.setLastName("Smith");
        customer2.setLastName("Jones");
        customer3.setLastName("Williams");
        customer4.setLastName("Brown");
        customer5.setLastName("Miller");

        // addresses
        customer1.setAddress("123 Main Street");
        customer2.setAddress("456 Elm Street");
        customer3.setAddress("789 Oak Street");
        customer4.setAddress("1011 Maple Street");
        customer5.setAddress("1213 Cedar Street");

        // postal codes
        customer1.setPostal_code("98122");
        customer2.setPostal_code("98123");
        customer3.setPostal_code("98124");
        customer4.setPostal_code("98125");
        customer5.setPostal_code("98126");

        // phones
        customer1.setPhone("(123) 456-7890");
        customer2.setPhone("(123) 456-7891");
        customer3.setPhone("(123) 456-7892");
        customer4.setPhone("(123) 456-7893");
        customer5.setPhone("(123) 456-7894");

        // division
        customer1.setDivision(divisionRepository.getReferenceById(15L));
        customer2.setDivision(divisionRepository.getReferenceById(16L));
        customer3.setDivision(divisionRepository.getReferenceById(17L));
        customer4.setDivision(divisionRepository.getReferenceById(18L));
        customer5.setDivision(divisionRepository.getReferenceById(19L));

        // persist
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);
    }
}
