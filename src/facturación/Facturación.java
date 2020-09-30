package facturación;

import java.io.File;
import java.io.FileNotFoundException;

public class Facturación {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            String ruta = "Recursos/Inventario.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Ventana f = new Ventana();
        f.setVisible(true);
    }
}
