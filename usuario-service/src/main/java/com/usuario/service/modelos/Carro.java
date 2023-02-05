package com.usuario.service.modelos;

public class Carro {

	private String marca;
	private String modelo; //estos mas lo uso para GET consultas
	private int usuarioId;  //esto es una conexion directo por eso, para los POST save

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Carro() {
		super();
	}

}
