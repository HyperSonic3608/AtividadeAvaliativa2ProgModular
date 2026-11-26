/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author glbra
 */
public class PM_Prova2_M {

    /**
     * @param args the command line arguments
     */
    private static void criarDados(ArrayList<Veiculo> veiculos, ArrayList<Aluguel> alugueis) {

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();
        int opcaoMenu;

        criarDados(veiculos, alugueis);

        System.out.println("AlloCar - Sistema de Aluguel de Veículos\n");

        do {
            System.out.println("1. Associar veículos a um aluguel");
            System.out.println("2. Exibir todos os veículos cadastrados");
            System.out.println("3. Exibir todos os alugueis cadastrados");
            System.out.println("4. Exibir apenas veículos disponíveis");
            System.out.println("5. Avaliar objetos");
            System.out.println("6. Realizar inspeção em veículos");
            System.out.println("7. Remover veículos em manutenção do sistema");

            System.out.print("\nEscolha uma opção: ");
            opcaoMenu = entrada.nextInt();
            entrada.nextLine();

        } while (opcaoMenu >= 1 || opcaoMenu <= 7);

    }

}
