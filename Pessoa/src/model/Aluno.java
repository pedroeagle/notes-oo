package model;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;
    private float ira;

    public Aluno(String nome, String endereco, Integer idade, String sexo, float ira, String telefone, String matricula, String curso) {
        setNome(nome);
        setEndereco(endereco);
        setIdade(idade);
        setTelefone(telefone);
        setSexo(sexo);
        this.matricula = matricula;
        this.curso = curso;
        this.ira = ira;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getIra() {
        return ira;
    }

    public void setIra(float ira) {
        this.ira = ira;
    }
}
