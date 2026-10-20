public class EmissorPassagemAerea extends AbsEmissor {
    @Override
    public Passagem emitir(String nome) {
        return new PassagemAerea(nome);
    }
}