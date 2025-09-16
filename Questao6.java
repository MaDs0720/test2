import java.util.Scanner;
public class Questao6 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite uma linha de txt");
        String linha = ler.nextLine();
        int tamanho = linha.length();

        char primeirocaractere = tamanho > 0 ? linha.charAt(0) : ' ';
        char ultimocaractere = tamanho > 0 ? linha.charAt(tamanho-1) : ' ';
        String maiuscula = linha.toUpperCase();
        String minuscula = linha.toLowerCase();

        System.out.println("tamanho: " + tamanho);
        System.out.println("primeirocaractere: " + primeirocaractere);
        System.out.println("ultimocaractere: " + ultimocaractere);
        System.out.println("maiuscula: " + maiuscula);
        System.out.println("minuscula: " + minuscula);
    }
}
