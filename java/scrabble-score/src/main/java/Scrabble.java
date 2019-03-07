class Scrabble {

    String word;

    Scrabble(String w) {
        setWord(w.toUpperCase());
    }

    int getScore() {
        char[] c = wordChar(getWord());
        int scrab = 0;

        for (int i = 0; i < wordSize(getWord()); i++) {
            if (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U' || c[i] == 'L' || c[i] == 'N'
					|| c[i] == 'R' || c[i] == 'S' || c[i] == 'T')
				scrab += 1;
			else if (c[i] == 'D' || c[i] == 'G')
				scrab += 2;
			else if (c[i] == 'B' || c[i] == 'C' || c[i] == 'M' || c[i] == 'P')
				scrab += 3;
			else if (c[i] == 'F' || c[i] == 'H' || c[i] == 'V' || c[i] == 'W' || c[i] == 'Y')
				scrab += 4;
			else if (c[i] == 'K')
				scrab += 5;
			else if (c[i] == 'J' || c[i] == 'X')
				scrab += 8;
			else if (c[i] == 'Q' || c[i] == 'Z')
				scrab += 10;
			else
				scrab += 0;
        }
        return scrab;
    }

    String getWord() {
        return word;
    }

    void setWord(String word) {
        this.word = word;
    }

    int wordSize(String w) {
        return w.length();
    }

    char[] wordChar(String w) {
        return w.toCharArray();
    }

}
