/*
 * 11/05/2023
 *   Cria um objeto GradeBook utilizando um array  de notas
 * 
 * 
 */

/**
 *
 * @author eber
 */
public class GradeBookTest {
    
    public static void main(String[] args) {
        
        // array de notas de estudante
        int gradesArray[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
    
}
