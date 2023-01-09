package home_work_6;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int count = 0;
        String[] split1 = text.split("\n");
        for (String str : split1) {
            if (str.equals("") || str.equals("\r")) {
                continue;
            }
            int startPosition = 0;
            while (startPosition <= str.length()) {
                int index = str.indexOf(word, startPosition);

                if (index < 0) {
                    break;
                }

                if (index == 0) {
                    if (str.length() == word.length()) {
                        count++;
                    } else {
                        String substring = str.substring(index + word.length(), index + word.length() + 1);
                        if (isNotSpecialCharacter(substring)) {
                            count++;
                        }
                    }
                } else if (index + word.length() == str.length()) {
                    String substring = str.substring(index - 1, index);
                    if (isNotSpecialCharacter(substring)) {
                        count++;
                    }
                } else if (isNotSpecialCharacter(str.substring(index - 1, index))
                        &&
                        (isNotSpecialCharacter(str.substring(index + word.length(), index + word.length() + 1)))) {
                    count++;
                }
                startPosition = index + word.length();
            }
        }

        return count;
    }

    private static boolean isNotSpecialCharacter(String str) {
        return str.equals(" ") || str.equals(",") || str.equals(".")
                || str.equals("-") || str.equals("!") || str.equals("?")
                || str.equals(":") || str.equals(";") || str.equals("\r")
                || str.equals("\"");
    }

}
