package com.sac.customer.service;

import com.sac.common.models.CustomerBean;
import com.sac.common.models.CustomerOrdersBean;
import com.sac.customer.entity.CustomerEntity;
import com.sac.customer.entity.CustomerOrdersEntity;
import com.sac.customer.repository.CustomerOrderRepository;
import com.sac.customer.repository.CustomerRepository;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerService {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private Mapper mapper;
    @Resource
    private CustomerRepository customerRepository;

    @Resource
    private CustomerOrderRepository customerOrderRepository;


    public String addCustomer(CustomerBean customerBean) {
        CustomerEntity customerEntity = mapper.map(customerBean, CustomerEntity.class);
        customerEntity = customerRepository.save(customerEntity);
        return "Customer Created Successfully, Your CustomerId is "+customerEntity.getId();
    }

    public String createCustomerOrder(CustomerOrdersBean customerOrders) {
        LOG.debug("Going to create customer order");
        CustomerOrdersEntity customerOrder = mapper.map(customerOrders, CustomerOrdersEntity.class);
        customerOrderRepository.save(customerOrder);
        return "Order Created Successfully !!!";
    }

    public String deleteAllCustomers() {
        return "All customers deleted Successfully !!!";
    }

}
