/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade;

/**
 *
 * @author andreSimao
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoRegular r1 = new AlunoRegular("001", "Andre");
        r1.registrarNotas(10, 6);
        r1.frequencia(15);
        r1.media();
        r1.aprovado();
        
        
        AlunoRegular r2 = new AlunoRegular("002", "Jose");
        r2.registrarNotas(10, 6);
        r2.frequencia(25);
        r2.media();
        r2.aprovado();
        
        
        AlunoAssistente s1 = new AlunoAssistente("55.509.332-2", "Maria");
        s1.frequencia(15);
        s1.receberResumo();
        s1.aprovado();
                
        AlunoAssistente s2 = new AlunoAssistente("54.588.22-1", "Joao");
        s2.frequencia(6);
        s2.aprovado();
        
        //listagem de aluno substitui o método histórico, nesse caso 
        ListaAlunos lp = new ListaAlunos(10);
        lp.addAluno(r1);
        lp.addAluno(r2);
        lp.addAluno(s1);
        lp.addAluno(s2);
        lp.listagem();
        
        
        
    }
    
}//fim da classe
