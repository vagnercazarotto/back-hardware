package com.ucs.hardware.hardwaredata.model;

import java.sql.Timestamp;
import java.util.Objects;

public class AmostragemEntity {

    private int id;

    private float tensao;

    private float corrente;

    private Timestamp time;

    public AmostragemEntity(int id, float tensao, float corrente, Timestamp time) {
        this.id = id;
        this.tensao = tensao;
        this.corrente = corrente;
        this.time = time;
    }

    public AmostragemEntity() {
    }

    public int getId() {
        return id;
    }

    public float getTensao() {
        return tensao;
    }

    public float getCorrente() {
        return corrente;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public void setCorrente(float corrente) {
        this.corrente = corrente;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmostragemEntity that = (AmostragemEntity) o;
        return id == that.id && Float.compare(that.tensao, tensao) == 0 && Float.compare(that.corrente, corrente) == 0 && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tensao, corrente, time);
    }
}
