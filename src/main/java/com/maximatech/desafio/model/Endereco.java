package com.maximatech.desafio.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Endereco {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @NotBlank(message = "A rua não pode estar em branco")
 private String rua;

 @NotBlank(message = "O número não pode estar em branco")
 private String numero;

 @NotBlank(message = "A cidade não pode estar em branco")
 private String cidade;

 @NotBlank(message = "O estado não pode estar em branco")
 private String estado;

 @NotBlank(message = "O CEP não pode estar em branco")
 private String cep;

 
 @DecimalMin(value = "-90.0", inclusive = false, message = "A latitude deve ser maior que -90")
 private Double latitude;

 @DecimalMin(value = "-180.0", inclusive = false, message = "A longitude deve ser maior que -180")
 private Double longitude;

 
 public Endereco() {
	 
 }
 
 
 public Endereco(Long id, String rua, String numero, String cidade, String estado, String cep, Double latitude,
		Double longitude) {
	super();
	this.id = id;
	this.rua = rua;
	this.numero = numero;
	this.cidade = cidade;
	this.estado = estado;
	this.cep = cep;
	this.latitude = latitude;
	this.longitude = longitude;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getRua() {
	return rua;
}


public void setRua(String rua) {
	this.rua = rua;
}


public String getNumero() {
	return numero;
}


public void setNumero(String numero) {
	this.numero = numero;
}


public String getCidade() {
	return cidade;
}


public void setCidade(String cidade) {
	this.cidade = cidade;
}


public String getEstado() {
	return estado;
}


public void setEstado(String estado) {
	this.estado = estado;
}


public String getCep() {
	return cep;
}


public void setCep(String cep) {
	this.cep = cep;
}


public Double getLatitude() {
	return latitude;
}


public void setLatitude(Double latitude) {
	this.latitude = latitude;
}


public Double getLongitude() {
	return longitude;
}


public void setLongitude(Double longitude) {
	this.longitude = longitude;
}

 
 
 // getters, setters e construtores
}
