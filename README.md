# faculdade.java
OOP program, using Java as the language and NetBeans as the platform

### Instructions:

In addition to regular students, the college has decided to accept assistant students as well. These students can attend classes but do not take exams or receive a diploma. However, if they attend at least 75% of the classes and submit a summary of the course material at the end of the semester, they receive a certificate of participation. For regular students to be approved, it is required that they attend at least 75% of the classes and take two exams, obtaining an average grade of 6.0 or higher. Consider that both exams carry the same weight in the average calculation. In case of illness or any other absence permitted by the school regulations, regular students can have their absences excused by providing a medical certificate or other proof. However, the number of excused absences during the semester cannot exceed 5.

Your task is to create a system that manages the grades and attendance of regular and assistant students. Students are registered in the system at the beginning of the semester, and throughout the course, their absences and grades are updated. For all students, it is necessary to keep a record of their names and the number of absences. For regular students, their student ID (RA) and grades for the two exams are also stored. Assistant students do not have a student ID, but their ID card (RG) needs to be stored. It is also necessary to keep track of whether assistant students have submitted the final course summary or not.

Create a class hierarchy that allows registering all relevant information for each student without code duplication and includes the following methods:

For all students:

`void registerAbsences(int quantity)`: Adds the specified quantity of absences to the student's record.

`double attendanceRate()`: Returns the percentage of attendance for the student, i.e., the percentage of classes attended compared to the total number of classes. Consider that the total number of classes is always 60.

`boolean passed()`: Returns true if the student passed or false if not. Regular students need to have an average grade of 6.0 or higher for both exams and at least 75% attendance rate. Consider that the course has 60 classes in the semester. Assistant students need to have at least 75% attendance rate and have submitted the final course summary.

`void transcript()`: Prints all information related to the student, including attendance rate, exam grades, average grade (for regular students), whether they submitted the summary (for assistant students), and the final result (passed or not).

For regular students:

`void registerGrades(double grade1, double grade2)`: Stores the grades for the student's exams.

`double average()`: Returns the average grade for the two exams.

`void excuseAbsences(int quantity)`: Excuses the specified quantity of absences. The total number of excused absences during the semester cannot exceed 5.

For assistant students:

`void submitSummary()`: Records that the student has submitted the required summary.

##

### Portuguese version:

### Instruções:
Além dos alunos regulares, a faculdade resolveu aceitar também alunos assistentes. Estes alunos podem assistir às aulas, mas não fazem provas e nem recebem diploma. Entretanto, se freqüentarem pelo menos 75% das aulas e ao final do semestre entregarem um resumo da matéria ministrada na disciplina, recebem um certificado de participação. Os alunos regulares, para que sejam aprovados é exigido que freqüentem pelo menos 75% das aulas e façam duas provas, obtendo média igual ou maior que 6,0. Considere que as duas provas têm o mesmo peso na média. Para os alunos regulares, em caso de doença ou algum impedimento previsto no regimento escolar, as faltas podem ser abonadas, desde que o aluno entregue um atestado comprovando o ocorrido. Entretanto, o numero de faltas abonadas durante o semestre não pode ser maior do que 5.

O seu trabalho é fazer um sistema que controle as notas e freqüência dos alunos regulares e assistentes. Os alunos são cadastrados no sistema no início de semestre e no decorrer do curso as faltas e notas são atualizadas. Para todos os alunos é preciso manter o registro do nome e quantidade de faltas. Para os alunos regulares é armazenado também o RA e as notas das duas provas. Os alunos assistentes não têm RA, mas é necessário armazenar seu RG. Para os assistentes também é preciso saber se entregaram ou não o resumo final da disciplina.

Faça uma hierarquia de classes que permita registrar todas as informações relevantes para cada aluno sem duplicação de código e que contenha os seguintes métodos:

Para todos os alunos:

`void registrarFaltas(int qtd)`: Adiciona a quantidade faltas informada para o aluno.

`double frequencia()`: Retorna a porcentagem de freqüência do aluno, ou seja, a porcentagem de aulas que ele assistiu em relação ao total de aulas. Considere que o total de aulas é sempre 60.

`boolean aprovado()`: Retorna true se o aluno foi aprovado ou false se não foi. Os alunos regulares precisam ter média maior ou igual a 6.0 nas duas provas e pelo menos 75% de freqüência nas aulas. Considere que a disciplina tem 60 aulas no semestre. Para os alunos assistentes é preciso ter pelo menos 75% de freqüência e ter entregado o resumo final.

`void historico()`: Imprime todas as informações relacionadas ao aluno, inclusive a freqüência, as notas das provas e a média (para regulares) e se entregou o resumo (para assistentes) e o resultado final (aprovado ou não).

Para os alunos regulares:

`void registrarNotas(double nota1, double nota2)`: Armazena as notas das provas do aluno.

`double media()`: Retorna a média das duas provas.

`void abonarFaltas(int qtd)`: abona a quantidade de faltas informada. O total de faltas abonadas durante o semestre não pode ser maior que 5.

Para os alunos assistentes:

`void receberResumo( )`: Registra a informação que o aluno entregou o resumo exigido.
