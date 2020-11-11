package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {
	/**
	 * Demonstrate how to use Map that includes storing and retrieving elements.
	 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 *            				 <>><></></><></>   Map,List   <>><></></><></>
	 *  Autor: ALAEDDINE Kramou
	 *  date: 10/18/2020
	 */
	public static void main(String[] args) {

		List<String> playersofJuventus = new ArrayList<>();
		playersofJuventus.add("Dybala");
		playersofJuventus.add("Cristiano");
		playersofJuventus.add("Buffon");
		playersofJuventus.add("Matuidi");
		playersofJuventus.add("Bunocci");

		List<String>  playersofbarcelona = new ArrayList<>();
		playersofbarcelona.add("Messi ");
		playersofbarcelona.add("Pique");
		playersofbarcelona.add("Gizman");
		playersofbarcelona.add("Dejoung");
		playersofbarcelona.add("Busquwets");

		List<String>  playersofManCity = new ArrayList<>();
		playersofManCity.add("Mahrez");
		playersofManCity.add("Aguero");
		playersofManCity.add("Debruyn");
		playersofManCity.add("Mandi");
		playersofManCity.add("Silva");

		Map<String, List<String>> list = new HashMap<>();
		list.put("juventus Players", playersofJuventus);
		list.put("Barcelona Players", playersofbarcelona);
		list.put("Manchester City Players", playersofManCity);

		for (Map.Entry<String, List<String>> entry : list.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	}
