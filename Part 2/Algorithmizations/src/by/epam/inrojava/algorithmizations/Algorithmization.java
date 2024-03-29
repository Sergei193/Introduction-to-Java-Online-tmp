package by.epam.inrojava.algorithmizations;


public class Algorithmization {

    public static void main(String[] args) {
        ////////////////////////////////////////One-dimensional arrays
        //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
        //Task_1 task_1 = new Task_1();
        //    2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
        //    числом. Подсчитать количество замен.
        //Task_2 task_2 = new Task_2();
        //    3.Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
        //     положительных и нулевых элементов.
        //Task_3 task_3 = new Task_3();
        // 4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
        //Task_4 task_4 = new Task_4();
        //5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
        //Task_5 task_5 = new Task_5();
        // 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
        // являются простыми числами.
        // Task_6 task_6 = new Task_6();
        //7. Даны действительные числа n a ,a , ,a 1 2  . Найти
        //    max( a1 + a2n,a2 + a2n−1,....,an + an+1) .
        //Task_7 task_7 = new Task_7();
        //   8. Дана последовательность целых чисел a1, a2, …an.
        //    Образовать новую последовательность, выбросив из исходной, те члены, которые равны min(a1, a2, …an)
        //        Task_8 task_8 = new Task_8();
        //    9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        //    чисел несколько, то определить наименьшее из них.
        //        Task_9 task_9 = new Task_9();
        //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
        //    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
//        Task_10 task_10 = new Task_10();
        ////////=======================================================================================================
        /////////===========Задачи. Массивы массивов
        //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
//        Task_11 task_11 = new Task_11();
        ///  2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
//        Task_12 task_12 = new Task_12();
        //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
//        Task_13 task_13 = new Task_13();
        // 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//        Task_14 task_14 = new Task_14();
        //5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//        Task_15 task_15 = new Task_15();
        // 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//        Task_16 task_16 = new Task_16();
        //7. Сформировать квадратную матрицу порядка N по правилу:
        // A[I,J] = sin((I^2-J^2)/N) и подсчитать количество положительных элементов
//        Task_17 task_17 = new Task_17();
        //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//    пользователь с клавиатуры
//        Task_18 task_18 = new Task_18();
        //    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//    столбец содержит максимальную сумму.
//        Task_19 task_19 = new Task_19();
        //10. Найти положительные элементы главной диагонали квадратной матрицы.
//        Task_20 task_20 = new Task_20();
        //    11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//    которых число 5 встречается три и более раз.
//        Task_21 task_21 = new Task_21();
        // 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
//        Task_22 task_22 = new Task_22();
        //13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
//        Task_23 task_23 = new Task_23();
        //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
//        Task_24 task_24 = new Task_24();
        //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
//        Task_25 task_25 = new Task_25();
        //    16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//            ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//    собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//            6 1 8
//            7 5 3
//            2 9 4
//        Task_26 task_26 = new Task_26();
//        ////////////////Одномерные массивы. Сортировки
//        1 Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//        дополнительный массив.
//        Task_27 task_27 = new Task_27();
//        2.Даны две последовательности a1<=a2<=a3<=aN и b1<=b2<=b3<=bM. Образовать из них новую последовательность
//        чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
//        Task_28 task_28 = new Task_28();
//        3.Cортировка выбором. Дана последовательность чисел a1<=a2<=a3<= ...<=aN .Требуется переставить элементы так,
//        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//        элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//        повторяется. Написать алгоритм сортировки выбором.
//        Task_29 task_29 = new Task_29();
//        4. Сортировка обменами. Дана последовательность чисел a1<=a2<=   <=aN .Требуется переставить числа в
//        порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается
//        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
//        Task_30 task_30 = new Task_30();
//        5.Сортировка вставками. Дана последовательность чисел a1,a2,a3,a4...aN.
//                Требуется переставить числа в порядке возрастания. Делается это следующим образом.
//        Пусть a1, a2, a3 .. aN упорядоченная последовательность, т.е. a1<=a2<=...<=aN.
//                Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//        последовательность была тоже возрастающей.
//        Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//                Примечание. Место помещения очередного элемента в отсортированную часть производить
//        с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
//        Task_31 task_31 = new Task_31();
// 6.  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
// его по возрастанию. Делается это следующим образом: сравниваются два сосед-
// них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
//элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
//  тся на один элемент назад. Составить алгоритм этой сортировки.
//        Task_32 task_32 = new Task_32();
// 7.  Пусть даны две неубывающие последовательности действительных
//чисел  a1 <= a2 <= ... <= an и b1 <= b2 <= ... <=bm .
//Требуется указать те места, на которые нужно вставлять элементы
//последовательности b1 <= b2 <= ... <=bm в первую  последовательность так,
//чтобы новая последовательность оставалась возрастающей.
//        Task_33 task_33 = new Task_33();
//        8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
//                которая приводит эти дроби к общему знаменателю и упорядочивает их в  порядке возрастания.

//        Task_34 task_34 = new Task_34();
//        Декомпозиция с использованием методов (подпрограммы)
//          1.Написать метод(методы) для нахождения наибольшего общего делителя и
//          наименьшего общего кратного двух натуральных чисел:НОК(А,В) = A*B / НОД(A,B)
//        Task_35 task_35 = new Task_35();
//    2.Написать метод(методы) для нахождения наибольшего общего делителя четырех
//     натуральных чисел.
//        Task_36 task_36 = new Task_36();
// 3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
// используя  метод  вычисления  площади  треугольника.
//        Task_37 task_37 = new Task_37();
//   4. На плоскости заданы своими координатами  n точек.
//      Написать метод(методы), определяющие, между какими  из пар точек самое большое расстояние.
//    Указание. Координаты точек занести в массив.
//        Task_38 task_38 = new Task_38();
//        5.Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//                которое меньше максимального элемента массива, но больше всех других элементов).
//        Task_39 task_39 = new Task_39();
//        6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
//        Task_40 task_40 = new Task_40();
//        7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
//        Task_41 task_41 = new Task_41();
//    8.Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//    массива с номерами от k до m.
//        Task_42 task_42 = new Task_42();
        //    9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//    вычисления его площади, если угол между сторонами длиной X и Y— прямой.
//        Task_43 task_43 = new Task_43();
//        10. Дано натуральное число N. Написать метод(методы) для формирования массива,
//        элементами которого являются цифры числа N
//        Task_44 task_44 = new Task_44();
//        11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
//        Task_45 task_45 = new Task_45();
        //    12.Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//    элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
//        Task_46 task_46 = new Task_46();
//        13. Два простых числа называются «близнецами», если они отличаются друг от друга
//        на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
//        n,2n], где n - заданное натуральное число больше 2. Для решения задачи
//        использовать декомпозицию.
//        Task_47 task_47 = new Task_47();
//         14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,
// если  сумма  его  цифр,  возведенная в степень  n, равна  самому  числу.
// Найти  все  числа Армстронга  от  1 до  k.
//        Для решения  задачи  использовать декомпозицию.
//         Task_48 task_48 = new Task_48();
// 15.  Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго
// возрастающую  последовательность (например, 1234, 5789).
// Для решения задачи использовать декомпозицию.
//        Task_49 task_49 = new Task_49();
//      16.  Написать программу, определяющую сумму n - значных чисел, содержащих только
//        нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
//        решения задачи использовать декомпозицию.
//        Task_50 task_50 = new Task_50();
//        17. Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких  действий надо произвести, чтобы получился нуль?
//  Для решения задачи использовать декомпозицию.

    }

}
