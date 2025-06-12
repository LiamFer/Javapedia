package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    void pedirPizza(){
        Scanner sc = new Scanner(System.in);
        boolean pedindo = true;
        while(pedindo) {
            System.out.print("Qual o sabor da pizza (CALABRESA, MISTA, FRANGO, LOMBO): ");
            Sabor sabor = Sabor.valueOf(sc.nextLine().toUpperCase());
            System.out.print("E a quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            pizzas.add(new Pizza(sabor, quantidade));
            System.out.print("Deseja pedir outra pizza (y/n): ");
            pedindo = sc.nextLine().equalsIgnoreCase("y");
        }
        System.out.println("Pedido finalizado!");
    }

    void listarPedido(){
        pizzas.forEach(pizza -> System.out.println(pizza));
    }

    double calcularTotalPedido(){
        double total = 0;
        for(Pizza pizza : pizzas){
            total+= pizza.getPreco();
        }
        return total;
    }

    int getTotalPizzas(){
        return pizzas.size();
    }
}
