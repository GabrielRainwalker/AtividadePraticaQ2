package AvaliacaoPratica.Q2;

class Emprego {
    private String nome;
    private String sobrenome;
    private double salario = 0.0;

    Emprego (String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setSobrenome (String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario (double salario) {
        this.salario = salario;
    }

    
}