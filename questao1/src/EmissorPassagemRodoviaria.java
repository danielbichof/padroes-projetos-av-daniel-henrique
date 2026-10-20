public class EmissorPassagemRodoviaria extends AbsEmissor {
    @Override
    public Passagem emitir(String nome) {
        return new PassagemRodoviaria(nome);
    }
}