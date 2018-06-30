package com.fiap.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cordenador", schema = "public", catalog = "postgres")
public class CordenadorEntity {
    private int id;
    private String nome;
    private String email;
    private String celular;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nome", nullable = true, length = -1)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "celular", nullable = true, length = -1)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CordenadorEntity that = (CordenadorEntity) o;
        return id == that.id &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(email, that.email) &&
                Objects.equals(celular, that.celular);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nome, email, celular);
    }
}
