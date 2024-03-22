package aula2103;

public class Colaborador {
    private String  primeiroNome;
    private String segundoNome;
    private double salario;

    private double aplicarAumento;

    private double calcularSalario;

    public void aplicarAumento() {
        salario *= 1.1; // Aumento de 10%
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
    public Colaborador (String primeiroNome , String segundoNome , double salario){
        if (salario < 0) {
            salario = 0;
        }

        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            salario = 0;
        }
        this.salario = salario;
    }
}
