package main;

import java.util.Arrays;
import java.util.List;

interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

class Edificio implements ImpactoEcologico {
    private double usoAnual;
    private double facturaAnual;

    public Edificio(double usoAnual, double facturaAnual) {
        this.usoAnual = usoAnual;
        this.facturaAnual = facturaAnual;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Implementar la lógica para calcular el impacto ecológico del carbono
        // por ejemplo, multiplicar el uso anual de energía por el costo anual
        return usoAnual * facturaAnual;
    }
}

class Auto implements ImpactoEcologico {
    private double capacidadTanque;
    private String tipoCombustible;

    public Auto(double capacidadTanque, String tipoCombustible) {
        this.capacidadTanque = capacidadTanque;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Implementar la lógica para calcular el impacto ecológico del carbono
        // por ejemplo, multiplicar la capacidad del tanque por el costo del combustible
        return capacidadTanque * tipoCombustible.hashCode();
    }
}

class Bicicleta implements ImpactoEcologico {
    private double peso;

    public Bicicleta(double peso) {
        this.peso = peso;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Implementar la lógica para calcular el impacto ecológico del carbono
        // por ejemplo, asumir que el peso de la bicicleta se traduce en una cierta cantidad de impacto ecológico
        return peso * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(50000, 2000);
        Auto auto = new Auto(20000, "Gasolina");
        Bicicleta bicicleta = new Bicicleta(500);

        List<ImpactoEcologico> listaObjetos = Arrays.asList(edificio, auto, bicicleta);

        for (ImpactoEcologico obj : listaObjetos) {
            System.out.println(obj.getClass().getSimpleName() + " con " + obj.obtenerImpactoEcologico() + " de impacto ecológico.");
        }
    }
}


