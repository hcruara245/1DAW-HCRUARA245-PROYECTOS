package UD5_Mensajeria;

public class WhatsApp extends Mensaje implements Enviable{

    public WhatsApp(String destinatario, String contenido) {
        super(contenido, destinatario, false);
    }

    @Override
    public boolean validarDestinatario() {
        boolean valido = true;

        if (super.destinatario.length() != 9){
            valido = false;
        }
        else {
            for (int i = 0; i < super.destinatario.length(); i++) {
                String caracter = String.valueOf(super.destinatario.charAt(i));
                if (!isNumeric(caracter)){
                    valido = false;
                }
            }
        }

        return valido;
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    @Override
    public void enviar() {
        super.enviado = true;
    }
}
