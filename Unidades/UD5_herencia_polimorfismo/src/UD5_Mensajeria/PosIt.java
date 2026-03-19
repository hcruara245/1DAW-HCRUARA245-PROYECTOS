package UD5_Mensajeria;

public class PosIt extends Mensaje{
    public PosIt(String contenido) {
        super(contenido, "", false);
    }

    @Override
    public boolean validarDestinatario() {
        return true;
    }
}
