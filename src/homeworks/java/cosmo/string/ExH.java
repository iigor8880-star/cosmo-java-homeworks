package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";

        String[] split = fullName.split(" ");
        StringBuilder stringBuilder= new StringBuilder();

        for (int i=0;i<split.length;i++)
        {
            char bukva = split[i].charAt(0);
            stringBuilder.append(bukva).append(".");
        }
        System.out.println(stringBuilder);

    }
}
