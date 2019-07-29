package dev.bonjugi.algorithmstudy.street11test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test2 {

	@Test
	public void test(){
		assertThat(solution("codility")).isEqualTo(-1);
	}

	@Test
	public void test2(){
		assertThat(solution("aabcaabcabda")).isEqualTo(7);
	}

	@Test
	public void test3(){
		assertThat(solution("aaa")).isEqualTo(1);
	}

    public int solution(String S) {

		List<Diagram> diagrams = convertToDiagrams(S);

	    int largestDistance = -1;

	    for (int i = 0; i < diagrams.size(); i++) {

		    Diagram a = diagrams.get(i);

		    for (int j = diagrams.size()-1; j > i; j--) {

			    Diagram b = diagrams.get(j);

			    if (a.isEqualsWord(b)) {
				    int distance = a.distance(b);
				    if (distance > largestDistance) {
					    largestDistance = distance;
				    }

				    break;
			    }
		    }

	    }

	    return largestDistance;
    }

	private List<Diagram> convertToDiagrams(String S) {
		String[] split = S.split("");

		List<Diagram> words = new ArrayList<>();

		for (int i = 1; i < split.length; i++) {

			String cur = split[i];
			String prev = split[i - 1];


			Diagram diagram = new Diagram(i,prev + cur);
			words.add(diagram);
		}
		return words;
	}


	class Diagram {

		int idx;
		String word;

		Diagram(int i, String s) {
			idx = i;
			word = s;
		}

		boolean isEqualsWord(Diagram that){
			return this.word.equals(that.word);
		}

		int distance(Diagram that){
			return that.idx - this.idx;
		}
	}
}
