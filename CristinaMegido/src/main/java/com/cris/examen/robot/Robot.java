package com.cris.examen.robot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Robot {

	@Id
	private Integer id;
	
	@Column
	@Size(min=10, message="la orden no puede ser pequeña")
	private String orden;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", orden=" + orden + "]";
	}
}
