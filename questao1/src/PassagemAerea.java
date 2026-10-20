public class PassagemAerea extends Passagem {
    private static double VLR_EMBARQUE = 0.08;

    public PassagemAerea(String nome){
        super(nome, new String[]{"Documento com foto", "E-ticket"}, VLR_EMBARQUE);
    }
}