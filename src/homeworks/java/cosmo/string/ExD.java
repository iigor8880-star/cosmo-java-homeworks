package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!”
 * и выводит каждый символ строки на отдельной строке.
 * <p>
 * Подсказка: используйте метод .toCharArray() класса String
 */
public class ExD {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
//        String[] str = input.split("");
//        for (String word : str) {
//            System.out.println(word);
//        }
        char[] charArray = input.toCharArray();
        for (char word : charArray)
        {
            System.out.println(word);
        }
    }
}