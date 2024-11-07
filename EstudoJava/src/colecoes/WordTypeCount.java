/*
 *  Data: 24/10/2024
 * - pagina 704 livro: Java como Programar - Deitel
 *  Descrição: Programa conta o número de ocorrências de cada palavra em uma string
 */

package colecoes;
import java.util.*;

public class WordTypeCount {

    private Map<String, Integer> map;
    private Scanner scanner;

    public WordTypeCount() {
        map = new HashMap<String, Integer>();       // Cria HashMap
        scanner = new Scanner(System.in);           // Cria scanner
        createMap();                                // cria mapa baseado na entrada de usuário
        displayMap();                               // exibe conteúdo do Map
    }

    // cria mapa de entrada de usuário
    private void createMap() {

        System.out.println("Digite a frase: ");     // solicita a entrado do usuário
        String input = scanner.nextLine();

        // cria StringTokenizer para a entrada
        StringTokenizer tokenizer = new StringTokenizer(input);

        // proicessamento de texto de entrada
        while (tokenizer.hasMoreTokens()) {     // enquanto houver mais entrada

            String word = tokenizer.nextToken().toLowerCase();      // obtém palavra

            // se o mapa contiver a palavra
            if (map.containsKey(word)) {        // palavra esta no mapa
                int count = map.get(word);      // obtém contagem atual
                map.put(word, count + 1);       // incrementa a contagem
            }
            else {
                map.put(word, 1);       // adiciona nova palavra com uma contagem de 1 ao mapa
            }

        }
    }

    // exibe o contéudo do mapa
    private void displayMap() {

        Set<String> keys = map.keySet();        // obtém as chaves

        // classifica as chaves
        TreeSet<String> sortedKeys = new TreeSet<String>(keys);

        System.out.println("Map contém:\nKey\t\t\t\tValue" );

        // gera saída de cada chave no mapa
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s\n", key, map.get(key));

            System.out.printf("\nsize:%d\nisEmpty:%b\n", map.size(), map.isEmpty());
        }
    }

    public static void main(String[] args) {

        new WordTypeCount();
    }
}
