package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

import java.util.Arrays;

/**
 * Класс, выполняющий инициализацию массива числе,
 * значениями последовательности Фибоначчи.
 *
 * <p>Чи́сла Фибона́ччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21 …
 * (последовательность A000045 в OEIS), в которой первые два
 * числа равны либо 1 и 1, либо 0 и 1, а каждое последующее
 * число равно сумме двух предыдущих чисел.
 *
 * <p>Экземпляры класса можно использовать повторно для
 * инициализации любого числа массивов. При инициализации
 * нового массива, последовательность начинается с начала.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class FibonacciInitializer implements Initializer {

    private int[] array;
    public FibonacciInitializer(int f, int[] array){
        int l = array.length;
        if (l > 0) array[0] = f;
        if (l > 1) array[1] = 1;
        initialize(array);
    }
    /**
     * Выполняет инициализацию массива значениями
     * последовательности Фибоначчи.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса FibonacciInitializer
         */
        if (array.length > 2) {
            for (int i = 2; i < array.length; i++){
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }
}
