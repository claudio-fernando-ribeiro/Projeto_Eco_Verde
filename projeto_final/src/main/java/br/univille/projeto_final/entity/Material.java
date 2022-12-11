package br.univille.projeto_final.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 1000,unique = true)
    private String nome;
    @Column(length = 3000)
    private float quantidade;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.REMOVE})
    private Cooperador cooperador;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    private Residuo residuotipo;
    
    public Cooperador getCooperador() {
        return cooperador;
    }
    public void setCooperador(Cooperador cooperador) {
        this.cooperador = cooperador;
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
    public float getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    public Residuo getResiduotipo() {
        return residuotipo;
    }
    public void setResiduotipo(Residuo residuotipo) {
        this.residuotipo = residuotipo;
    }

    
}