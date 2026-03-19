package UD5_Mensajeria;

public abstract class Mensaje {
    protected String contenido;
    protected String destinatario;
    protected boolean enviado;

    public Mensaje(String contenido, String destinatario, boolean enviado) {
        this.contenido = contenido;
        this.destinatario = destinatario;
        this.enviado = enviado;
    }

    public abstract boolean validarDestinatario();

    @Override
    public String toString() {
        return "MENSAJE: " + contenido + " DESTINATARIO: " + destinatario + " ? ENVIADO: " + enviado;
    }

    public boolean isEnviado() {
        return enviado;
    }
}