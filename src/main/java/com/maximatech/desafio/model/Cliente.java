package com.maximatech.desafio.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;




@Entity
public class Cliente {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @NotBlank(message = "O código do cliente não pode estar em branco")
 private String codigo;
 
 @NotBlank(message = "O nome do cliente não pode estar em branco")
 private String nome;

 @NotBlank(message = "O CNPJ do cliente não pode estar em branco")
 @Pattern(regexp = "\\d{14}", message = "O CNPJ deve ter 14 dígitos")
 private String cnpj;
 
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "endereco_id")
 private Endereco endereco;


 
 public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public Cliente(Long id, String codigo, String nome, String cnpj, Endereco endereco) {
	super();
	this.id = id;
	this.codigo = codigo;
	this.nome = nome;
	this.cnpj = cnpj;
	this.endereco = endereco;
}

public Cliente() {
	
}

}
