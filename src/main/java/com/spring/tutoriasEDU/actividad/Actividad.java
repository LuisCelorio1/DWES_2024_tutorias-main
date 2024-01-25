package com.spring.tutoriasEDU.actividad;

import java.util.HashSet;
import java.util.Set;

import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Actividad {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String nombre;
	private String descripcion;
	private String obligatoria;
	
	@OneToMany(targetEntity=com.spring.tutoriasEDU.enmarca.Enmarca.class,
			mappedBy="actividades")
	private Set<Plan> planes = new HashSet<Plan>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String isObligatoria() {
		return obligatoria;
	}

	public void setObligatoria(String obligatoria) {
		this.obligatoria = obligatoria;
	}

	public Set<Plan> getPlanes() {
		return planes;
	}

	public void setPlanes(Set<Plan> planes) {
		this.planes = planes;
	}

	@Override
	public String toString() {
		return "Actividad [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", obligatoria="
				+ obligatoria + ", planes=" + planes + "]";
	}
	
	
	
	
}
