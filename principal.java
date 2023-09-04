package faeterj;

import java.util.Scanner;

public class principal 
{

	public static void main(String[] args) {
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		while(menu<4) 
		{
			System.out.println("Digite o número correspondente a opção desejada:\n\n1 - Criar uma nova disciplina\n2 - Cadastrar Aluno\n3 - Criar turma\nQualquer outro número para encerrar a sessão\n\n>>");
			menu = sc.nextInt();
			switch (menu){
				case 1: 
					CriarDisciplina();
				case 2:
					CriarAluno();
				case 3:
					CriarTurma();
				default:
					System.out.println("Sessão encerrada.");
			}	
		}
		sc.close();
	}

	private static Disciplina CriarDisciplina() 
	{
		String nome;
		String sigla;
		int periodo;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o nome da disciplina");
		nome = sc.next();
		System.out.println("digite a sigla da disciplina");
		sigla = sc.next();
		System.out.println("digite o periodo da disciplina");
		periodo = sc.nextInt();;
		Disciplina disciplina = new Disciplina(nome, sigla, periodo);
		return disciplina;
	}
	
	private static Aluno CriarAluno() 
	{
		String nome;
		String email;
		int idade;
		String matricula;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome: ");
		nome = sc.next();
		System.out.println("o nome digitado é: " + nome);
		System.out.println("Digite sua idade ");
		idade = sc.nextInt();
		System.out.println("Sua idade é: " + idade);
		System.out.println("Digite seu email ");
		email = sc.next();
		System.out.println("o email digitado é: " + email);
		System.out.println("Digite a salario matrícula: ");
		matricula = sc.next();
		System.out.printf("A matrícula digitada é: " + matricula);
		sc.nextLine();
		Aluno aluno = new Aluno(nome, email, matricula, idade);		
		return aluno;
	}
	
	private static Turma CriarTurma() 
	{
		String turno;
		String semestre;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o turno: ");
		turno = sc.next();
		System.out.println("Digite o semestre por extenso: ");
		semestre = sc.next();
		System.out.println("O turno digitado é: " + turno);
		System.out.println("O semestre digitado é: " + semestre);
		Turma turma = new Turma(turno, semestre);
		return turma;
	}
}