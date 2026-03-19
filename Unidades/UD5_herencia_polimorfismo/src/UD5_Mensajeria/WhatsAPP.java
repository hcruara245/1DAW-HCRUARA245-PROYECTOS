package UD5_Mensajeria;

public class WhatsAPP extends Mensaje{

    public WhatsAPP(String contenido, String destinatario, boolean enviado) {
        super(contenido, destinatario, enviado);
    }

    @Override
    public boolean validarDestino() {
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
}
