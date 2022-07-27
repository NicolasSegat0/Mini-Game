package jogo.teste;
import java.util.Scanner;
public class JogoTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int primeiraEscolha, segundaEscolha, terceiraEscolha, quartaEscolha, quintaEscolha, sextaEscolha;
        String nome;
        
        System.out.println("Bem-vindo ao jogo, digite o seu nome: ");
        nome = ler.next();
        
        System.out.println("Após a batalha dos Campos Solares, o rei " + nome + "se vê devastado.");
        System.out.println();
        System.out.println("Com a perda da Guerra das Três Flores, o reino está endividado, moral baixa da população,");
        System.out.println("E a conspiração para usupar seu trono, vinda da família Jwala.");
        System.out.println();
        System.out.println("Dessa maneira, você deve tomar algumas decisões:");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Governador: Meu Lorde, está faltando comida. Devemos tomar algumas das providencias: ");
        System.out.println("1- Estocar alimentos secos e fazer sopas.");
        System.out.println("2- Confiscar os alimentos dos feudos vassalos.");
        System.out.println("3- Matar animais domésticos.");
        System.out.println();
        System.out.print("Qual é a sua decisão, meu rei?");
        primeiraEscolha = ler.nextInt();
        
        switch(primeiraEscolha){
            case 1: System.out.println("Muito bem meu senhor. Ilá te guie!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("Se paasou um tempo, a política foi aprovada pela população.");
                System.out.println("A satisfação das pessoas aumentaram. A população está do seu lado!");
                System.out.println();
                System.out.println("Com o povo bem alimentado, os conspiradores, aliados aos Jwala, resgataram forças para luta.");
                System.out.println("Os conspiradores a favor da família Jwala começaram a fazer comícios e manifestações.");
                System.out.println("O Lorde Oliver (general do seu exército) quer ter uma palavra com você: ");
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("Lorde Oliver: Senhor, devemos conter essa rebelião!");
                System.out.println("Lorde Oliver: Porém, o Senhor deve ter cuidado com o Govenador, pois ele é um Jwala.");
                System.out.println("1 - Devemos conter a rebelião e matar o Govenador");
                System.out.println("2 - somente ignorar os manifestantes?");
                segundaEscolha = ler.nextInt();
                
                if (segundaEscolha == 1 ) {
                    System.out.println("Ok meu Senhor, vou tomar as medidas cabíveis!");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("O seus soldados matam todos os manifestantes e seus conspiradores.");
                    System.out.println("Parlamentares Jwalas acusam a ,vossa majestade, de promover um massacre.");
                    System.out.println("Assim, deixando o Governador enfurecido e outros parlamentares também.");
                    System.out.println();
                    System.out.println("A Triade Conselheira quer falar com o senhor: ");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Triade^: Senhor, temos só duas medidas para tomar: ");
                    System.out.println("1- Renuciar o trono.");
                    System.out.println("2- Tirar os títulos do Lorde Oliver e nomear Darius Jwala como o novo General.");
                    System.out.println("Senhor, qual será a sua escolha?");
                    quintaEscolha = ler.nextInt();
                    
                    if (quintaEscolha == 1) {
                        System.out.println("Triade: Bom, meu senhor, assine o documento e já vamos nos disolver.");
                        System.out.println("Triade: Ilá nos proteja!");
                        System.out.println("--------------------------------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println(nome + ", o frágil renuncia ao trono. Ele e sua mulher são exilados na Iha da Coruja.");
                        System.out.println("Os Jwala sobem ao trono, declarando o Governador como o novo rei.");
                        System.out.println();
                        System.out.println("Fim.");
                        
                    } else if (quintaEscolha == 2) {
                        System.out.println("Triade: Nos conforme, meu senhor!");
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("Depois da nomeação, o Lorde Oliver quer ter uma palavra com vossa majestade:");
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("Lorde Oliver: SENHOR ME TRAIU, ISSO É UM ABSURDO.");
                        System.out.println("Lorde Oliver: O SENHOR ENTREGOU O REINO PARA OS JWALA. MEU IRMÃO, VOCÊ TRAIU NOSSA FAMÍLIA...");
                        System.out.println("Lorde Oliver: EU MORRO, PORÉM EU TE LEVO COMIGO!");
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                        System.out.println(nome + ", o trágico morre assanado pelo próprio irmão, ex-general de seu exército.");
                        System.out.println("Os Jwalas sobem ao poder e fazem da muler de Eduard, Catarina, como vassala da família.");
                        System.out.println("Fim.");
                        
                    }
                    
                } else if(segundaEscolha == 2)
                    System.out.println("Senhor, tenho que discordar... Porém, vou conceder essa instrução");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("As manifestações ganharam mais forças e menbros.");
                    System.out.println("Nessas manifestações, dois conselheiros da Câmara dos Nobres foram mortos misteriosamente.");
                    System.out.println("Vinte soldados foram mortos");
                    System.out.println();
                    System.out.println("O Govenador quer falar em particular com você:");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Govenador: Senhor, sua governancia está fraca, devemos abrir mão de 13 cargos na Câmara dos Nobres, ");
                    System.out.println("2% das terras ao leste de Portogali.");
                    System.out.println("Governador: Sei que esses acordos podem ser absurdos, mas só assim minha família pode parar com essa desordem.");
                    System.out.println("Governador: Então meu senhor, qual vai ser sua escolha: 1- Aceitar a proposta ou 2- Negar e buscar outra proposta?");
                    terceiraEscolha = ler.nextInt();
                    
                    if (terceiraEscolha == 1) { 
                        System.out.println("Boa escolha, meu senhor. Assine o documento.");
                        System.out.println("----------------------------------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println("As manifestações pararam, porém os Jwala controlam uma boa parte do reino. ");
                        System.out.println("O Lorde Oliver morreu mesteriosamnete e sua mulher grávida teme que ela seja o próximo alvo.");
                        System.out.println("----------------------------------------------------------------------------------------------------------------");
                        System.out.println("Catarina: Senhor; 1- O senhor renuncia o trono ou 2- Vamos fugir para o reino de seu pai e usar o exército do próprio!");
                        quartaEscolha = ler.nextInt();
                        
                        if (quartaEscolha == 1) {
                            System.out.println("Catarina: Bom meu senhro, não temos muitas escolhas...");
                            System.out.println("------------------------------------------------------------------------------------------------------------");
                            System.out.println("Vossa majestade " + nome + ", o fraco renuncia o trono de Margelis");
                            System.out.println("Logo após, os Jwala assumen o trono e exelam Eduard e Catarina para a Ilha das Corujas.");
                            System.out.println();
                            System.out.println("Fim.");
                            
                        } else if (quartaEscolha == 2) {
                            System.out.println("Catarina: Bom... Não seria uma decisão muita sábia...");
                            System.out.println("Catarina: Guardas!");
                            System.out.println("------------------------------------------------------------------------------------------------------------");
                            System.out.println("O nosso senhor" + nome + ", o fraco foi assasinado pelo seus guardas, à mando de sua esposa.");
                            System.out.println("Catarina, se alia aos Jwala e começa a governar para eles.");
                            System.out.println("Margelis se torna um reino vassalo aos Jwala.");
                            System.out.println();
                            System.out.println("Fim.");
                        }
                    
                } else if (terceiraEscolha == 2) {
                        System.out.println("Péssima escolha, meu senhor... Esperava mais da sua pessoa...");
                        System.out.println("Guardas! Código Corvo!");
                        System.out.println("-----------------------------------------------------------------------------------------------------------------");
                        System.out.println("Infelismente, o reinado de " + nome + ", o Fraco acaba.");
                        System.out.println("O Reino fica nas mãos dos Jwala, iniciando uma nova disnatia.");
                        System.out.println("Descanse em paz," + nome + "!");
                        System.out.println();
                        System.out.println("Fim.");
                }
                
            break;
            case 2: System.out.println("Entendido... Que Ilá te guie!");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("Após o confizco dos alimentso, os feudos dos Jwala e dos Batha ficaram enfurecidos.");
                System.out.println("A população dos feudos se organizaram para invadir Margelis.");
                System.out.println("Os Senhores Jwala e Batha fizeram uma aliança para invadir seu reino.");
                System.out.println("Seu General, Lorde Oliver quer falar com o senhor: ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("Lorde Oliver: Senhor, só temos duas alternativas: ");
                System.out.println("Lorde Oliver: 1- Resistir aos ataques vindos por terra e mar");
                System.out.println("Lorde Oliver: ou 2- Se render e fugir para as terras de nosso pai. ");
                System.out.println("Lorde Oliver: Senhor, qual vai ser a vossa escolhas? ");
                sextaEscolha = ler.nextInt();
                
                if (sextaEscolha == 1) {
                    System.out.println("Lorde Oliver: CERTO, IRMÃO. VIVA OS SAVAN!");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Infelizmente, os ataques combinados dos Jwala e Batha foram bem sucedidos.");
                    System.out.println("Dois terços de sua população é morta, seu exército é aniquilado, sua cidade foi capturada.");
                    System.out.println();
                    System.out.println(nome + ", o bravo foi capturado e levado para Estatpólis, capital dos Jwala.");
                    System.out.println("Infelizmente, vossa majestada foi executada em praça pública.");
                    System.out.println("Sua cabeça ficou exposta na Ponte Çocafer.");
                    System.out.println();
                    System.out.println("Fim.");
                    
                } else if (sextaEscolha == 2) {
                    System.out.println("Lorde Oliver: Ok, meu senhor... Irei arrumar nossa caravana.");
                    System.out.println("Lorde Olivier: Que a Lua Branca proteja os Savan!");
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Vocês chegam ao reino de vosso pai, o patriarca Krilly Savan.");
                    System.out.println("Krilly Savan é soberano das Terras Áureas do Norte, onde mel congelado jorra das Montanhas Brancas.");
                    System.out.println();
                    System.out.println("Krilly: Muito bom, voltaran aos meus cuidados. Fracos.");
                    System.out.println("Lorde Olivier: Infelizmente, não tivemos escolhas... E o senhor parou de ser um traidor?");
                    System.out.println("Krilly: Traidor? Sou um homem justo.");
                    System.out.println("Krilly: Guardas...!");
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Você e seu irmão são assasinados logo no Salão Grena.");
                    System.out.println("Krilly havia negociado com a Catariana a propria mão para Nicolau Jwala.");
                    System.out.println("Assim, Eduard, o Covarde tem seu reino entregue aos Jwala.");
                    System.out.println();
                    System.out.println("Fim.");
                    
                }
                
            
            break;
            case 3: System.out.println("Escolha do senhor. Ilá te proteja.");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("A população de Margelis ficou enfurecida, gerando um grande levante popular.");
                System.out.println("A viol~encia aumentou, doze soldados morreram e dois guardas Alados morerram em uma tentativa de conter essa rebelião.");
                System.out.println("Esse ódio foi alimentado pelos Jwala, formando um levante popular. ");
                System.out.println("A Guarda Alada foi morta e devorada pela população.");
                System.out.println("A população entra no castelo mata a Vossa Majestade e o sua mulher grávida.");
                System.out.println("Fim.");
            break;
        }
        
       
    }
    
}
