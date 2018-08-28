package bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setSalario(5000.0);

        EditorVideo edVideo = new EditorVideo();
        edVideo.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(edVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma());
	}
}