import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExemploHashMap {

	public static void main(String[] args) {
		
		Map<String, String> exemplo = new HashMap<String, String>();
		
		//Adicionando valores a lista
		
		exemplo.put("K1",  new String("V1"));
		exemplo.put("K2",  new String("V2"));
		exemplo.put("K3",  new String("V3"));
		exemplo.put("K4",  new String("V4"));
		exemplo.put("K5",  new String("V5"));
		exemplo.put("K6",  new String("V6"));
		exemplo.put("K7",  new String("V7"));
		exemplo.put("K8",  new String("V8"));
		exemplo.put("K9",  new String("V9"));
		exemplo.put("K10", new String("V10"));
		exemplo.put("K11", new String("V11"));
		exemplo.put("K12", new String("V12"));
	    System.out.println("Nesse momento o Rehash ainda é 16 !");
//		Testando o limite de inserção da lista Map<>
//		de acorodo com o load factor, ou seja qdo inserir o
//		elemento 13 ocorrerá o Rehash 
		
		exemplo.put("K13", new String("V13"));
	    System.out.println("Rehash ocorrendo agora! O HashMap aumenta para 32");
	    System.out.println("O próximo Rehash acontecerá no threshold 24 ou seja no k25 para o K26");	    
		
		int num = 14;
		for (int i = 0; i < 20; i++) {
			num += 1;
			String strK = "K"+num;
			String strV = "V"+num;	
			exemplo.put(strK, new String(strV));
			if (strK.equals("K26")) {
			    System.out.println("Rehash ocorrendo agora no K26! Momento que o HashMap aumenta para 64");
			}

		}
		
		//Buscando elementos com constanKey
		
		//Fazendo um teste para o programa tradutor
		exemplo.put("bom",  new String("good"));
		exemplo.put("mau",  new String("bad"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma chave K1 ...K33: Ex=> K15 ou K22 ou K30");
		
		//String procurandoUmaChave = "K1";
		String procurandoUmaChave = sc.nextLine();
		
		if (exemplo.containsKey(procurandoUmaChave)) {
			System.out.println("Valor da Chave a procurar é = " + procurandoUmaChave + 
					", então o valor da chave encontrada foi = " + exemplo.get(procurandoUmaChave ));
		}else{
			System.out.println("Chave não encontrada então não há valor a exibir!");
		}
		
		sc.close();
		System.out.println("----------------------------------------------");
		System.out.println("Agora queremos percorrer toda a lista com suas "
				+ "chaves e respectivos valores");
		System.out.println("----------------------------------------------");
		
		for (String chave : exemplo.keySet()) {
			//recebendo o valor da chave
			String valor = exemplo.get(chave);
			
			System.out.println(chave + " = " + valor);
		}

	}

}
