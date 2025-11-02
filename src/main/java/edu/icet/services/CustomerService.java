package edu.icet.services;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    //customer registration

    public void add(Customer customer){

        customerRepository.save(new CustomerEntity(
                customer.getId(),
                customer.getName(),
                customer.getAddress(),
                customer.getEmail()
        ));
    }
}
