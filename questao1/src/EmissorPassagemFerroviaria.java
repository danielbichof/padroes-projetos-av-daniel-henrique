public class EmissorPassagemFerroviaria extends AbsEmissor {
    @Override
    public Passagem emitir(String nome) {
        return new PassagemFerroviaria(nome);
    }
}