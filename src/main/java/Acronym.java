final class Acronym {
    String inputPhrase;

    Acronym(String phrase) {
      inputPhrase = phrase;
    }

    String get() {
        String acronym = "";

        String[] words = inputPhrase.split("[-\\s]");

        for(String word : words) {
          acronym += word.substring(0, 1).toUpperCase();
        }

        return acronym;
    }

}
