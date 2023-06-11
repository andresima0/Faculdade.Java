/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author andreSimao
 */
public class ListaAlunos
{
    private Aluno list[];
    private int count;
    
    public ListaAlunos(int capMax)
    {
        list = new Aluno[capMax];
        count = 0;
    }
    
    public boolean addAluno(Aluno a)
    {
        if(count >= list.length)return false;
        list[count] = a;
        count++;
        return true;
    }
    
    public void listagem()
    { 
        for(int i=0; i<count; i++)
        {
            System.out.println("Indice:["+ i + "] ");
            list[i].historico();
        }
            
            
    }
    
}//fim da classe
