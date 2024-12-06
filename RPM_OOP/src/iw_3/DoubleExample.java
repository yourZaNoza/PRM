package iw_3;

public class DoubleExample {
    public static void main(String[] args) {
        // 1. Создание объектов класса Double, используя методы valueOf()
        Double doubleValue1 = Double.valueOf(3.14);
        Double doubleValue2 = Double.valueOf("2.71");

        // 2. Преобразование значения типа String к типу double
        String stringValue = "1.618";
        double doubleFromString = Double.parseDouble(stringValue);
        System.out.println("Преобразованное значение из строки: " + doubleFromString);

        // 3. Преобразование объекта класса Double ко всем примитивным типам
        byte byteValue = doubleValue1.byteValue();
        short shortValue = doubleValue1.shortValue();
        int intValue = doubleValue1.intValue();
        long longValue = doubleValue1.longValue();
        float floatValue = doubleValue1.floatValue();
        double doubleValue = doubleValue1.doubleValue();

        System.out.println("Преобразование к byte: " + byteValue);
        System.out.println("Преобразование к short: " + shortValue);
        System.out.println("Преобразование к int: " + intValue);
        System.out.println("Преобразование к long: " + longValue);
        System.out.println("Преобразование к float: " + floatValue);
        System.out.println("Преобразование к double: " + doubleValue);

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Значение объекта Double: " + doubleValue1);

        // 5. Преобразование литерала типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Преобразованное значение литерала double к строке: " + d);
    }
}

