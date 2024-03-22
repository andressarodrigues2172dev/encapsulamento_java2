import aula2103.Colaborador;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("João" , "Silva", 1041.0);
        Colaborador colaborador2 = new Colaborador("Mariana", "Pereira", 4000.0);

        // Exibindo o salário anual de cada colaborador
        System.out.println("Salário anual do colaborador 1: R$" + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual do colaborador 2: R$" + colaborador2.calcularSalarioAnual());

        colaborador1.aplicarAumento();
        colaborador2.aplicarAumento();

        System.out.println("Novo salário anual do colaborador 1 após o aumento: R$" + colaborador1.calcularSalarioAnual());
        System.out.println("Novo salário anual do colaborador 2 após o aumento: R$" + colaborador2.calcularSalarioAnual());
    }
}


