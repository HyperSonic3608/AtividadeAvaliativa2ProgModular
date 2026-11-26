/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1667158
 */
public class AluguelExecutivo extends Aluguel implements Avaliavel {

    private Motorista motoristaParticular;

    public AluguelExecutivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, Motorista motoristaParticular) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.motoristaParticular = motoristaParticular;
    }

    @Override
    public void exibirDetalhes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return true;
    }

    @Override
    public void avaliar(int nota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
