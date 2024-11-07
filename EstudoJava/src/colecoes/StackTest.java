/*
 *  Data: 10/10/2024
 * - pagina 698 livro: Java como Programar - Deitel
 *  Descrição: Programa para testar java.util.Stack
 */

package colecoes;

import java.util.EmptyStackException;
import java.util.Stack;


public class StackTest {

   public StackTest() {

       Stack<Number> stack = new Stack<Number>();

       // cria numeros para armazenar na pilha
       Long    longNumber   = 12L;
       Integer intNumber    = 34567;
       Float   floatNumber  = 1.0F;
       Double  doubleNumber = 1234.5678;

       // utiliza o método push
       stack.push(longNumber);      // adiciona um long
       printStack(stack);
       stack.push(intNumber);       // adiciona um int
       printStack(stack);
       stack.push(floatNumber);     // adiciona um float
       printStack(stack);
       stack.push(doubleNumber);    // adiciona um double
       printStack(stack);

       // remove itens da pilha
       try {
           Number removeObject = null;

           // remove elementos da pilha
           while (true) {
               removeObject = stack.pop();      // utiliza o método pop
               System.out.printf("%s Estourou\n", removeObject);
               printStack(stack);
           }

       } catch (EmptyStackException emptyStackException) {

           emptyStackException.printStackTrace();
       }
   }

   private void printStack(Stack<Number> stack) {

       if (stack.isEmpty()) {
           System.out.printf("A pilha esta vazia\n\n");        // A pilha esta vazia
       }
       else {       // a pilha não esta vazia
           System.out.printf("A pilha contém: ");

           // itera pelos elementos
           for (Number number : stack) {
               System.out.printf("%s ", number);

               System.out.println("(topo) \n\n");    // indica o topo da pilha
           }
       }
   }

    public static void main(String[] args) {

       new StackTest();
    }
}
