
public class Lab3 {
	public static void main(String[] args) {
		String text = "Hello my Mother! I am at home. I love You! When will you be at home?";
		int currentSentenceStartPosition = 0;

		int[] indexes = new int[3];
		while (currentSentenceStartPosition < text.length()) {

			indexes[0] = text.indexOf("!", currentSentenceStartPosition);
			indexes[1] = text.indexOf(".", currentSentenceStartPosition);
			indexes[2] = text.indexOf("?", currentSentenceStartPosition);

			int endSentenceSymbol = indexes[0];
			for (int i = 1; i < indexes.length; i++) {
				if (endSentenceSymbol == -1 || (indexes[i] != -1 && endSentenceSymbol > indexes[i])) {
					endSentenceSymbol = indexes[i];

				}
			}

			int firstSentenceSpace = (text.indexOf(" ", currentSentenceStartPosition));
			int lastSentenceSpace = (text.lastIndexOf(" ", endSentenceSymbol));

			String firstSentenceWord = (text.substring(currentSentenceStartPosition, firstSentenceSpace));
			String lastSentenceWord = (text.substring(lastSentenceSpace + 1, endSentenceSymbol));

			System.out.print(lastSentenceWord + text.substring(firstSentenceSpace, lastSentenceSpace + 1)
					+ firstSentenceWord + text.substring(endSentenceSymbol, endSentenceSymbol + 1) + " ");

			currentSentenceStartPosition = endSentenceSymbol + 2;
		}

	}
}