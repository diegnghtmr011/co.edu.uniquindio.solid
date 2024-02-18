/**
 * Clase principal que demuestra el uso del sistema de componentes de computador.
 *
 * @author Área de programación UQ - Camila Rosero y Diego Flores
 * @since 2024-02
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
package co.edu.uniquindio.solid;

import co.edu.uniquindio.solid.model.*;
import co.edu.uniquindio.solid.services.IComponenteComputador;
import co.edu.uniquindio.solid.services.IConectable;

public class Main {
    public static void main(String[] args) {
        Computador miComputador = new Computador("MarcaX", "ModeloY");

        // Creación de componentes
        IConectable miTeclado = new Teclado();
        IConectable miRaton = new Raton();
        IConectable miWebcam = new Webcam(); // Este necesita ser adaptado a Conectable si sigue Inicializable

        // Añadiendo componentes al computador
        miComputador.añadirComponente(miTeclado);
        miComputador.añadirComponente(miRaton);
        miComputador.añadirComponente(miWebcam);

        // Conectar todos los componentes
        miComputador.conectarComponentes();
    }
}