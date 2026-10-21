public class AssinaContrato {
    public Matricula matriculaBrasileiro(String nomeEstudante, String documentoEstudante) {
        return new Matricula("NFS-e", "ISS", 0.05, "PIX", "CPF", nomeEstudante, documentoEstudante);
    }

    public Matricula matricularChileno(String nomeEstudante, String documentoEstudante) {
        return new Matricula("Boleto", "IVA", 0.19, "Webpay", "RUT", nomeEstudante, documentoEstudante);
    }
}
