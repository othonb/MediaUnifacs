package mediaunifacs;

public class Aluno {
    // Variáveis de instância
    private int nota1; // Nota 1
    private int nota2; // Nota 2
    private String nome; // Nome do aluno

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    public float calculaMedia () {
        return ((float) nota1 * 3 + (float) nota2 * 4) / 7;
    }
    
    public String daDiagnostico () {
        
        String retorno = "";
        
        if (calculaMedia() < 4.0) retorno = "Reprovado por média!";
        
        if (calculaMedia() >= 4.0 && calculaMedia() < 7.0) retorno = "Terceira avaliação";
        
        if (calculaMedia() >= 7.0) retorno = "Aprovado por média";
        
        return retorno;
    }
    
    public void imprime () {
        System.out.println ("Nome do aluno: " + nome);
        System.out.println ("Nota 1: " + nota1);
        System.out.println ("Nota 2: " + nota2);
        System.out.println ("Média: " + calculaMedia());
        System.out.println ("Diagnóstico: " + daDiagnostico());
    }
    
}
