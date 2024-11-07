/*
 *  Data: 16/09/2024
 * - pagina 691 livro: Java como Programar - Deitel
 *  Descrição: Utilizando o algoritmo shuflle
 */

package colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// classe para representar uma carta de um baralho
class Carta {

    public static enum Face { As, Dois, Tres, Quatro, Cinco, Seis, Sete, Oito , Nove, Dez,
                            Valete, Dama, Rei};
    public static enum Naipe { Paus, Ouros, Copas, Espadas };

    private final Face  face;        // face da carta
    private final Naipe naipe;       // naipe da carta


    // construtor de dois argumentos
    public Carta(Face cartaFace, Naipe naipeCarta) {
        this.face = cartaFace;
        this.naipe = naipeCarta;
    }

    // retorna a face da carta
    public Face getFace() {
        return face;
    }

    // retorna o naipe da carta
    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", face, naipe);
    }
}

        // Declaração da classe Baralho
        class Baralho {

            private List<Carta> list;       // decalra List que armazena Cartas

            // configura o baralho de cartas e embaralha
            public Baralho() {

                Carta[] baralho = new Carta[52];
                int count = 0;      // número de cartas

                // preenche baralho com objetos cartas
                for (Carta.Naipe naipe : Carta.Naipe.values()) {
                    for (Carta.Face face : Carta.Face.values()) {

                        baralho[count] = new Carta(face, naipe);
                        count++;
                    }

                }

                list = Arrays.asList(baralho);      // obtém List
                Collections.shuffle(list);        // embaralha as cartas

            }

            // gera a saída de baralho
            public void printCartas() {

                // exibe 52 cartas em duas colunas
                for (int i = 0; i < list.size(); i++) {
                    System.out.printf("%-20s%s", list.get(i), ((i + 1) % 2 == 0) ? "\n" : "\t");
                }
            }


            public static void main(String[] args) {

                Baralho cartas = new Baralho();
                cartas.printCartas();
            }
        }


