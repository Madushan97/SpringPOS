package com.springbootacademy.batch8poinofsale.Repository;

import com.springbootacademy.batch8poinofsale.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {


}
