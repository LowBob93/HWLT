import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {

        String[] anyWordsArray = new String [15];
        anyWordsArray[0] = "Цырк";
        anyWordsArray[1] = "Лев";
        anyWordsArray[2] = "Кот";
        anyWordsArray[3] = "Пес";
        anyWordsArray[4] = "Цырк";
        anyWordsArray[5] = "Страус";
        anyWordsArray[6] = "Лесник";
        anyWordsArray[7] = "Лев";
        anyWordsArray[8] = "Камыш";
        anyWordsArray[9] = "Крот";
        anyWordsArray[10] = "Томас";
        anyWordsArray[11] = "Лев";
        anyWordsArray[12] = "Камаз";
        anyWordsArray[13] = "Зерновоз";
        anyWordsArray[14] = "Диабло";


        PhoneCatalog PhoneCatalog = new PhoneCatalog();
        PhoneCatalog.add("Данилов", "89188581010");
        PhoneCatalog.add("Давыдов", "89281271623");
        PhoneCatalog.add("Данилов", "89281144223");
        PhoneCatalog.add("Данилов", "89188581024");
        PhoneCatalog.add("Кибаров", "89188581025");
        PhoneCatalog.add("Асхапов", "89188581026");
        PhoneCatalog.add("Давыдов", "89188581321");
        PhoneCatalog.add("Таникян", "89188442123");
        PhoneCatalog.add("Аратенко", "89188588009");

        uniqueStringArrayCheck(anyWordsArray);
        System.out.println("__________________________________________");

        PhoneCatalog.get("Данилов");
        PhoneCatalog.get("Таникян");
        PhoneCatalog.get("Аратенко");
        PhoneCatalog.get("Давыдов");
        PhoneCatalog.get("Кибаров");
        PhoneCatalog.get("Асхапов");

    }

    public static void repeatedWords(String text, String[] tempArray) {
        int count = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i].equals(text)) {
                count++;
            }
        }
        System.out.println("Слово: " + text + " повторяеться  " + count + " раз.");
    }

    public static void uniqueStringArrayCheck(String[] stringArray) {
        Set<String> uniqueSet = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println("Уникальные слова: ");
        for (String str: uniqueSet) {
            System.out.print(str + ", ");
        }
        System.out.println(" ");
        System.out.println("____________________________________________");
        for (String str: uniqueSet) {
            repeatedWords(str, stringArray);
        }
    }
}

