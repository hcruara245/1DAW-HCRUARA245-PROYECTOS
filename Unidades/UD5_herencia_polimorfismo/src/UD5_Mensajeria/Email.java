package UD5_Mensajeria;

public class Email extends Mensaje implements Enviable{
    private String asunto;

    public Email(String destinatario, String asunto, String contenido) {
        super(contenido, destinatario, false);
        this.asunto = asunto;
    }


    @Override
    public boolean validarDestinatario() {
        boolean validado = false;

        String[] caracteresDestino = super.destinatario.split("@");
        if (caracteresDestino.length == 2){
            if (!caracteresDestino[0].isEmpty() && !caracteresDestino[1].isEmpty()){
                validado = true;
            }
        }

        return validado;
    }

    @Override
    public void enviar() {
        super.enviado = true;
    }
}
