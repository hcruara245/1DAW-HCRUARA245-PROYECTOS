package UD5_Mensajeria;

public class Email extends Mensaje{
    private String asunto;

    public Email(String contenido, String destinatario, boolean enviado, String asunto) {
        super(contenido, destinatario, enviado);
        this.asunto = asunto;
    }


    @Override
    public boolean validarDestino() {
        boolean validado = false;

        String[] caracteresDestino = super.destinatario.split("@");
        if (caracteresDestino.length == 2){
            if (caracteresDestino[0] != null && caracteresDestino[1] != null){
                validado = true;
            }
        }

        return validado;
    }
}
