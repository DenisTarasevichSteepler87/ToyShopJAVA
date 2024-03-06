import java.util.PriorityQueue;
import java.util.Comparator;
import java.io.FileWriter;
import java.io.IOException;

public class ToyStore {
    private PriorityQueue<Toy> toys;

    public ToyStore() {
         // Инициализация кдасса PriorityQueue для сортировки по весу
         this.toys = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
        }
    
        public void addToy(Toy toy) {
            toys.add(toy);
        }
        // Метод для извлечения игрушек из очереди
    public Toy getToy() {
        return toys.poll(); // Возвращает и удаляет элемент с наивысшим приоритетом
    }

    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // Добавление игрушек в магазин
        // Формируем 3 массива
        Toy[] arr1 = new Toy[]{
                new Toy(1, "Великан", 6),
                new Toy(2, "Гном", 4),
                new Toy(3, "Крепыш", 11),
                new Toy(4, "Кроха", 5)
        };
        Toy[] arr2 = new Toy[]{
                new Toy(5, "Пухлик", 6),
                new Toy(6, "Мисс", 7),
                new Toy(7, "Смайлик", 10),
                new Toy(8, "Босс", 12)
        };
        Toy[] arr3 = new Toy[]{
                new Toy(9, "Пузырь", 3),
                new Toy(10, "Беби", 2)
        };
        for (int i = 0; i < arr1.length; i++) {
            store.addToy(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            store.addToy(arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            store.addToy(arr3[i]);
        }
         // Запись результатов в файл
         try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < 10; i++) {
                Toy toy = store.getToy();
                if (toy != null) {
                    writer.write(toy.toString() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}