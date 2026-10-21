public class Questao2 {
    public static void main(String[] args) {
        AssinaContrato criadorContrato = new AssinaContrato();
        Matricula matriculaBrasileira = criadorContrato.matriculaBrasileiro("João", "12345678900");
        Matricula matriculaChilena = criadorContrato.matricularChileno("Maria", "8787-8");


        System.out.println("Brasileira:");
        matriculaBrasileira.relatorioMatricula();
        System.out.println("Chilena:");
        matriculaChilena.relatorioMatricula();
    }
}