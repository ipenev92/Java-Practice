package com.ivanp;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private Mouse mouse;
    private Keyboard keyboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard, Mouse mouse, Keyboard keyboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
