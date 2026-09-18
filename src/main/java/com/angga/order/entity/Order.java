package com.angga.order.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"order\"")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long produk_id;
  private Long pelanggan_id;
  private LocalDate tgl_trans;
  private Integer jumlah;
  private Double total;

  public Order() {
  }

  public Order(Long id, Long produk_id, Long pelanggan_id, LocalDate tgl_trans, Integer jumlah, Double total) {
    this.id = id;
    this.produk_id = produk_id;
    this.pelanggan_id = pelanggan_id;
    this.tgl_trans = tgl_trans;
    this.jumlah = jumlah;
    this.total = total;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getProduk_id() {
    return produk_id;
  }

  public void setProduk_id(Long produk_id) {
    this.produk_id = produk_id;
  }

  public Long getPelanggan_id() {
    return pelanggan_id;
  }

  public void setPelanggan_id(Long pelanggan_id) {
    this.pelanggan_id = pelanggan_id;
  }

  public LocalDate getTgl_trans() {
    return tgl_trans;
  }

  public void setTgl_trans(LocalDate tgl_trans) {
    this.tgl_trans = tgl_trans;
  }

  public Integer getJumlah() {
    return jumlah;
  }

  public void setJumlah(Integer jumlah) {
    this.jumlah = jumlah;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }
}
