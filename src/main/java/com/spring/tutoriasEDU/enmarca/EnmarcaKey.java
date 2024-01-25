package com.spring.tutoriasEDU.enmarca;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EnmarcaKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	Long actividad_id;
	@Column
	Long plan_id;

}
