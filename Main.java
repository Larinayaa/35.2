import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Вася", "Петя", "Катя", "Аня", "Иван", "Дима"));
        System.out.println(names);
        System.out.println("------------РЕЗУЛЬТАТ-------------------");
        udalitImena(names, 3, 2);  // удаляем имена с индексами 1 и 2
        System.out.println(names); // выводим
    }
    public static void udalitImena(List<String> names, int i, int sum) {
        //сум - количество которое мы возьмем всего для удаления поочередно вместе со стартовым индексом
        if (i >= 0 && i < names.size() && i + sum <= names.size()) {//три "также"
            for (int k = 0; k < sum; k++) {
                names.remove(i); // пока соблюдается условие цикла,итый элемент удаляется
            }
        } else {
            System.out.println("Ошибка. Невозможно произвести операцию.");
        }
    }
}
