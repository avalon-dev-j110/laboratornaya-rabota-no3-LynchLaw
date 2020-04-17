package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        int[] array;

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */

	    array = new int[20];
	    for(int i = 0; i < 20; i++) array[i] = i + 1;

		FibonacciInitializer fi = new FibonacciInitializer(0, array);
		array = fi.getArray();

		int sum = 0;
		for(int n: array) sum += n;

		System.out.println(Arrays.toString(array));
		System.out.println(sum);

		array = Randomized(array);
		System.out.println(Arrays.toString(array));

		BubbleSort bs = new BubbleSort();
		bs.sort(array);
		array = bs.getArray();
		System.out.println(Arrays.toString(array));

		array = Randomized(array);
		System.out.println(Arrays.toString(array));

		ShellSort ss = new ShellSort();
		ss.sort(array);
		array = ss.getArray();
		System.out.println(Arrays.toString(array));
    }

    private static int[] Randomized(int[] array){
		RandomInitializer ri = new RandomInitializer();
		ri.initialize(array);
		return ri.getArray();
	}
}
