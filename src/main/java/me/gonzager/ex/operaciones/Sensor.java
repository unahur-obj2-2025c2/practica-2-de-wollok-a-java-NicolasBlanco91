package me.gonzager.ex.operaciones;

public class Sensor {
    private final Double capacidad;
    private final Double durabilidad;
    private final Boolean mejorasTecnologicas;
    
    public Sensor(Double capacidad, Double durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public Double getDurabilidad() {
        return durabilidad;
    }

    public Boolean getMejorasTecnologicas() {
        return mejorasTecnologicas;
    }

    
    
}
