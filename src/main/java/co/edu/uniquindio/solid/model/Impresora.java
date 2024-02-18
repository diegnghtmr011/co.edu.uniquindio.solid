/**
 * Clase que representa una Impresora. Implementa la interfaz IConectable.
 *
 * @author Área de programación UQ - Camila Rosero y Diego Flores
 * @since 2024-02
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IConectable;

public class Impresora implements IConectable {
    public void conectar() {
        System.out.println("Impresora conectada.");
    }
}
