import java.util.Scanner;
public class Cliente{
    private Integer Numero;
    private String Agencia;
    private String Nome_Cliente;
    private float Saldo;

    public Cliente()
    {
        novoCliente();
    }

    public String toString()
    {
        return "Olá " + this.Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.Agencia+ ", conta "+this.Numero+ " e seu saldo R$" +this.Saldo+ " já está disponível para saque.";
    }

    public void novoCliente()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Número da conta:");
        this.Numero = sc.nextInt();
        sc.nextLine();//limpar buffer
        System.out.println("Digite a agência:");
        this.Agencia = sc.nextLine();
        System.out.println("Digite seu nome:");
        this.Nome_Cliente = sc.nextLine();
        System.out.println("Digite o saldo que deseja depositar:");
        this.Saldo = sc.nextFloat();
        sc.close();
    }

    public void adicionarFundos(float valor)
    {
            this.Saldo += valor;
    }

    public void sacarFundos(float valor)
    {
        this.Saldo -= valor;
    }
}
