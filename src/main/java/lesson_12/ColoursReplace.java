package lesson_12;
/*
Task 3
Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
 */
public class ColoursReplace {
    public static void main(String[] args) {
        String colours = "Green. red. blue. yellow";
        colours = colours.replace(".", ",");
        System.out.println(colours);
    }
}
