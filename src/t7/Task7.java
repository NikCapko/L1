package t7;

public class Task7 {

    public void getResult() {

        System.out.println("\n Task 7");

        String s = "Madam, I'm Adam!";
        System.out.println(isPalindrom(s));
    }

    private Boolean isPalindrom(String s) {
        String str = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
        }

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(stringBuilder.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
