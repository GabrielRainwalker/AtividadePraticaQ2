package AvaliacaoPratica.Q2;

public class EmpregoTeste {
    public static void main(String[] args) {
        Emprego Emp1 = new Emprego("Ribamar", "Santos", 1000.0);
        Emprego Emp2 = new Emprego("Cinthia", "Miabara", 1200.0);
        System.out.println("Nome do empregado 1: " +Emp1.getNome() + "Sobrenome: " + Emp1.getSobrenome() + "Salário" + Emp1.getSalario());
        System.out.println("Nome do empregado 2: " +Emp2.getNome() + "Sobrenome " + Emp2.getSobrenome()+ "Salário" + Emp2.getSalario());
        
        double NovoSalarioEmp1 = Emp1.getSalario() * 0.10;
        double NovoSalarioEmp2 = Emp2.getSalario() * 0.10;

        Emp1.setSalario(NovoSalarioEmp1);
        Emp2.setSalario(NovoSalarioEmp2);

        System.out.println("Nome do empregado 1: " +Emp1.getNome() + "Sobrenome: " + Emp1.getSobrenome() + "Salário" + Emp1.getSalario());
        System.out.println("Nome do empregado 2: " +Emp2.getNome() + "Sobrenome " + Emp2.getSobrenome()+ "Salário" + Emp2.getSalario());
    }
 
}