package br.univille.projeto_final.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListaDeLocais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ArrayList listaDeLocais;

    public ArrayList getListaDeLocais() {
        return listaDeLocais;
    }

    public void setListaDeLocais(ArrayList listaDeLocais) {
        this.listaDeLocais = listaDeLocais;
    }

    public ListaDeLocais(ArrayList listaDeLocais) {
        this.listaDeLocais = listaDeLocais;
    }
    
}
