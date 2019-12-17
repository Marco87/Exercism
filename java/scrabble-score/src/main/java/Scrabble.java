class Scrabble {

    String word;

    Scrabble(String w) {
        setWord(w.toUpperCase());
    }

    int getScore() {
        char[] c;
        c = getWord().toCharArray();
        int scrab = 0;

        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'A':
                    scrab += 1;
                    break;
                case 'E':
                    scrab += 1;
                    break;
                case 'I':
                    scrab += 1;
                    break;
                case 'O':
                    scrab += 1;
                    break;
                case 'U':
                    scrab += 1;
                    break;
                case 'L':
                    scrab += 1;
                    break;
                case 'N':
                    scrab += 1;
                    break;
                case 'R':
                    scrab += 1;
                    break;
                case 'S':
                    scrab += 1;
                    break;
                case 'T':
                    scrab += 1;
                    break;
                case 'D':
                    scrab += 2;
                    break;
                case 'G':
                    scrab += 2;
                    break;
                case 'B':
                    scrab += 3;
                    break;
                case 'C':
                    scrab += 3;
                    break;
                case 'M':
                    scrab += 3;
                    break;
                case 'P':
                    scrab += 3;
                    break;
                case 'F':
                    scrab += 4;
                    break;
                case 'H':
                    scrab += 4;
                    break;
                case 'V':
                    scrab += 4;
                    break;
                case 'W':
                    scrab += 4;
                    break;
                case 'Y':
                    scrab += 4;
                    break;
                case 'K':
                    scrab += 5;
                    break;
                case 'J':
                    scrab += 8;
                    break;
                case 'X':
                    scrab += 8;
                    break;
                case 'Q':
                    scrab += 10;
                    break;
                case 'Z':
                    scrab += 10;
                    break;
                default:
                    scrab += 0;
                }
            }
        return scrab;
    }

    String getWord() {
        return word;
    }

    void setWord(String word) {
        this.word = word;
    }
}
