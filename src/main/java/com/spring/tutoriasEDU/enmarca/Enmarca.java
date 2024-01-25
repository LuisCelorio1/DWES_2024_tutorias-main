package com.spring.tutoriasEDU.enmarca;

import com.spring.tutoriasEDU.actividad.Actividad;
import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Enmarca {
	
	@EmbeddedId EnmarcaKey id;
	
	@ManyToOne
	@MapsId("actividad_id")
	@JoinColumn(name = "actividad_id")
	Actividad actividades;

	@ManyToOne
	@MapsId("plan_id")
	@JoinColumn(name = "plan_id")
	Plan planes;
	
	String fecha;

}
