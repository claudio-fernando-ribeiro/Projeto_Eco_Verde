package br.univille.projeto_final.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quantidade;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Cooperador quantidadePorFuncionario;
    
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Cooperador getQuantidadePorFuncionario() {
        return quantidadePorFuncionario;
    }
    public void setQuantidadePorFuncionario(Cooperador quantidadePorFuncionario) {
        this.quantidadePorFuncionario = quantidadePorFuncionario;
    }
}