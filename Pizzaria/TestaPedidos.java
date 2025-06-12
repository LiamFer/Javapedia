package Pizzaria;

import java.util.Scanner;

public class TestaPedidos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cliente client = new Cliente();
        boolean pedindo = true;
        do {
            System.out.println("Escolha uma opção:\n1.Realizar Pedido\n2.Listar Pedidos\n3.Calcular Total");
            switch (sc.nextInt()){
                case 1 -> client.realizarPedido();
                case 2 -> client.listarPedidos();
                case 3 -> client.calcularPedidos();
            }
            sc.nextLine();
            System.out.print("Deseja continuar conversando com o atendente? (y/n)");
            pedindo = sc.nextLine().equalsIgnoreCase("y");
        } while(pedindo);
        sc.close();
    }
}
