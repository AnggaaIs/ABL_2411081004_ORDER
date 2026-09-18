package com.angga.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angga.order.entity.Order;
import com.angga.order.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @GetMapping
  public List<Order> getAllOrder() {
    return orderService.getAllOrder();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Order> getOrderById(@PathVariable("id") Long id) {
    return ResponseEntity.ok(orderService.getOrderById(id));
  }

  @PostMapping
  public ResponseEntity<Order> createOrder(@RequestBody Order order) {
    return ResponseEntity.ok(orderService.saveOrder(order));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Order> updateOrder(@PathVariable("id") Long id, @RequestBody Order order) {
    return ResponseEntity.ok(orderService.updateOrder(id, order));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteOrder(@PathVariable("id") Long id) {
    orderService.deleteOrder(id);
    return ResponseEntity.noContent().build();
  }
}
