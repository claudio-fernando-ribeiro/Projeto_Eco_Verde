package br.univille.projeto_final.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Cooperador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 1000, nullable = false)
    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @Column(length = 3000, nullable = false)
    @NotBlank (message = "CPF não pode ser em branco")
    private String cpf;

    @Column(length = 4000, nullable = false)
    @NotBlank (message = "Email não pode ser em branco")
    private String email;

    private String pontos;

    private String quantidadeResiduo;
    
    public String getQuantidadeResiduo() { //teste para ver se funciona a quantidade
        return quantidadeResiduo;
    }
    public void setQuantidadeResiduo(String quantidadeResiduo) { //teste para ver se funciona a quantidade
        this.quantidadeResiduo = quantidadeResiduo;
    }
    //cooperador -> material
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    private Cooperador quantidadeCooperador;

    //cooperador ->local 
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    private Cooperador listaDeLocais;

    public Cooperador getQuantidadeCooperador() {
        return quantidadeCooperador;
    }
    public void setQuantidadeCooperador(Cooperador quantidadeCooperador) {
        this.quantidadeCooperador = quantidadeCooperador;
    }
    public Cooperador getListaDeLocais() {
        return listaDeLocais;
    }
    public void setListaDeLocais(Cooperador listaDeLocais) {
        this.listaDeLocais = listaDeLocais;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getPontos() {
        return pontos;
    }
    public void setPontos(String pontos) {
        this.pontos = pontos;
    }
}