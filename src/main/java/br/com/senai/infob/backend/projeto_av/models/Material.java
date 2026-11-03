package br.com.senai.infob.backend.projeto_av.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "Material")
public class Material {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "tipo")
    private String tipo;

    @ManyToOne 
    @JoinColumn (name="obra_id")
    private Obra obra;

    public Material() {
    }

    public Material(Integer id, String nome, Obra obra, String tipo) {
        this.id = id;
        this.nome = nome;
        this.obra = obra;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }




    
}
