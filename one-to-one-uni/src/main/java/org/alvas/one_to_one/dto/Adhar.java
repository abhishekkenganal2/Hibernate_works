package org.alvas.one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int adharnumber;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdharnumber() {
		return adharnumber;
	}

	public void setAdharnumber(int adharnumber) {
		this.adharnumber = adharnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Adhar [id=" + id + ", adharnumber=" + adharnumber + ", address=" + address + "]";
	}

}
