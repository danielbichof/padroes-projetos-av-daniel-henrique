public class PassagemRodoviaria extends Passagem {
    private static double VLR_EMBARQUE = 0.05;

    public PassagemRodoviaria(String nome){
        super(nome, new String[]{"Documento com foto", "Comprovante de reserva"}, VLR_EMBARQUE);
    }
}