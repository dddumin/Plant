# Plant

Тестовое задание по теме «Объектно-ориентированное программирование на языке Java с применением циклических алгоритмов обработки массивов объектов»

Указания к выполнению задания:
•	Все классы должны удовлетворять Code Conventions for the Java Programming Language и принципам SOLID
•	В каждом классе должны быть описаны конструкторы по условию задачи, инициализирующие поля классов, методы получения и установки значений по логике программы, метод toString, методы hashCode и equals

Задание:
A)	Создайте класс Plant в пакете model, описывающий понятие растение, определите для него конструкторы по умолчанию, с параметрами для инициализации только двух любых полей и для инициализации всех полей (всего 3 конструктора). У класса Plant поля: название, цвет, количество стеблей, время жизни, рыночная цена. 

Следующие задачи выполнять в виде методов, расположенных в классе Plant 
1.	Метод увеличения поля (любого) растения на заданную величину в аргументах
2.	Метод, возвращающий значение поля (любого) растения.

Следующие задачи выполнять в методе main класса Program 
1.	Создать три экземпляра класса с вызовом разных конструкторов
2.	Вывести все созданные объекты на экран
3.	Вызвать все методы и вывести на экран их возвращаемые значения, если они что-то возвращают, либо показать результат их работы

B)	Создайте класс Size, описывающий размеры растения и сделать в качестве поля Plant объект этого класса. Поля класса Size: длина, высота, периметр растения. Конструкторы по умолчанию и с аргументами (длина и высота), периметр сделать автоматически вычисляемым полем, для его вычисления на основе полей длины и высоты написать отдельный метод setPerimetr.

C)	Создайте класс Garden, который имеет в качестве поля массив растений. Конструктор - только с параметром, производящий инициализацию массива размером аргумента n. 

Следующие задачи выполнять в виде методов, расположенных в классе Garden 
1.	add - аргумент объект типа Plant, который добавляет цветок в массив растений, возвращает true или false - получилось ли добавить цветок в массив или нет. 
2.	get на вход принимает индекс растения, возвращает растение из массива растений по его индексу или null если индекс некорректный. 
3.	count - возвращает реальное количество растений в саду (столько сколько добавлено в массив, а не его размер). 
4.	Метод строкового представления - возвращает строку из всех растений в саду. 
5.	search на вход принимает имя растения и возвращает найденный объект по его имени или null, если такой объект не найден
6.	search на вход принимает объект растения и возвращает его индекс в списке всех растений в саду или -1, если такой объект не найден
7.	delete принимает на вход имя растения и производит удаление растения по его имени из сада, сдвигая все растения после удаленного влево, возвращает удаленный объект растения
8.	delete принимает на вход объект растения и производит удаление данного растения из сада, сдвигая все растения после удаленного влево, возвращает логическое значение, получилось или нет удалить растение.
9.	insert принимает на вход индекс и объект типа Plant и производит вставку этого объекта по заданному индексу, возвращает логическое значение, получилось или нет вставить растение
