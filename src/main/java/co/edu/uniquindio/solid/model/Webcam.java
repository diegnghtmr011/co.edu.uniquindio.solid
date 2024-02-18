/**
 * Clase que representa una Webcam. Implementa la interfaz IConectable e IInicializable.
 *
 * @author Área de programación UQ - Camila Rosero y Diego Flores
 * @since 2024-02
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IConectable;
import co.edu.uniquindio.solid.services.IInicializable;

public class Webcam implements IConectable, IInicializable{
    public void conectar() {
        System.out.println("Webcam conectada.");
    }

    public void inicializar() {
        System.out.println("Webcam inicializada.");
    }
}
