class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean iso = true;

        phrase = phrase.toUpperCase();
        char[] p = phrase.toCharArray();

        for (int i = 0; i < phrase.length(); i++) {
			for (int j = 0; j < phrase.length(); j++) {
				if (((p[i] == p[j]) && i != j)
						&& (p[j] != '-' && p[j] != '.' && p[j] != ',' && p[j] != '_' && p[j] != '+' && p[j] != ' '))
					iso = false;
			}
		}
        return iso;
    }

}
