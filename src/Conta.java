import java.util.Scanner;
public class Conta {
    private String nome;
    private String conta;
    private double saldo;

    Scanner scanner = new Scanner(System.in);

    public Conta() {
        System.out.println("Digite seu nome:");
        this.nome = scanner.next();
        System.out.println("Digite sua conta:");
        this.conta = scanner.next();
        System.out.println("Digite seu saldo:");;
        this.saldo = scanner.nextDouble();
        System.out.println("Conta bancária cadastrada com sucesso");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor > getSaldo()){
            System.out.println("Saldo insuficiente para realizar a operação.");
        }
        else if (valor > 5000){
            System.out.println("Valor do saque acima do permitido.");
        }
        else{
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de %.3f realizado com sucesso.\n", valor);
        }
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.printf("Depósito de %.3f realizado com sucesso.\n", valor);
    }
    


}
