package com.angga.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angga.order.entity.Order;
import com.angga.order.repository.OrderRepository;

@Service
public class OrderService {
  @Autowired
  private OrderRepository orderRepository;

  public Order getOrderById(Long id) {
    return orderRepository.findById(id).orElse(null);
  }

  public List<Order> getAllOrder() {
    return orderRepository.findAll();
  }

  public Order saveOrder(Order order) {
    return orderRepository.save(order);
  }

  public void deleteOrder(Long id) {
    orderRepository.deleteById(id);
  }

  public Order updateOrder(Long id, Order order) {
    Order existingOrder = orderRepository.findById(id).orElse(null);
    if (existingOrder != null) {
      existingOrder.setProduk_id(order.getProduk_id());
      existingOrder.setPelanggan_id(order.getPelanggan_id());
      existingOrder.setTgl_trans(order.getTgl_trans());
      existingOrder.setJumlah(order.getJumlah());
      existingOrder.setTotal(order.getTotal());
      return orderRepository.save(existingOrder);
    }
    return null;
  }
}
