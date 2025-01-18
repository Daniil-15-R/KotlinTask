import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Выберите функцию (1-15):")
        println("1. Нахождение максимума")
        println("2. Деление")
        println("3. Конвертация строки в число")
        println("4. Проверка возраста")
        println("5. Нахождение корня")
        println("6. Факториал")
        println("7. Проверка массива на нули")
        println("8. Возведение в степень")
        println("9. Обрезка строки")
        println("10. Поиск элемента в массиве")
        println("11. Конвертация в двоичную систему")
        println("12. Проверка делимости")
        println("13. Чтение элемента списка")
        println("14. Проверка силы пароля")
        println("15. Проверка даты")
        println("16. Конкатенация строк")
        println("17. Остаток от деления")
        println("18. Квадратный корень")
        println("19. Конвертер температуры")
        println("20. Проверка строки на пустоту")
        println("0. Выход")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                println("Введите два числа:")
                val a = scanner.nextInt()
                val b = scanner.nextInt()
                try {
                    println("Максимум: ${max(a, b)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            2 -> {
                println("Введите два числа для деления:")
                val a = scanner.nextDouble()
                val b = scanner.nextDouble()
                try {
                    println("Результат деления: ${divide(a, b)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            3 -> {
                println("Введите строку для конвертации в число:")
                val str = scanner.next()
                try {
                    println("Конвертированное число: ${stringToInt(str)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            4 -> {
                println("Введите возраст:")
                val age = scanner.nextInt()
                try {
                    checkAge(age)
                    println("Возраст корректен.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            5 -> {
                println("Введите число для нахождения корня:")
                val number = scanner.nextDouble()
                try {
                    println("Квадратный корень: ${squareRoot(number)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            6 -> {
                println("Введите число для нахождения факториала:")
                val n = scanner.nextInt()
                try {
                    println("Факториал: ${factorial(n)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            7 -> {
                println("Введите размер массива:")
                val size = scanner.nextInt()
                val array = Array(size) { 0 }
                println("Введите элементы массива (целые числа):")
                for (i in 0 until size) {
                    array[i] = scanner.nextInt()
                }
                try {
                    checkArrayForZeros(array)
                    println("Массив не содержит нулей.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            8 -> {
                println("Введите основание и степень:")
                val base = scanner.nextDouble()
                val exponent = scanner.nextInt()
                try {
                    println("Результат возведения в степень: ${power(base, exponent)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            9 -> {
                println("Введите строку и длину для обрезки:")
                val str = scanner.next()
                val length = scanner.nextInt()
                try {
                    println("Обрезанная строка: ${trimString(str, length)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            10 -> {
                println("Введите размер массива:")
                val size = scanner.nextInt()
                val array = Array(size) { 0 }
                println("Введите элементы массива (целые числа):")
                for (i in 0 until size) {
                    array[i] = scanner.nextInt()
                }
                println("Введите элемент для поиска:")
                val element = scanner.nextInt()
                try {
                    findElement(array, element)
                    println("Элемент найден.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            11 -> {
                println("Введите целое число для конвертации в двоичную систему:")
                val number = scanner.nextInt()
                try {
                    println("Двоичное представление: ${intToBinaryString(number)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            12 -> {
                println("Введите два числа для проверки делимости:")
                val a = scanner.nextInt()
                val b = scanner.nextInt()
                try {
                    checkDivisibility(a, b)
                    println("$a делится на $b.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            13 -> {
                println("Введите список строк (разделенные пробелами):")
                val list = scanner.next().split(" ")
                println("Введите индекс элемента:")
                val index = scanner.nextInt()
                try {
                    println("Элемент: ${getElementFromList(list, index)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            14 -> {
                println("Введите пароль для проверки:")
                val password = scanner.next()
                try {
                    checkPasswordStrength(password)
                    println("Пароль достаточно сильный.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            15 -> {
                println("Введите дату в формате dd.MM.yyyy:")
                val date = scanner.next()
                try {
                    isValidDate(date)
                    println("Дата корректна.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            16 -> {
                println("Введите две строки для конкатенации:")
                val str1 = scanner.next()
                val str2 = scanner.next()
                try {
                    println("Результат конкатенации: ${concatenateStrings(str1, str2)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            17 -> {
                println("Введите два числа для остатка от деления:")
                val a = scanner.nextInt()
                val b = scanner.nextInt()
                try {
                    println("Остаток от деления: ${remainder(a, b)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            18 -> {
                println("Введите число для нахождения квадратного корня:")
                val number = scanner.nextDouble()
                try {
                    println("Квадратный корень: ${squareRootOfNumber(number)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            19 -> {
                println("Введите температуру в Цельсиях:")
                val celsius = scanner.nextDouble()
                try {
                    println("Температура в Фаренгейтах: ${celsiusToFahrenheit(celsius)}")
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            20 -> {
                println("Введите строку для проверки на пустоту:")
                val str = scanner.next()
                try {
                    checkStringEmpty(str)
                    println("Строка не пустая.")
                } catch (e: Exception) {
                    println(e.message)
                }
            }

            0 -> break
            else -> println("Некорректный выбор.")
        }
    }

    scanner.close()
}

// Функции остаются без изменений
fun max(a: Int, b: Int): Int {
    if (a == b) throw IllegalArgumentException("Числа равны.")
    return if (a > b) a else b
}

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) throw ArithmeticException("Деление на ноль.")
    return a / b
}

fun stringToInt(str: String): Int {
    return str.toIntOrNull() ?: throw NumberFormatException("Невозможно преобразовать строку в целое число.")
}

fun checkAge(age: Int) {
    if (age < 0 || age > 150) throw IllegalArgumentException("Некорректный возраст.")
}

fun squareRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Отрицательное число.")
    return Math.sqrt(number)
}

fun factorial(n: Int): Long {
    if (n < 0) throw IllegalArgumentException("Отрицательное число.")
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun checkArrayForZeros(array: Array<Int>) {
    if (array.contains(0)) throw IllegalArgumentException("Массив содержит нули.")
}

fun power(base: Double, exponent: Int): Double {
    if (exponent < 0) throw IllegalArgumentException("Отрицательная степень.")
    return Math.pow(base, exponent.toDouble())
}

fun trimString(str: String, length: Int): String {
    if (length > str.length) throw IllegalArgumentException("Длина превышает размер строки.")
    return str.substring(0, length)
}

fun findElement(array: Array<Int>, element: Int) {
    if (!array.contains(element)) throw NoSuchElementException("Элемент не найден.")
}

fun intToBinaryString(number: Int): String {
    if (number < 0) throw IllegalArgumentException("Отрицательное число.")
    return Integer.toBinaryString(number)
}

fun checkDivisibility(a: Int, b: Int) {
    if (b == 0) throw ArithmeticException("Деление на ноль.")
    if (a % b != 0) throw IllegalArgumentException("$a не делится на $b.")
}

fun getElementFromList(list: List<String>, index: Int): String {
    if (index < 0 || index >= list.size) throw IndexOutOfBoundsException("Индекс вне пределов списка.")
    return list[index]
}

class WeakPasswordException(message: String) : Exception(message)

fun checkPasswordStrength(password: String) {
    if (password.length < 8) throw WeakPasswordException("Пароль слишком слабый.")
}

fun isValidDate(date: String) {
    val regex = Regex("^(\\d{2})\\.(\\d{2})\\.(\\d{4})$")
    if (!regex.matches(date)) throw IllegalArgumentException("Некорректный формат даты.")
}

fun concatenateStrings(str1: String?, str2: String?): String {
    if (str1 == null || str2 == null) throw NullPointerException("Одна из строк равна null.")
    return str1 + str2
}

fun remainder(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Деление на ноль.")
    return a % b
}

fun squareRootOfNumber(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Отрицательное число.")
    return Math.sqrt(number)
}

fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) throw IllegalArgumentException("Температура ниже абсолютного нуля.")
    return celsius * 9/5 + 32
}

fun checkStringEmpty(str: String?) {
    if (str.isNullOrEmpty()) throw IllegalArgumentException("Строка пустая или равна null.")
}
