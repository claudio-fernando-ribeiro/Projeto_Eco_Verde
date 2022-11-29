package br.univille.projeto_final.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ResiduosNeutralizados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private float metano;
    private float co2;
    private float chorume;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Material quantidadeMaterial;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getMetano() {
        return metano;
    }
    public void setMetano(float metano) {
        this.metano = metano;
    }
    public float getCo2() {
        return co2;
    }
    public void setCo2(float co2) {
        this.co2 = co2;
    }
    public float getChorume() {
        return chorume;
    }
    public void setChorume(float chorume) {
        this.chorume = chorume;
    }
    public Material getQuantidadeMaterial() {
        return quantidadeMaterial;
    }
    public void setQuantidadeMaterial(Material quantidadeMaterial) {
        this.quantidadeMaterial = quantidadeMaterial;
    }
}