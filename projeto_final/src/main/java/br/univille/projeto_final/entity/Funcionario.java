package br.univille.projeto_final.entity;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private ArrayList listaMaterial;

    public ArrayList getListaMaterial() {
        return listaMaterial;
    }
    public void setListaMaterial(ArrayList listaMaterial) {
        this.listaMaterial = listaMaterial;
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
}