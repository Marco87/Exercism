public class PangramChecker {

    public boolean isPangram(String i) {

      String input = i.toUpperCase();

      if (input.contains("A") && input.contains("B") && input.contains("C") && input.contains("D")
				&& input.contains("E") && input.contains("F") && input.contains("G") && input.contains("H")
				&& input.contains("I") && input.contains("J") && input.contains("K") && input.contains("L")
				&& input.contains("M") && input.contains("N") && input.contains("O") && input.contains("P")
				&& input.contains("Q") && input.contains("R") && input.contains("S") && input.contains("T")
				&& input.contains("U") && input.contains("V") && input.contains("W") && input.contains("X")
				&& input.contains("Y") && input.contains("Z")) {
			return true;
		} else {
			return false;
		}
    }
}
