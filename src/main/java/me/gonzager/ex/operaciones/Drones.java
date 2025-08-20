package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

public abstract class Drones {
    private Double Autonmia;
    private Integer NivelProcesamiento;
    private Mision mision;
    private List<Sensor> sensores = new ArrayList<>();
    
    public Drones(double autonmia, Integer nivelProcesamiento, Mision mision) {
        Autonmia = autonmia;
        NivelProcesamiento = nivelProcesamiento;
        this.mision = mision;
    }

    public Double getAutonmia() {
        return Autonmia;
    }

    public void setAutonmia(Double autonmia) {
        Autonmia = autonmia;
    }

    public Integer getNivelProcesamiento() {
        return NivelProcesamiento;
    }

    public void setNivelProcesamiento(Integer nivelProcesamiento) {
        NivelProcesamiento = nivelProcesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }
    
    public void añadirSensor(Sensor unSensor){
        if (this.mision == Vigilancia){
            sensores.add(unSensor);
        }
    }
    

}
