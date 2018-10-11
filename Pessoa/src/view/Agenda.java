package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Aluno;
import model.Pessoa;

public class Agenda{
    public static void main(String[] args){
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("João", "Rua 2", 25);
        
        pessoa1.setNome("Maria");
        pessoa1.setEndereco("Rua 3");
        pessoa1.setIdade(31);
        pessoa1.setSexo("F");
        
        pessoa2.setTelefone("1233-123");
        pessoa2.setSexo("M");
        
        System.out.println("Dados da pessoa:");
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Endereco: "+pessoa1.getEndereco());
        System.out.println("Idade: "+pessoa1.getIdade());
        System.out.println("Sexo: "+pessoa1.getSexo());
        
        Scanner leitor = new Scanner(System.in);
        
        //Criação do objeto aluno
        System.out.println("Digite os dados do Aluno");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Endereço: ");
        String endereco = leitor.nextLine();
        System.out.print("Idade: ");
        Integer idade = Integer.parseInt(leitor.nextLine());
        System.out.print("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.print("Sexo: ");
        String sexo = leitor.nextLine(); 
        System.out.print("Matrícula: ");
        String matricula = leitor.nextLine();  
        System.out.print("Curso: ");
        String curso = leitor.nextLine();
        System.out.print("Ira: ");
        float ira = Float.parseFloat(leitor.nextLine());  
        
        Aluno aluno1 = new Aluno(nome, endereco, idade, sexo, ira, telefone, matricula, curso);
        
        System.out.println("Dados do aluno:");
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Endereco: "+aluno1.getEndereco());
        System.out.println("Idade: "+aluno1.getIdade());
        System.out.println("Sexo: "+aluno1.getSexo());
        System.out.println("Matrícula: "+aluno1.getMatricula());
        System.out.println("Curso: "+aluno1.getCurso());
        System.out.println("Ira: "+aluno1.getIra());
        
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(aluno1);
        
    }
}
