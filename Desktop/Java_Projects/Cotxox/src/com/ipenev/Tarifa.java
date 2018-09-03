package com.ipenev;

public class Tarifa {
    private double costeMilla;
    private double costeMinuto;
    private double costeMinimo;
    private byte porcentajeComision;

    public Tarifa() {
        this.costeMilla = 1.35;
        this.costeMinuto = 0.35;
        this.costeMinimo = 5.0;
        this.porcentajeComision = 20;
    }

    public double getCosteMilla() {
        return costeMilla;
    }

    public void setCosteMilla(double costeMilla) {
        this.costeMilla = costeMilla;
    }

    public double getCosteMinuto() {
        return costeMinuto;
    }

    public void setCosteMinuto(double costeMinuto) {
        this.costeMinuto = costeMinuto;
    }

    public double getCosteMinimo() {
        return costeMinimo;
    }

    public void setCosteMinimo(double costeMinimo) {
        this.costeMinimo = costeMinimo;
    }

    public byte getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(byte porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getCosteDistancia(double distancia) {
        return distancia * this.costeMilla;
    }

    public double getCosteTiempo(int minutos) {
        return minutos * this.costeMinuto;
    }

    public double getCosteTotalEsperado(carrera) {
        //TODO when we have the correct object
    }
}
