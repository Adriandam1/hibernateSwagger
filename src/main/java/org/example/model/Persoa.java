package org.example.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "persoa")
public class Persoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sino borrar el id cuando usemos swagger en el boton
    // otra opcion seria
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JsonIgnore
    private Long id;
    private String nome;
    private int idade;
    private String email;

    // Construtores
    public Persoa() {
    }

    public Persoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
