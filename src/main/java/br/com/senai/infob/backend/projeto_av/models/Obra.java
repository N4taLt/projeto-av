package br.com.senai.infob.backend.projeto_av.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "Obra")
public class Obra {
    

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "local")
    private String local;

    @Column (name = "responsavel")
    private String responsavel;

    public Obra() {
    }

    public Obra(Integer id, String local, String responsavel) {
        this.id = id;
        this.local = local;
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    
}
