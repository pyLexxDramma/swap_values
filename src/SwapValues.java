public class SwapValues {
    public static void main(String[] args) {
        int a = 5; // Первое значение
        int b = 10; // Второе значение

        System.out.println("До перестановки: a = " + a + ", b = " + b);

        // Перестановка значений
        int temp = a; // Сохраняем значение a во временной переменной
        a = b; // Присваиваем b переменной a
        b = temp; // Присваиваем временное значение переменной b

        System.out.println("После перестановки: a = " + a + ", b = " + b);
    }
}
