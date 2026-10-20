public class Questao {
    public static void main(String[] args){
        AbsEmissor emissorAerea = new EmissorPassagemAerea();
        Passagem passagemAerea = emissorAerea.emitir("Joao da silva");
        passagemAerea.imprimir();

        AbsEmissor emissorFerroviaria = new EmissorPassagemFerroviaria();
        Passagem passagemFe = emissorFerroviaria.emitir("Maria de Souza");
        passagemFe.imprimir();

        AbsEmissor emissorRo = new EmissorPassagemRodoviaria();
        Passagem passagemRo = emissorRo.emitir("Daniel Henrique");
        passagemRo.imprimir();
    }
}