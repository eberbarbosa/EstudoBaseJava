/*
 *  20/01/2024
 * - pagina 41 livro: Java Efetivo - Joshua Bloch
 *  Estudo da classe Object
 *  
 */

package EstudoClasseObject;



/**
 *
 * @author eber
 */
public class TestePessoa {

    public static void main(String[] args) {

       // Pessoa pessoa = new Pessoa("Eber", "Barbosa", 32242244, 123456);
        
       Aluno aluno = new Aluno("Eber", "Barbosa", 32242244, 123456, "Ciência da Computação", new double[]{10, 9, 8, 7});
       
       Aluno aluno2 = new Aluno("Eber", "Barbosa", 32242244, 123456, "Ciência da Computação", new double[]{10, 9, 8, 7});


       /* aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas); */


       // System.out.println(pessoa);
        System.out.println(aluno); 
        
        System.out.println(aluno2.equals(aluno));
        

    }
}
