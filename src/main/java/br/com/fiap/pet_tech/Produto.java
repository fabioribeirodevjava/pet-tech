package br.com.fiap.pet_tech;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String descricao;
    private String urlDaImage;
    private double preco;

    public Produto() {}

    public Produto(UUID id, String nome, String descricao, String urlDaImage, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.urlDaImage = urlDaImage;
        this.preco = preco;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUrlDaImage() {
        return urlDaImage;
    }

    public void setUrlDaImage(String urlDaImage) {
        this.urlDaImage = urlDaImage;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", urlDaImage='" + urlDaImage + '\'' +
                ", preco=" + preco +
                '}';
    }
}
