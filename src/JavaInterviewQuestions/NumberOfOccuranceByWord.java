package JavaInterviewQuestions;

public class NumberOfOccuranceByWord {

public static int numberOfOccurrences(String source, String sentence) {
				
	    int occurrences = 0;
	    
	    if (source.contains(sentence)) {
	        int withSentenceLength    = source.length();
	        int withoutSentenceLength = source.replace(sentence, "").length();
	        occurrences = (withSentenceLength - withoutSentenceLength) / sentence.length();
	        System.out.println(occurrences);
	    }
	    return occurrences;
	}
	
	
	public static void main(String[] args) {
			
		String source = "i have a male cat. the color of male cat is Black ";
		String sentence = "male cat";
		numberOfOccurrences(source, sentence);
	}

	
		
	
	
}
