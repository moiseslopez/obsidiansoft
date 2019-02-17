package com.test.project.model;

import java.util.List;

public class Response {
	private List<?> datos;
	private String mensaje;
	private List<String> errores;
	private String status;
	
	public List<?> getDatos() {
		return datos;
	}
	public void setDatos(List<?> datos) {
		this.datos = datos;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public List<String> getErrores() {
		return errores;
	}
	public void setErrores(List<String> errores) {
		this.errores = errores;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
