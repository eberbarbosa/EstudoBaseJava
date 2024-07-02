/*
 * TESTE
 */
package EstudoClasseObject;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author eber
 */
public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String sobrenome, int telefone, int rg, String curso, double[] notas) {
        super(nome, sobrenome, telefone, rg);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        //super.setCpf("345345345354");

        //this.setCpf("34534534");
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Aluno: ";
        //s += super.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {

        System.out.println(this.obterEtiquetaEndereco());

    }

    /*@Override
	public String toString() {
		return "Aluno [curso = " + curso + ", \nnotas = " + Arrays.toString(notas)
				+ "]";
	}*/

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if (curso.equalsIgnoreCase(other.getCurso())){
			return true;
		}
		
		return false;
    }


	
 /*public String toString(){
		String s = curso + "\n";
		for (double nota : notas){
			s += nota + " ";
		}
		return s;
	}*/
    
     @Override
    public String toString() {
        return super.toString() +
                ", \nAluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
   

}
