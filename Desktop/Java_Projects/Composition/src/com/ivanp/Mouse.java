package com.ivanp;

public class Mouse {
    private String model;
    private String manufacturer;

    public Mouse(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void click(String button) {
        switch (button) {
            case "middle":
                System.out.println("You pressed the middle button");
                break;
            case "left":
                System.out.println("You pressed the left button");
                break;
            case "right":
                System.out.println("You pressed the right button");
                break;
            default:
                System.out.println(button + " is invalid. Mouse only has left, right and middle buttons");
        }
    }
}
