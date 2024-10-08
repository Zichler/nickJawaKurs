package lessen04;

public class TypeCasting {
    public static void main(String[] args) {
        /* Два способа преобразования типа данных
    1.Неявное преобразование(автоматическое)
    2. Явное преобразование (кастинг)
     */
        // неявное преобразование происходит автоматически, когда значене меньшего типа данных
        // преобазуется в большой тип данных
        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // неявное преобразование типа byte в тип int
        System.out.println("intVal: " + byteVal);
        // Явное преобразование
        // Требуется, когда нужно преобразованть значение из Большеготипа данных
        // в значение меньшего типа данных
        // Так как это может привести к потере данных
        double doubleVal = 42.9;
        int int1 = (int) doubleVal; // Явное преобразование из double в int
        System.out.println("doubleVal: " + doubleVal);
        System.out.println("int1: " + int1);
        short schortVal = (short) int1;
        System.out.println("shortVal: " + schortVal);
        double bigDouble = 3_000_000_000_000_000_000.00; // Тип double вмещает гораздо больший диапазон чисел в том числе и в целой части
        // преобразование в вычислениях
        System.out.println(" ==================== \n");
        int x = 20;
        int y = 7;
        double result;
        result = x / y;
        // int 2. -> неявное преобразование 2.0 -> result
        System.out.println("result: " + result);
        // 20.0 / 7.0 -> 2.85 -> result
        result = x / 7.0;
        /* когда в выражении (в формуле) присутствует несколько типов данных, то все меньшие типы данных
        автоматически, не явно, кастируются к болеее широкому типу.
         */
        System.out.println("result: " + result);
        /*
        1. int x -> явно преобразован во float
        2. int y -> не явно преобразован во float
        3. Произведено деление 20.0f / 7.0f -> 2.85f
        4. 2.85f -> не явно (авто) преобразуется в тип double
         */
        result = (float) x / y; //будет произведено обычное деление  (не целочисленное)
        System.out.println("result float cast: " + result);
        result = x / (double) y;
        System.out.println("result double cast: " + result);
        }
        }



