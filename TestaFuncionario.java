public class TestaFuncionario{
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Arquiteto de Dados", 7500);

        System.out.println("Cargo..... " + f.getCargo());
        System.out.println("Salário.... " + f.getSalario());
    }
}