package com.academiasi.spring.app.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String apellido;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String telefono;

	@NotEmpty
	private String otro;

	@NotEmpty
	private String comunietica;

	@NotEmpty
	private String sexo;

	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechanac;

	@NotEmpty
	private String lugarnac;

	@NotEmpty
	private String papependiente;

	@NotEmpty
	private String niveleducativo;

	@NotEmpty
	private String dpi;

	@NotEmpty
	private String extendida;

	@NotEmpty
	private String direccion;

	@NotEmpty
	private String municipio;

	@NotEmpty
	private String departamento;

	public Long getId() {
		return id;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getOtro() {
		return otro;
	}

	public String getComunietica() {
		return comunietica;
	}

	public String getSexo() {
		return sexo;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public String getLugarnac() {
		return lugarnac;
	}

	public String getPapependiente() {
		return papependiente;
	}

	public String getNiveleducativo() {
		return niveleducativo;
	}

	public String getDpi() {
		return dpi;
	}

	public String getExtendida() {
		return extendida;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getDepartamento() {
		return departamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setOtro(String otro) {
		this.otro = otro;
	}

	public void setComunietica(String comunietica) {
		this.comunietica = comunietica;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public void setLugarnac(String lugarnac) {
		this.lugarnac = lugarnac;
	}

	public void setPapependiente(String papependiente) {
		this.papependiente = papependiente;
	}

	public void setNiveleducativo(String niveleducativo) {
		this.niveleducativo = niveleducativo;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	public void setExtendida(String extendida) {
		this.extendida = extendida;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	private static final long serialVersionUID = 1L;

}
