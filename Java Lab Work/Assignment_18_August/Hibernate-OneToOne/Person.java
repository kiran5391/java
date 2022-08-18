package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String city;
	
	@OneToOne
	private Car Car;
	
	
	public Person(int pid, String pname, String city) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.city = city;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return Car;
	}
	public void setCar(Car car) {
		Car = car;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
