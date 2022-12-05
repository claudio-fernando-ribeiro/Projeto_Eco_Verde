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
    private ArrayList listaMaterialRecebido;

    public ArrayList getListaMaterialRecebido() {
        return listaMaterialRecebido;
    }
    public void setListaMaterialRecebido(ArrayList listaMaterialRecebido) {
        this.listaMaterialRecebido = listaMaterialRecebido;
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