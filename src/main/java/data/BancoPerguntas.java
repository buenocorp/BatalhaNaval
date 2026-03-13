package data;

import java.util.*;
import model.Pergunta;

public class BancoPerguntas {

	private static List<Pergunta> perguntas = new ArrayList<>();

	static {

		// HARDWARE

		perguntas.add(new Pergunta("Qual é o cérebro do computador?", new String[] { "HD", "CPU", "RAM", "GPU" }, 1));

		perguntas.add(new Pergunta("Qual memória é volátil?", new String[] { "HD", "SSD", "RAM", "DVD" }, 2));

		perguntas.add(new Pergunta("Qual dispositivo exibe imagens?",
				new String[] { "Mouse", "Monitor", "Teclado", "Scanner" }, 1));

		perguntas.add(new Pergunta("Qual componente fornece energia ao computador?",
				new String[] { "Fonte", "RAM", "HD", "CPU" }, 0));

		perguntas.add(new Pergunta("Qual dispositivo captura vídeo?",
				new String[] { "Monitor", "Teclado", "Webcam", "Mouse" }, 2));

		perguntas.add(new Pergunta("Qual componente conecta todos os dispositivos internos?",
				new String[] { "HD", "Fonte", "Mouse", "Placa-mãe" }, 3));

		perguntas.add(new Pergunta("Qual dispositivo move o cursor na tela?",
				new String[] { "Scanner", "Mouse", "Teclado", "Monitor" }, 1));

		perguntas.add(new Pergunta("Qual dispositivo imprime documentos?",
				new String[] { "Impressora", "Scanner", "Monitor", "Mouse" }, 0));

		perguntas.add(new Pergunta("Qual memória é mais rápida?", new String[] { "HD", "RAM", "Cache", "SSD" }, 2));

		perguntas.add(new Pergunta("Qual dispositivo digitaliza documentos?",
				new String[] { "Monitor", "Mouse", "HD", "Scanner" }, 3));

		perguntas.add(new Pergunta("Qual dispositivo armazena dados permanentemente?",
				new String[] { "RAM", "HD", "Cache", "Registrador" }, 1));

		perguntas.add(new Pergunta("Qual componente melhora gráficos em jogos?",
				new String[] { "GPU", "HD", "RAM", "Fonte" }, 0));

		perguntas.add(new Pergunta("Qual dispositivo é usado para entrada de texto?",
				new String[] { "Teclado", "Monitor", "Impressora", "HD" }, 0));

		perguntas.add(new Pergunta("Qual dispositivo armazena o sistema operacional?",
				new String[] { "RAM", "HD ou SSD", "Cache", "CPU" }, 1));

		perguntas.add(new Pergunta("Qual dispositivo captura imagens para o computador?",
				new String[] { "Webcam", "Teclado", "HD", "Monitor" }, 0));

		// REDES

		perguntas.add(new Pergunta("O que significa LAN?",
				new String[] { "Rede mundial", "Rede privada", "Rede virtual", "Rede local" }, 3));

		perguntas.add(new Pergunta("Qual dispositivo conecta computadores em rede?",
				new String[] { "Switch", "Monitor", "Teclado", "Scanner" }, 0));

		perguntas.add(new Pergunta("Qual dispositivo conecta redes diferentes?",
				new String[] { "Roteador", "Mouse", "Monitor", "Scanner" }, 0));

		perguntas.add(new Pergunta("Qual protocolo é usado para acessar sites?",
				new String[] { "HTTP", "FTP", "SMTP", "DNS" }, 0));

		perguntas.add(new Pergunta("Qual protocolo envia e-mails?", new String[] { "HTTP", "FTP", "DNS", "SMTP" }, 3));

		perguntas.add(
				new Pergunta("Qual protocolo transfere arquivos?", new String[] { "HTTP", "FTP", "SMTP", "DNS" }, 1));

		perguntas.add(
				new Pergunta("Qual sistema traduz domínio para IP?", new String[] { "DNS", "FTP", "SMTP", "HTTP" }, 0));

		perguntas.add(new Pergunta("Qual endereço identifica um dispositivo na rede?",
				new String[] { "IP", "HTML", "URL", "CPU" }, 0));

		perguntas.add(new Pergunta("Qual rede cobre uma cidade?", new String[] { "LAN", "MAN", "PAN", "SAN" }, 1));

		perguntas.add(
				new Pergunta("Qual rede cobre o mundo inteiro?", new String[] { "LAN", "PAN", "Internet", "SAN" }, 2));

		perguntas.add(new Pergunta("Wi-Fi é:",
				new String[] { "Rede sem fio", "Rede cabeada", "Rede óptica", "Rede privada" }, 0));

		perguntas.add(
				new Pergunta("Qual cabo é usado em rede Ethernet?", new String[] { "USB", "HDMI", "VGA", "RJ45" }, 3));

		perguntas.add(new Pergunta("Qual dispositivo fornece internet sem fio?",
				new String[] { "Access Point", "Monitor", "Scanner", "Teclado" }, 0));

		perguntas.add(new Pergunta("Qual topologia conecta todos a um ponto central?",
				new String[] { "Estrela", "Anel", "Barramento", "Malha" }, 0));

		perguntas.add(new Pergunta("Qual equipamento distribui rede dentro da empresa?",
				new String[] { "Mouse", "Monitor", "Switch", "Teclado" }, 2));

		// SEGURANÇA

		perguntas.add(new Pergunta("O que é criptografia?",
				new String[] { "Proteger dados", "Apagar dados", "Copiar dados", "Compactar dados" }, 0));

		perguntas.add(new Pergunta("Quem criou a cifra de César?",
				new String[] { "Júlio César", "Alan Turing", "Bill Gates", "Steve Jobs" }, 0));

		perguntas.add(new Pergunta("A cifra de César faz o quê?",
				new String[] { "Apaga letras", "Inverte palavras", "Desloca letras", "Apaga números" }, 2));

		perguntas.add(
				new Pergunta("Na cifra de César com deslocamento 3, A vira:", new String[] { "B", "C", "D", "E" }, 2));

		perguntas.add(
				new Pergunta("Na cifra de César com deslocamento 1, B vira:", new String[] { "D", "E", "C", "F" }, 2));

		perguntas.add(new Pergunta("O que é firewall?",
				new String[] { "Monitor", "Processador", "Teclado", "Proteção de rede" }, 3));

		perguntas.add(new Pergunta("O que é phishing?",
				new String[] { "Ataque para roubar dados", "Backup", "Download", "Upgrade" }, 0));

		perguntas.add(new Pergunta("Senha forte deve ter:",
				new String[] { "Apenas números", "Letras números e símbolos", "Apenas letras", "Apenas nome" }, 1));

		perguntas.add(new Pergunta("HTTPS significa:",
				new String[] { "HTTP seguro", "HTTP lento", "HTTP privado", "HTTP aberto" }, 0));

		perguntas.add(new Pergunta("O cadeado no navegador significa:",
				new String[] { "Site lento", "Site falso", "Site seguro", "Site offline" }, 2));

		perguntas.add(new Pergunta("VPN serve para:",
				new String[] { "Conexão segura", "Apagar arquivos", "Atualizar sistema", "Formatar disco" }, 0));

		perguntas.add(new Pergunta("Backup serve para:",
				new String[] { "Recuperar dados", "Apagar dados", "Bloquear dados", "Excluir rede" }, 0));

		perguntas.add(new Pergunta("Qual é a função da segurança da informação?",
				new String[] { "Apagar dados", "Proteger dados", "Duplicar dados", "Compactar dados" }, 1));

		perguntas.add(new Pergunta("Hash é usado para:",
				new String[] { "Apagar arquivos", "Acelerar internet", "Limpar memória", "Proteger senhas" }, 3));

		perguntas.add(new Pergunta("Criptografia protege:",
				new String[] { "Monitor", "Mouse", "Informações", "Teclado" }, 2));

		perguntas.add(new Pergunta("Decifre a palavra 'KHOOR' usando a cifra de César com deslocamento 3:",
				new String[] { "HELLO", "WORLD", "JAVA", "TESTE" }, 0));

		// Palavra para decifrar – deslocamento 1
		perguntas.add(new Pergunta("Decifre a palavra 'IFMMP' usando a cifra de César com deslocamento 1:",
				new String[] { "JAVA", "TESTE", "MUNDO", "HELLO" }, 3));

		// Palavra para decifrar – deslocamento 2
		perguntas.add(new Pergunta("Decifre a palavra 'JGNNQ' usando a cifra de César com deslocamento 2:",
				new String[] { "WORLD", "HELLO", "JAVA", "TESTE" }, 1));

		// Palavra para decifrar – deslocamento 4
		perguntas.add(new Pergunta("Decifre a palavra 'LIPPS' usando a cifra de César com deslocamento 4:",
				new String[] { "HELLO", "MUNDO", "JAVA", "TESTE" }, 0));

		// Deslocamento 1
		perguntas.add(new Pergunta("Criptografe a palavra 'HELLO' usando a cifra de César com deslocamento 1:",
				new String[] { "JGNNQ", "GDKKN", "IFMMP", "HELLO" }, 2));

		// Deslocamento 2
		perguntas.add(new Pergunta("Criptografe a palavra 'WORLD' usando a cifra de César com deslocamento 2:",
				new String[] { "YQTNF", "XPSME", "ZRUOG", "WOSLD" }, 0));

		// Deslocamento 3
		perguntas.add(new Pergunta("Criptografe a palavra 'JAVA' usando a cifra de César com deslocamento 3:",
				new String[] { "KDYX", "MDYD", "MDBG", "MDWD" }, 1));

		// Deslocamento 4
		perguntas.add(new Pergunta("Criptografe a palavra 'TESTE' usando a cifra de César com deslocamento 4:",
				new String[] { "XGVXV", "XIWXI", "TFVTF", "YIXYI" }, 1));

		// Deslocamento 5
		perguntas.add(new Pergunta("Criptografe a palavra 'MUNDO' usando a cifra de César com deslocamento 5:",
				new String[] { "RZSIT", "RWNJS", "NZSRJ", "RXNJR" }, 0));

		// Deslocamento 2
		perguntas.add(new Pergunta("Criptografe a palavra 'CODIGO' usando a cifra de César com deslocamento 2:",
				new String[] { "EQFKIHO", "EQFJHQI", "DNCHEG", "EQFKIQ" }, 3));

		perguntas.add(new Pergunta("Na Cifra de Vigenère, qual é o papel da palavra-chave?",
				new String[] { "Determinar quantas posições cada letra será deslocada",
						"Escolher apenas a primeira letra da mensagem", "Substituir todas as vogais por X",
						"Apagar letras repetidas" },
				0));

		perguntas.add(new Pergunta("Criptografe 'HELLO' usando a Cifra de Vigenère com a palavra-chave 'KEY':",
				new String[] { "IFMMP", "KHOOR", "JGNNQ", "RIJVS", }, 3));

		perguntas.add(new Pergunta("Por que a Cifra de Vigenère é mais segura que a César?", new String[] {
				"Porque só funciona com números", "Porque usa múltiplos alfabetos com base em uma palavra-chave",
				"Porque inverte o texto antes de criptografar", "Porque substitui letras por símbolos aleatórios" },
				1));

		perguntas.add(new Pergunta("Criptografe 'WORLD' usando a Cifra de Vigenère com a palavra-chave 'ABC':",
				new String[] { "WPTLE", "YQTNF", "XPSME", "ZRUOG" }, 0));

		perguntas
				.add(new Pergunta("Decifre a frase 'RIJVS UYVJN' usando a Cifra de Vigenère com a palavra-chave 'KEY':",
						new String[] { "GOODBYE WORLD", "HELLO JAVA", "HELLO WORLD", "TESTE FASE" }, 2));

		perguntas.add(
				new Pergunta("Decifre a frase 'USJYTOQGCRGEFCV' usando a Cifra de Vigenère com a palavra-chave 'CODE':",
						new String[] { "INFORMACAO CONFIDENCIAL", "SEGURANCA DE DADOS", "PROTECAO DE ARQUIVOS",
								"SEGURANCA DE SISTEMA" },
						1));

		perguntas.add(new Pergunta(
				"Criptografe a frase 'JAVA E DIVERTIDO' usando a Cifra de Vigenère com a palavra-chave 'KEY':",
				new String[] { "KDYX F DKZFVVJEP", "MDYD G FLXFYVKHP", "MDYD E FLXFYVKHP", "TETK I BSZCBXGNS" }, 3));

		perguntas.add(new Pergunta("Qual jogo de construção permite criar mundos com blocos?",
				new String[] { "Fortnite", "Minecraft", "Roblox", "Terraria" }, 1));

		perguntas.add(new Pergunta("Qual jogo popular é um Battle Royale com construção?",
				new String[] { "Fortnite", "FIFA", "League of Legends", "Valorant" }, 0));

		perguntas.add(new Pergunta("Qual jogo é famoso pelo modo Ultimate Team?",
				new String[] { "Call of Duty", "FIFA", "Minecraft", "Rocket League" }, 1));

		perguntas.add(new Pergunta("Qual jogo é um shooter tático 5x5 da Riot Games?",
				new String[] { "Overwatch", "Valorant", "CS:GO", "Apex Legends" }, 1));

		perguntas.add(new Pergunta("Qual jogo permite criar experiências e minigames feitos pelos jogadores?",
				new String[] { "Roblox", "Fortnite", "Minecraft", "GTA" }, 0));

		perguntas.add(new Pergunta("Qual jogo é conhecido pelo mapa Verdansk?",
				new String[] { "Call of Duty Warzone", "PUBG", "Fortnite", "Apex Legends" }, 0));

		perguntas.add(new Pergunta("Qual jogo tem o personagem Mario?",
				new String[] { "Zelda", "Mario Kart", "Sonic", "Kirby" }, 1));

		perguntas.add(new Pergunta("Qual jogo é famoso pelo modo Battle Royale gratuito da EA?",
				new String[] { "Apex Legends", "Fortnite", "PUBG", "Warzone" }, 0));

		perguntas.add(new Pergunta("Qual jogo de corrida usa carros e futebol ao mesmo tempo?",
				new String[] { "Gran Turismo", "Rocket League", "Need for Speed", "Forza" }, 1));

		perguntas.add(new Pergunta("Qual jogo tem o modo criativo chamado Creative Mode?",
				new String[] { "Fortnite", "Minecraft", "Roblox", "Terraria" }, 1));

		perguntas.add(new Pergunta("Qual jogo é conhecido pelo mapa Summoner's Rift?",
				new String[] { "Dota 2", "League of Legends", "Valorant", "Overwatch" }, 1));

		perguntas.add(new Pergunta("Qual jogo popular envolve sobrevivência contra zumbis e construção?",
				new String[] { "DayZ", "Fortnite", "Minecraft", "The Forest" }, 2));

		perguntas.add(new Pergunta("Qual jogo permite explorar o mundo de Hyrule?",
				new String[] { "Zelda", "Mario", "Pokémon", "Metroid" }, 0));

		perguntas.add(new Pergunta("Qual jogo popular permite capturar criaturas chamadas Pokémon?",
				new String[] { "Digimon", "Pokémon", "Yu-Gi-Oh", "Monster Hunter" }, 1));

		perguntas.add(new Pergunta("Qual jogo popular tem o modo Battle Royale com 100 jogadores?",
				new String[] { "Fortnite", "Minecraft", "FIFA", "Rocket League" }, 0));

		Collections.shuffle(perguntas);

	}

	public static Pergunta getAleatoria() {

		Random r = new Random();

		return perguntas.get(r.nextInt(perguntas.size()));

	}

}