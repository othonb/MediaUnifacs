package mediaunifacs;

import java.util.Scanner;

public class MediaUnifacs {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner (System.in);
        
        Aluno alunoVerde = new Aluno ();
        Aluno alunoAzul = new Aluno ();
        
        System.out.print ("Nome do aluno verde: ");
        alunoVerde.setNome(leitura.next());
        
        System.out.print ("Nota1 - " + alunoVerde.getNome() + ": ");
        alunoVerde.setNota1(leitura.nextInt());
        
        System.out.print ("Nota2 - " + alunoVerde.getNome() + ": ");
        alunoVerde.setNota2(leitura.nextInt());
        
        System.out.print ("Nome do aluno azul: ");
        alunoAzul.setNome(leitura.next());
        
        System.out.print ("Nota1 - " + alunoAzul.getNome() + ": ");
        alunoAzul.setNota1(leitura.nextInt());
        
        System.out.print ("Nota2 - " + alunoAzul.getNome() + ": ");
        alunoAzul.setNota2(leitura.nextInt());

        alunoVerde.imprime();
        alunoAzul.imprime();
    }
    
}
