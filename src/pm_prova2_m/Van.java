/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1667158
 */
public class Van extends Veiculo implements Inspecionavel {

    private int quantidadeMaximaPassageiros;

    public Van(int quantidadeMaximaPassageiros, String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

    @Override
    public void realizarInspecao() {
    }

    @Override
    public void exibirDetalhes() {
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }

}
