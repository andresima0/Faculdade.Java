/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author andreSimao
 */
public class AlunoAssistente extends Aluno
{
    private String rg;
    private boolean resumo;    

    public AlunoAssistente(String rg, String nome) {
        super(nome);
        this.rg = rg;
        resumo = false;
    }             
    
    public void receberResumo(){
        resumo = true;
    }
        
    @Override
    public boolean aprovado() 
    {
        if(freq >=75 && resumo == true){
            return aprovado = true;
        }
        return aprovado = false;
    }
    
    @Override
    public void historico()
    {
        super.historico();
        System.out.println("Rg: " + rg + 
                "\nStatus resumo: " + (resumo?"Sim":"Nao") + 
                "\naprovado: " + (aprovado?"Sim":"Nao") +
                "\n");
    }
    
}//fim da classe

    
    
    
