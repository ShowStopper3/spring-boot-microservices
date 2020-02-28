package com.sac.customer.repository;

import com.sac.customer.entity.CustomerOrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrdersEntity, Long> {

    List<CustomerOrdersEntity> findByCustomerId(Long customerId);

    CustomerOrdersEntity findByCustomerIdAndOrderId(Long customerId, Long orderId);

    CustomerOrdersEntity findByOrderId(Long orderId);


}
