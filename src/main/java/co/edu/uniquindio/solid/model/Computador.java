/**
 * Clase que representa un Computador.
 *
 * @author Área de programación UQ - Camila Rosero y Diego Flores
 * @since 2024-02
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IConectable;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String marca;
    private String modelo;
    private List<IConectable> componentes; // Lista de componentes conectables


    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void describirComputador() {
        System.out.println("Computador marca " + marca + ", modelo " + modelo);
    }

    // Método para añadir componentes
    public void añadirComponente(IConectable componente) {
        componentes.add(componente);
        System.out.println("Componente añadido al computador.");
    }

    // Método para conectar todos los componentes
    public void conectarComponentes() {
        for (IConectable componente : componentes) {
            componente.conectar();
        }
    }
}
