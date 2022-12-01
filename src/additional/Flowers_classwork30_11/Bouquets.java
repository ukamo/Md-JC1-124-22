package additional.Flowers_classwork30_11;

public class Bouquets {
    //объявляем массив
    private IFlowers[] array1;

    //конструктор массива
    public Bouquets(IFlowers[] array1) {
        this.array1 = array1;
    }

    //методы
    public String check() {
        for (IFlowers flower : array1) {
            if (flower.checkExpired() == false){
                String str1 = "Завядшие цветы";
                return str1;
            }
        }
        return "Свежие цветы";
    }
}


