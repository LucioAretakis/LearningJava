package entities;

public class dadosAluno{

    public String matricula;
    public String nome;
    public double nota1;
    public double nota2;
    public double notaTrabalho;

    public double Media(){
        return ((nota1 * 2.5) + (nota2 * 2.5) + (notaTrabalho * 2)) / 7;
    }
    public double Final(){
        if(Media() > 7){
            return 0;
        }
        else{
            return 7 - Media();
        }
    }

    public String toString(){
        return "NOME DO ALUNO: " + nome + ", MÉDIA FINAL: " + Media() + ", PONTOS NECESSÁRIOS PARA RECUPERAÇÃO: " + Final();
    }
}