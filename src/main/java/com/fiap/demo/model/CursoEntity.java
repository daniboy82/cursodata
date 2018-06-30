package com.fiap.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "curso", schema = "public", catalog = "postgres")
public class CursoEntity {
    private int id;
    private String nome;
    private String situacao;

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
    @Column(name = "situacao", nullable = true, length = -1)
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursoEntity that = (CursoEntity) o;
        return id == that.id &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(situacao, that.situacao);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nome, situacao);
    }
}
