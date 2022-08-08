package helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
	public static final  String ER_POKEMON_ESPECIES ="https://pokeapi.co/api/v2/pokemon-species/(.*?)/";
	public static final  String ER_EVOLUTION_CHAIN="https://pokeapi.co/api/v2/evolution-chain/(.*?)/";
	
	
	
	
	//@Value("${api.pokeapi.v2}")
	private static String HOST_V2="http://localhost:8080";
	public static String replaceURL(String url) {
		return (url!=null && !url.trim().equals(""))?url.replace("https://pokeapi.co/api/v2/pokemon-species", HOST_V2+"/pokemones"):null;
	}
	
	public static String extractId(String url, String er) {
		Matcher matcher = null;
		String id=null;
		if((url!=null && !url.trim().equals(""))) {
            Pattern pId = Pattern.compile(er);
			matcher=pId.matcher(url);
		}
		if(matcher!=null  && matcher.find()) {
			id=matcher.group(1);
		}
		return id;
	}
}
