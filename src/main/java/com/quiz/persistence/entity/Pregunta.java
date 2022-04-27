package com.quiz.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Integer idPregunta;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "repuesta_correcta")
    private String respuestaCorrecta;

    @Column(name = "puntos_dados")
    private Integer puntosDados;
//
//    @Column(name = "opciones")
//    private List<String> opciones;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Integer getPuntosDados() {
        return puntosDados;
    }

    public void setPuntosDados(Integer puntosDados) {
        this.puntosDados = puntosDados;
    }

//    public List<String> getOpciones() {
//        return opciones;
//    }
//
//    public void setOpciones(List<String> opciones) {
//        this.opciones = opciones;
//    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
