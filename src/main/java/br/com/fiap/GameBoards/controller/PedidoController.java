/*
RM 95246 Beatriz Fernandes
 */

package br.com.fiap.GameBoards.controller;

import br.com.fiap.GameBoards.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class PedidoController {

    @GetMapping
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Deusastrados");
        pedido.setUrlImagem("https://cdn.vnda.com.br/780x/tocadotabuleiro/2023/07/16/10_40_16_169_10_7_6_609_deusastrados_01.jpg?v=1689514821");
        pedido.setUrlProduto("https://www.tocadotabuleiro.com/produto/deusastrados-1444");
        pedido.setDescricaoProduto("O Caos iniciou a formação de um novo planeta e isso atraiu a atenção do cosmo. De toda a parte, os deuses da criação se reunem para uma grande competição! Em Deusastrados, os jogadores assumem o papel desses deuses , se esforçando para cumprir as ordens do caos e gerar as melhores e mais adaptadas criaturas para povoar o novo planeta. As rodadas em Deusastrados são divididas em quatro fases: CRIAÇÃO Os jogadores, em tempo real e simultaneamente, pegam cartas de partes de criatura no centro da mesa e usam para criar suas criaturas, ou sabotar as criaturas de seus oponentes. PODERES Os jogadores conferem as cartas de poderes disponíveis do seu deus e escolhem uma para colocar sobre a mesa, com a face para baixo. Simultaneamente todos revelam os poderes escolhidos e eles são ativados em ordem de prioridade. CAOS Todas as criaturas que possuírem partes não desejadas pelo Caos, descartam estas partes. PONTUAÇÃO As criaturas e partes restantes pontuam. Deusastrados possui um modo básico e um modo assimétrico, no qual cada deus possui uma habilidade própria e poderes distintos.");
        pedido.setComponentesProduto("5 Cartas de Deuses (Copper | 65x10mm)35 Cartas de Poderes (Copper | 65x10mm)72 Cartas de Criaturas (USA | 56x87mm)3 Cartas Camaleônicas (USA | 56x87mm) 9 Tokens de Ordens do Caos 5 Tokens de Deuses 6 Tokens de Tipos 4 Réguas de Jogador 1 Tabuleiro 1 Marcador de Primeiro Jogador");
        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
