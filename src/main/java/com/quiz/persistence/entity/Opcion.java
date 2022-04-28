package com.quiz.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "opciones")
public class Opcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opcion")
    private Integer idOpcion;

    @Column(name = "id_pregunta")
    private Integer idPregunta;

    @Column(name = "contenido_opcion")
    private String contenidoOpcion;


    private boolean esCorrecta;

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getContenidoOpcion() {
        return contenidoOpcion;
    }

    public void setContenidoOpcion(String contenidoOpcion) {
        this.contenidoOpcion = contenidoOpcion;
    }
}
