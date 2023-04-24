package by.itstep.javatraining.revision.task;

/*	Task 07. Minsk Ring Road [МКАД]
 *
 *	Длина Минской кольцевой автомобильной дороги примерно равна 56 километров.
 *	Студент-байкер стартует с нулевого километра МКАД и едет со скоростью V километров в час.
 *	На какой отметке он остановится через T часов?
 *
 *	Примечание
 *	Время не может быть отрицательным, предусмотрите "защиту от дурака".
 *	Скорость может быть отрицательной - это будет обозначать,
 *  что студент-байкер едет в противоположную сторону.
 *
 *	Формат входных данных [input]
 *	На вход даётся целые числа V и T в диапазоне типа int.
 *	Если V > 0, то студент-байкер движется в положительном направлении по МКАД,
 *	если же значение V < 0, то в отрицательном.
 *
 *	Формат выходных данных [output]
 *	Возвратите целое число от 0 до 56 — номер отметки,
 *	на которой остановится студент-байкер, или -1 - если время задано некорректно.
 *
 *	[ input 1]: 40 2
 *	[output 1]: 24
 *
 *	[ input 2]: -1 1
 *	[output 2]: 55
 *
 *	[ input 3]: 10 -5
 *	[output 3]: -1
 *
 *	[ input 4]: 0 3
 *	[output 4]: 0
 *
 *	[ input 5]: 5 0
 *	[output 5]: 0
 */

public class Task07 {
    public static int task07(int v, int t) {
        if (t >= 0 && v >= 0) {
            return (v * t) % 56;
        } else if (t >= 0) {
            return 56 + (v * t) % 56;
        }
        return -1;
    }
}
