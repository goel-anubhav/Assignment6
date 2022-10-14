package com.example.hibernateexmple;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class agent {

	@Id

	private int id;
	private String name,city;
	private int comm_amt;

	@Override
	public String toString() {
		return "agent [id=" + id + ", name=" + name + ", city=" + city + ", comm_amt=" + comm_amt + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getcomm_amt() {
		return comm_amt;
	}
	public void setcomm_amt(int comm_amt) {
		this.comm_amt = comm_amt;
	}
}
