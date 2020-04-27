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

	    int l = 20;
	    array = new int[l];
	    for(int i = 0; i < l; i++) array[i] = i + 1;

		System.out.println("FibonacciInitializer");
		FibonacciInitializer fi = new FibonacciInitializer();
		fi.initialize(array);
		System.out.println(Arrays.toString(array));

		int sum = 0;
		for(int n: array) sum += n;
		System.out.println("sum = " + sum);

		System.out.println("RandomInitializer");
		RandomInitializer ri = new RandomInitializer();
		ri.initialize(array);
		System.out.println(Arrays.toString(array));

		BubbleSort bs = new BubbleSort();
		System.out.println("BubbleSort");
		bs.sort(array);
		System.out.println(Arrays.toString(array));

		System.out.println("RandomInitializer");
		ri.initialize(array);
		System.out.println(Arrays.toString(array));

		System.out.println("ShellSort");
		ShellSort ss = new ShellSort();
		ss.sort(array);
		System.out.println(Arrays.toString(array));
    }
}
