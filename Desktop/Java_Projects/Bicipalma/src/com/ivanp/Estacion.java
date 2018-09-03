package com.ivanp;

public class Estacion {
    private int id;
    private String direccion;
    private int numeroAnclajes;
    private Bicicleta[] anclaje;

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclaje = new Bicicleta[numeroAnclajes];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    public void setNumeroAnclajes(int numeroAnclajes) {
        this.numeroAnclajes = numeroAnclajes;
    }

    public Bicicleta[] getAnclaje() {
        return anclaje;
    }

    public void setAnclaje(Bicicleta[] anclaje) {
        this.anclaje = anclaje;
    }

    public void consultarEstacion() {
        System.out.println("ID: " + this.id + ", direccion " + this.direccion + ", numero anclajes: " + this.numeroAnclajes);
    }

    public int anclajesLibres() {
        int anclajes = 0;

        for (Bicicleta ancl : this.anclaje) {
            if (ancl != null) {
                anclajes++;
            }
        }

        return anclajes;
    }
}
