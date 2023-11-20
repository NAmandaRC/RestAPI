package Utilitarios;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {

    private static GetProperties instancia = null;
    private String enlace;
    private String usuario;
    private String contrasena;

    private GetProperties(){
        Properties properties = new Properties();
        String nameFile ="data.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);

        if (inputStream != null){
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        enlace=properties.getProperty("direccion");
        usuario=properties.getProperty("usertest");
        contrasena=properties.getProperty("pass");

    }

    public static GetProperties getInstance(){
        if (instancia == null)
            instancia = new GetProperties();
        return instancia;
    }

    public String getEnlace() {
        return enlace;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
