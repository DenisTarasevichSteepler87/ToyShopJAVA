public class Toy {
    private int id; // номер игрушки
    private String name; // название
    private int weight; // частота выпадения, используемая как приоритет

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // Переопределяем toString() для удобства вывода информации о игрушке
    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}