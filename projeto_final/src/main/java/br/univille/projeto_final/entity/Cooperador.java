package br.univille.projeto_final.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.CascadeType;


@Entity
public class Cooperador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 1000, nullable = false)
    //VERIFICAR ESSA MNESAGENS - NÃO ESTA FUNCIONANDO
    //@NotBlank(message = "Nome não pode estar em branco")
    private String nome;
    @Column(length = 3000)
    private String email;

    
    @Column(length = 5000)
    //CPF - VERIFICAR
    private String cpf;
            // Troquei de int para String.
            // TODO Auto-generated method stub
            //Verificar a anotação do CPF


   /* 
    //cooperador ->material
    private Cooperador quantidadeCooperador;

    //cooperador ->local 
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
    }*/

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
    
}