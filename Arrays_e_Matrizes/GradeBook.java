/*
 * 11/05/2023
 *   A classe GradeBook utilizando um array para armazenar notas de teste
 * 
 * 
 */

/**
 *
 * @author eber
 */
public class GradeBook {
    
    private String courseName;      // Nome do curso que essa GradeBook representa
    private int    grades[];        // array de notas de estudantes
    
    // construtor de dois argumentos inicializa courseName e array de notas

    public GradeBook(String name, int gradeArray[]) {
        
        courseName = name;          // inicializa courseName
        grades     = gradeArray;    // níveis de armazenamento
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        
        courseName = name;
    }
    
    public void displayMessage() {
        
        // getCourse obtém o nome do curso
        System.out.printf("Bem-vindo ao livro de notas para\n%s!\n\n", getCourseName());
    }
    
    public void processGrades() {
        
        // gera saída de array de notas
        outputGrades();
        
        // Chama método getAverage para calcular a média
        System.out.printf("\nA média da turma é %.2f\n ", getAverage());
        
        // chama o método getMininum e getMaximum
        System.out.printf("A nota mais baixa é %d\n\n", getMinimum(), getMaximum());
        
        // chama outputBarChart para imprimir gráfico de distribuição de nota
        outputBarChart();
    }
    
    // Localiza a nota mínima
    public int getMinimum() {
        
        int lowGrade = grades[0];       // assume que grade[0] é a menor nota
        
        // faz o loop pelo array de notas
        for(int grade : grades) {
            if(grade < lowGrade)
                lowGrade = grade;      // nova nota mais baixa
        }
        
        return lowGrade;       // retorna nota mais baixa
    }
    
    
    public int getMaximum() {
        
        int highGrade = grades[0];       // assume que grade[0] é a maior nota
        
        // faz o loop pelo array de notas
        for(int grade : grades) {
            if(grade < highGrade)
                highGrade = grade;      // nova nota mais alta
        }
        
        return highGrade;       // retorna nota mais alta       
                
        
    }
    
    // Determina média para o teste
    public double getAverage() {
        
        int total = 0;
        
        // soma de notas de um estudante
        for(int grade : grades)
            total += grade;
        
        // retorna média de notas
        return (double) total / grades.length;
    }
    
    // gera saída do gráfico de barras exibindo distribuição de notas
    public void outputBarChart() {
        
        System.out.println("Grade distribution: ");
        
        // armazena frequência de notas em cada intervalo de 10 notas
        int frequency[] = new int[11];
        
        // para cada nota, incrementa a frequência apropriada
        for(int grade : grades)
            ++frequency[grade / 10];
        
        // para cada frequência de nota, imprime barra no gráfico
        for(int count = 0; count < frequency.length; count++) {
            
            // gera saída do rótulo de barra("00-09: ", ..., "90-99: ", "100: ")
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count + 10, count * 10 + 9);
            
            // imprimi a barra de asteriscos
            for(int stars = 0; stars < frequency[count]; stars++)
                System.out.printf("*");
            
            System.out.println();       // inicia uma nova linha de sáida            
                
        }
    }
    
    // Gera saída do conteúdo do array de notas
    public void outputGrades() {
        
        System.out.println("As notas são:\n");
        
        // gera a saída da nota de cada estudante
        for(int student = 0; student < grades.length; student++)
            System.out.printf("Estudante %2d: %3d\n", student + 1, grades[student]);  }
      
       
    
}
