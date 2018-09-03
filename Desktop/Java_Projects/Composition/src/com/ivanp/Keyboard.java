package com.ivanp;

public class Keyboard {
    private String model;
    private String manufacturer;
    private Info info;

    public Keyboard(String model, String manufacturer, Info info) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.info = info;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Info getInfo() {
        return info;
    }

    public void type(String text) {
        System.out.println("You wrote: " + text);
    }
}
