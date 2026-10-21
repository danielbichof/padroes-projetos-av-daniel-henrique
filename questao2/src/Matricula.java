public class Matricula {
    private String documentoFiscal;
    private String tipoImposto;
    private double vlrImposto;
    private String nomeEstudante;
    private String documentoEstudante;
    private String tipoDocumentoEstudante;
    private String tipoPagamento;

    public Matricula(
            String documentoFiscal,
            String tipoImposto,
            double vlrImposto,
            String tipoDocumentoEstudante,
            String tipoPagamento,
            String nomeEstudante,
            String documentoEstudante
        ) {
        this.documentoFiscal = documentoFiscal;
        this.tipoImposto = tipoImposto;
        this.vlrImposto = vlrImposto;
        this.tipoDocumentoEstudante = tipoDocumentoEstudante;
        this.nomeEstudante = nomeEstudante;
        this.documentoEstudante = documentoEstudante;
        this.tipoPagamento = tipoPagamento;
    }

    public void relatorioMatricula() {
        System.out.println("Relatório de Matrícula:");
        System.out.println("Documento Fiscal: " + documentoFiscal);
        System.out.println("Imposto: " + tipoImposto);
        System.out.println("Tipo de Pagamento: " + tipoPagamento);
        System.out.println("Valor do Imposto: " + vlrImposto);
        System.out.println("Nome do Estudante: " + nomeEstudante);
        System.out.println("Documento do Estudante: " + documentoEstudante);
        System.out.println("Tipo de Documento do Estudante: " + tipoDocumentoEstudante);
    }
}
