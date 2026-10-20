public class PassagemFerroviaria extends Passagem {
    private static double VLR_EMBARQUE = 0.03;

    public PassagemFerroviaria(String nome){
        super(nome, new String[]{"Documento com foto", "Comprovante de reserva"}, VLR_EMBARQUE);
        }
}