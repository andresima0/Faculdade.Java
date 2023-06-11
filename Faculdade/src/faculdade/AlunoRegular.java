/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author andreSimao
 */
public class AlunoRegular extends Aluno
{
    private final String ra;
    private double nota1,nota2,media;

    //construtor
    public AlunoRegular(String ra, String nome) {
        super(nome);
        this.ra = ra;
        nota1 = 0;
        nota2 = 0;
        media = 0;
    }    
       
    //outros métodos
    public void registrarNotas(double nota1, double nota2)
    {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double media()
    {
        return media = (nota1 + nota2)/2;
    }
    
    @Override
    public boolean aprovado() 
    {
        if(freq >=75 && media >=6){
            return aprovado = true;
        }
        return aprovado = false;
    }
   
    @Override
     public void historico()
    {
        super.historico();
        System.out.println("RA: " + ra + 
                "\nMedia: " + media +
                "\naprovado: " + (aprovado?"Sim":"Nao") +
                "\n");
    }
  
}//fim da classe
