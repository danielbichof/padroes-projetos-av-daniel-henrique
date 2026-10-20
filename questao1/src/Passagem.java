public abstract class Passagem {
    protected String nome;
    protected String[] documentos;
    protected double taxaEmbarque;
    
    public Passagem(String nome, String[] documentos, double vlrEmbarque) {
        this.nome = nome;
        this.documentos = documentos;
        this.taxaEmbarque = vlrEmbarque;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir() {
        System.out.println("Nome do passageiro: " + this.getNome());
        System.out.println("Taxa de embarque: " + this.getTaxaEmbarque());
        System.out.println("Documentos necessários: " + String.join(", ", this.getDocumentos()));
    }

    public String[] getDocumentos() {
        return documentos;
    }
    
    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    
}
