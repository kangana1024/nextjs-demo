package com.csipro.test.basic.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "name") private String name;

  @Column(name = "address") private String address;

  @Column(name = "dob") private String dob;

  @Column(name = "number") private String number;

  @Column(name = "amount") private Double amount;

  @Column(name = "createdAt") private Date createdAt;

  @Column(name = "createdBy") private String createdBy;

  @Column(name = "updatedAt") private Date updatedAt;

  @Column(name = "updatedBy") private String updatedBy;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "account_id", referencedColumnName = "id")
  private AccountEntity account;

  public Integer getId() { return id; }

  public void setId(Integer id) { this.id = id; }

  public String getAddress() { return address; }
  public void setAddress(String address) { this.address = address; }
  public String getDob() { return dob; }
  public void setDob(String dob) { this.dob = dob; }
  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String getNumber() { return number; }

  public void setNumber(String number) { this.number = number; }

  public Date getCreatedAt() { return createdAt; }

  public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

  public String getCreatedBy() { return createdBy; }

  public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

  public Date getUpdatedAt() { return updatedAt; }

  public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }

  public String getUpdatedBy() { return updatedBy; }

  public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }

  public Double getAmount() { return amount; }

  public void setAmount(Double amount) { this.amount = amount; }
}
