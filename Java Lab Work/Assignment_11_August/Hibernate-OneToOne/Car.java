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
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_no;
	private String car_brand;
	
	@OneToOne
	private Person person;
	
	public Car(int car_no, String car_brand) {
		super();
		this.car_no = car_no;
		this.car_brand = car_brand;
	}


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public int getCar_no() {
		return car_no;
	}


	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}


	public String getCar_brand() {
		return car_brand;
	}


	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}	
	
	
}
