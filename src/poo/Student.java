/*esta classe pertence a Exercicio3POO*/

package poo;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPoints() {

		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0; /* Aqui retorna 0 pq nao retornará nenhum numero, apenas 'PASS" */
		}

	}

}
