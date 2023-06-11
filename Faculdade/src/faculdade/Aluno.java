/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author andreSimao
 */
public abstract class Aluno 
{
    protected String nome;
    protected double freq;
    protected boolean aprovado;
    
    public Aluno(String nome){
        this.nome = nome;
        freq = 0;
        aprovado = false;
    }
             
    public void registrarFaltas(int faltas)
    {
        faltas++;
    }
    
    public double frequencia(int faltas)
    {
        //a frequencia é o total de aulas, menos as faltas, vezes 100 e dividido por 60
         return freq = ((60 - faltas) *100/60);
    }
    
    public abstract boolean aprovado();

    public void historico()
    {
        System.out.println("Nome: " + nome +
                "\nFrequencia: " + freq);
                
    }
    
      
   
}//fim da classe
