/*
 *  10/08/2023 
* - pagina 276 livro: Java como Programar - Deitel
 *  Demontração do membro static
 *  
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public class EmployeeTest_2 {
    
    public static void main(String[] args) {
        
        // mostra que a contagem é 0 antes de criar Employee
        System.out.printf("Employee before instantiation: %d\n", Employee_2.getCount() );
        
        // Cria 2 Employee a contagem deve ser 2
        Employee_2 e1 = new Employee_2("João", "Silva");
        Employee_2 e2 = new Employee_2("José", "Souza");
        
        // mostra que a contagem são 2 depois de criar dois Employee
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount() );
        System.out.printf("via e2.getCount(): %d\n", e2.getCount() );
        System.out.printf("via Employee.getCount(): %d\n", Employee_2.getCount() );
        
        // Obtém nomes de Employees
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
        
        // Nesse exemplo, há somente uma referência a cada Employee, assim as duas instruções a seguir fazem com que a JVM marque
        // cada objeto Employee para coleta de lixo
        e1 = null;
        e2 = null;
        
        System.gc();        // pede que a coleta de lixo ocorre agora
        
        // mostra a contagem de Employee depois de chamar o coletor de lixo; contagem exibida pode ser 0, 1 ou 2 com base na execução
        // do coletor de lixo imediata e número de objetos Emplyees coletados
        System.out.printf("\nEmployees after System.gc(): %d\n", Employee_2.getCount() );
        
        
    }
    
}
