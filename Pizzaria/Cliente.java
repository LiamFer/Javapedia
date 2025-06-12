package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    void realizarPedido(){
        Pedido pedido = new Pedido();
        pedido.pedirPizza();
        pedidos.add(pedido);
    }

    void calcularPedidos(){
        double total = 0;
        int pizzas = 0;
        for(Pedido pedido : pedidos){
            total+= pedido.calcularTotalPedido();
            pizzas += pedido.getTotalPizzas();
        }
        System.out.printf("Seus %d pedidos que incluem no total %d pizzas ficaram no valor total de R$%.2f!\n",pedidos.size(),pizzas,total);
    }

    void listarPedidos(){
        for(Pedido pedido : pedidos){
            System.out.println("---------");
            pedido.listarPedido();
            System.out.println("---------");
        }
    }
}
