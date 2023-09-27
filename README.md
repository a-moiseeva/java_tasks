# java_tasks
exersizes from coderun.yandex.ru




1. Gvozdiki (DONE)

В дощечке в один ряд вбиты гвоздики. Любые два гвоздика можно соединить ниточкой. Требуется соединить некоторые пары гвоздиков ниточками так, чтобы к каждому гвоздику была привязана хотя бы одна ниточка, а суммарная длина всех ниточек была минимальна.


Ввод (число гвоздиков, их координаты)


6

3 13 12 4 14 6


Вывод


5

2. CheapestWay (DONE)

В каждой клетке прямоугольной таблицы N×M записано некоторое число. Изначально игрок находится в левой верхней клетке. За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено). При проходе через клетку с игрока берут столько килограммов еды, какое число записано в этой клетке (еду берут также за первую и последнюю клетки его пути).
Требуется найти минимальный вес еды в килограммах, отдав которую игрок может попасть в правый нижний угол.


Ввод 


5 5

1 1 1 1 1

3 100 100 100 100

1 1 1 1 1

2 2 2 2 1

1 1 1 1 1


Вывод 


11




3. ExpensiveWay (DONE)

В левом верхнем углу прямоугольной таблицы размером N×M находится черепашка. В каждой клетке таблицы записано некоторое число. Черепашка может перемещаться вправо или вниз, при этом маршрут черепашки заканчивается в правом нижнем углу таблицы.

Подсчитаем сумму чисел, записанных в клетках, через которую проползла черепашка (включая начальную и конечную клетку). Найдите наибольшее возможное значение этой суммы и маршрут, на котором достигается эта сумма.



Ввод 


5 5


9 9 9 9 9


3 0 0 0 0


9 9 9 9 9


6 6 6 6 8


9 9 9 9 9


Вывод


74

D D R R R R D D
