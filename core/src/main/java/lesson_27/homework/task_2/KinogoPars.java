package lesson_27.homework.task_2;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/*
Task 2
Распарсить 1 страницу сайта https://kinogo.biz. Какой парсер использовать - ваш выбор.
Получите данные о фильме и поместите их в свой класс. Если какого-то поля у фильма не будет, то пускай оно будет null
 */
public class KinogoPars {
    public static void main(String[] args) throws IOException {
        Connection connection = Jsoup.connect("https://kinogo.biz.");
        Document document = connection.get();
        Elements body = document.select("table.menu");

        for (Element e: body.select("tbody")) {
            e.select("tr");
        }

    }
}
