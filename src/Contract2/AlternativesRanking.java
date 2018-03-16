package Contract2;

import java.util.Collection;

import com.google.common.collect.HashMultimap;

import com.google.common.collect.SetMultimap;

import contract1.Alternative;

public class AlternativesRanking {
	private SetMultimap<Integer, Alternative> map = HashMultimap.create();

	public AlternativesRanking(int rang, Alternative alt) {
		map.put(rang, alt);
	}

	public Collection<Alternative> getAlternative(int rang) {
		return map.get(rang);
	}

	public void addAlternative(int rang, Alternative alt) {
		map.put(rang, alt);
	}


}
