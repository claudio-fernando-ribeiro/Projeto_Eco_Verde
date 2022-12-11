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

    @Column(length = 1000, nullable = false)
    @NotBlank (message = "CPF não pode ser em branco")
    private String cpf;

    @Column(length = 4000, nullable = false)
    @NotBlank (message = "Email não pode ser em branco")
    private String email;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    private Residuo tipoResiduo;

    private int pontos;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Residuo getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(Residuo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
}