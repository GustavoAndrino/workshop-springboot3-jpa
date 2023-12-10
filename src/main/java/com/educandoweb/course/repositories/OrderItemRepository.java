package com.educandoweb.course.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.User;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
