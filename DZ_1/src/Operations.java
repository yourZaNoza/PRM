public class Operations {
    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 2;
        int intValue = 3;
        long longValue = 4;
        float floatValue = 3.14f;
        double doubleValue = 3.14;


        Sum(intValue, shortValue, longValue, byteValue, floatValue, doubleValue);
        Sub(intValue, shortValue, longValue, byteValue, floatValue, doubleValue);
        Mul(intValue, shortValue, longValue, byteValue, floatValue, doubleValue);
        Div(intValue, shortValue, longValue, byteValue, floatValue, doubleValue);
        Mod(intValue, shortValue, longValue, byteValue, floatValue, doubleValue);
    }
    public static void Sum(int intValue, short shortValue, long longValue, byte byteValue, float floatValue, double doubleValue) {
        int intIntSum = intValue + intValue;
        int intSum = intValue + shortValue;
        long longSum = longValue + intValue;
        float floatSum = floatValue + byteValue;
        double doubleSum = doubleValue + floatValue;


        System.out.println("Сумма: ");
        System.out.println("intSum: " + intSum);
        System.out.println("longSum: " + longSum);
        System.out.println("floatSum: " + floatSum);
        System.out.println("doubleSum: " + doubleSum);
        System.out.println("");
    }
    public static void Sub(int intValue, short shortValue, long longValue, byte byteValue, float floatValue, double doubleValue) {
        int intSub = intValue - shortValue;
        long longSub = longValue - intValue;
        float floatSub = floatValue - byteValue;
        double doubleSub = doubleValue - doubleValue;


        System.out.println("Вычитание: ");
        System.out.println("intSub: " + intSub);
        System.out.println("longSub: " + longSub);
        System.out.println("floatSub: " + floatSub);
        System.out.println("doubleSub: " + doubleSub);
        System.out.println("");
    }
    public static void Mul(int intValue, short shortValue, long longValue, byte byteValue, float floatValue, double doubleValue) {
        int intMult = intValue * byteValue;
        long longMult = longValue * shortValue;
        float floatMult = floatValue * intValue;
        double doubleMult = doubleValue * longValue;


        System.out.println("Умножение: ");
        System.out.println("intMult: " + intMult);
        System.out.println("longMult: " + longMult);
        System.out.println("floatMult: " + floatMult);
        System.out.println("doubleMult: " + doubleMult);
        System.out.println("");
    }
    public static void Div(int intValue, short shortValue, long longValue, byte byteValue, float floatValue, double doubleValue) {
        int intDiv = intValue / shortValue;
        long longDiv = longValue / intValue;
        float floatDiv = floatValue / byteValue;
        double doubleDiv = doubleValue / floatValue;


        System.out.println("Деление: ");
        System.out.println("intDiv: " + intDiv);
        System.out.println("longDiv: " + longDiv);
        System.out.println("floatDiv: " + floatDiv);
        System.out.println("doubleDiv: " + doubleDiv);
        System.out.println("");
    }
    public static void Mod(int intValue, short shortValue, long longValue, byte byteValue, float floatValue, double doubleValue) {
        int intMod = intValue % shortValue;
        long longMod = longValue % intValue;
        float floatMod = floatValue % byteValue;
        double doubleMod = doubleValue % floatValue;


        System.out.println("Остаток: ");
        System.out.println("intMod: " + intMod);
        System.out.println("longMod: " + longMod);
        System.out.println("floatMod: " + floatMod);
        System.out.println("doubleMod: " + doubleMod);
    }
}
