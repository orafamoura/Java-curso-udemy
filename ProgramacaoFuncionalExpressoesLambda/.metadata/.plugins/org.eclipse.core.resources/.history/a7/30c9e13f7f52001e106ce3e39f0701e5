package CursoObservacoes;

import java.util.Map;
import java.util.TreeMap;

public class MapFuncoes {

	public static void main(String[] args) {
		//uso comum, cookies, local storage, ou qualquer modelo chave-valor
		
		Map<String, String> cookies = new TreeMap<>();
				
		cookies.put("username", "maria"); // chave e valor;
		cookies.put("email", "maria@gmail.com"); // chave e valor;
		cookies.put("phone", "312312312"); // chave e valor;
		
		cookies.remove("email");
		cookies.put("phone","outrovalor");//sobrescreve o primeiro phone
		
		System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone")); //containsKey se tem a palavra phone
		System.out.println("phone number: " + cookies.get("phone")); // me da o valor do phone
		System.out.println("Email: " + cookies.get("email")); // retornou null pois removemos
		System.out.println("Size: " + cookies.size()); //tamanho do doc
				
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) { //keySet retorna um set com as chaves do map
			System.out.println(key + ": " + cookies.get(key));
		}
		
		
	}
}
