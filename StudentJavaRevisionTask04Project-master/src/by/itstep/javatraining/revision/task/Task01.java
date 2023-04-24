package by.itstep.javatraining.revision.task;

/*	Task 01. Time Period [разность времени]
 *
 *	Даны значения двух моментов времени, принадлежащих одним и тем же суткам:
 *	часы, минуты и секунды для каждого из моментов времени.
 *	Определите, сколько секунд прошло между двумя моментами времени.
 *
 *	Примечание
 *	1) Моменты времени могут задаваться по-разному.
 *	2) Не забудьте про "защиту от дурака": если данные момента времени некорректны, то нужно возвратить -1.
 *  3) Можно попробовать решить данную задачу без использования условных конструкций.
 *
 *	Формат входных данных [input]
 *	На вход даётся три целых числа в диапазоне типа int: часы, минуты, секунды,
 *	задающие один момент времени и три целых числа, задающих ещё один момент времени.
 *
 *	Формат выходных данных [output]
 *	Возвратить число секунд между этими моментами времени или -1.
 *
 *	[ input 1]: 1 1 1 2 2 2
 *	[output 1]: 3661
 *
 *	[ input 2]: 2 2 2 1 1 1
 *	[output 2]: 3661
 *
 *	[ input 3]: 1 2 30 1 3 20
 *	[output 3]: 50
 *
 *	[ input 4]: 0 0 0 0 0 0
 *	[output 4]: 0
 *
 *	[ input 5]: 1 2 -30 1 3 20
 *	[output 5]: -1
 */

public class Task01 {
    public static int task01(int hour1, int minute1, int second1, int hour2, int minute2, int second2) {

        if (hour1 >= 0 && minute1 >= 0 && second1 >= 0 && hour2 >= 0 && minute2 >= 0 && second2 >= 0 &&
                hour1 < 24 && minute1 < 60 && second1 < 60 && hour2 < 24 && minute2 < 60 && second2 < 60) {

            int secPeriod1 = hour1 * 3600 + minute1 * 60 + second1;
            int secPeriod2 = hour2 * 3600 + minute2 * 60 + second2;
            return ((secPeriod1 >= secPeriod2) ? (secPeriod1 - secPeriod2) : (secPeriod2 - secPeriod1));
        }
        return -1;
    }
}