package com.quiz.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "ronda")
public class Ronda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ronda")
    private Integer idRonda;

    @Column(name = "num_ronda")
    private Integer numRonda;

    public Integer getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(Integer idRonda) {
        this.idRonda = idRonda;
    }

    public Integer getNumRonda() {
        return numRonda;
    }

    public void setNumRonda(Integer numRonda) {
        this.numRonda = numRonda;
    }
}
