package org.example.ejemplo2;

import org.w3c.dom.ls.LSOutput;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 5);

        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("-------------Moto-------------");

        Motocicleta moto = new Motocicleta(250, "Susuki");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();

    }
}
