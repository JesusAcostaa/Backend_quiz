package com.quiz.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugador")
    private Integer idJugador;

    @Column(name = "nombre_jugador")
    private String nombreJugador;

    @Column(name = "estado_jugador")
    private Boolean estadoJugador;

    private Integer acumulado;

    @Column(name = "id_ronda")
    private Integer idRonda;

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Boolean getEstadoJugador() {
        return estadoJugador;
    }

    public void setEstadoJugador(Boolean estadoJugador) {
        this.estadoJugador = estadoJugador;
    }

    public Integer getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(Integer acumulado) {
        this.acumulado = acumulado;
    }

    public Integer getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(Integer idRonda) {
        this.idRonda = idRonda;
    }
}
