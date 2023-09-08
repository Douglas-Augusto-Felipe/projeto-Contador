package ProjetoContador.ImpressaoCandidatos;

public class impressaoSelecionados {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", };
        System.out.println("imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println(" o candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
        for (String candidato : candidatos) {
            System.out.println("o candidato selecionado foi " + candidato);
        }
    }
}
