package com.springbootacademy.batch8poinofsale.repo;

import com.springbootacademy.batch8poinofsale.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {


}
