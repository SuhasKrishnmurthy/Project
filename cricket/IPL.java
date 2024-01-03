package com.cricket;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IPL {
@Id
private int T_num;
private String Name;
private String Captain;
private double Price;
public int getT_num() {
	return T_num;
}
public void setT_num(int t_num) {
	T_num = t_num;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCaptain() {
	return Captain;
}
public void setCaptain(String captain) {
	Captain = captain;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public IPL() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "IPL [T_num=" + T_num + ", Name=" + Name + ", Captain=" + Captain + ", Price=" + Price + "]";
}

}
