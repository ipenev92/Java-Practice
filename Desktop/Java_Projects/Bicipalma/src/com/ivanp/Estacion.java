package com.ivanp;

import java.util.concurrent.ThreadLocalRandom;

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

    public void consultarEstacion() {
        System.out.println("ID: " + this.id + ", direccion: " + this.direccion + ", numero anclajes: " + this.numeroAnclajes);
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

    public void consultarAnclajes() {
        int anclajes = 1;

        for (Bicicleta ancl : this.anclaje) {
            if (ancl != null) {
                System.out.println("El anclaje numero " + this.anclaje[anclajes].getId() + " ocupado.");
            } else {
                System.out.println("El anclaje numero " + this.anclaje[anclajes].getId() + " libre.");
            }

            anclajes++;
        }
    }

    public void anclarBicicleta(Bicicleta bici) {
        int anclajes = 1;

        for (Bicicleta ancl : this.anclaje) {
            if (ancl == null) {
                this.anclaje[anclajes] = bici;
                System.out.println("Bicicleta anclada");
                break;
            } else {
                anclajes++;
            }
        }
    }

    public void mostrarAnclaje(Bicicleta bici, int numeroAnclajes) {
        System.out.println("Retirada: " + bici.getId() + ", anclaje: " + numeroAnclajes);
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjeta) {
        if (tarjeta.isActivada()) {
            return true;
        } else {
            return false;
        }
    }

    public void retirarBicicleta(TarjetaUsuario tarjeta) {
        if (leerTarjetaUsuario(tarjeta)) {
            while (true) {
                int pos = generarAnclaje();
                int anclaje = pos + 1;

                if (this.anclaje[pos] != null) {
                    mostrarBicicleta(this.anclaje[pos], numeroAnclajes);
                    this.anclaje[pos] = null;
                    break;
                }
            }
        } else {
            System.out.println("Tarjeta: false");
        }
    }

    public void mostrarBicicleta(Bicicleta bici, int numeroAnclajes) {
        System.out.println("Anclada: " + bici.getId() + ", anclaje: " + numeroAnclajes);
    }

    public int generarAnclaje(){ // a hardware anclaje
        return ThreadLocalRandom.current().nextInt(0, this.anclaje.length);
    }
}
