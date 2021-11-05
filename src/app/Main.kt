package app

import java.util.*

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Программа для работы с прямоугольниками")

            val sc = Scanner(System.`in`)
            val rect1 = Rect.create("\nСоздание 1 прямоугольника\n", sc)

            println("Периметр 1 прямоугольника: ${ rect1.per() }")
            println("Площадь 1 прямоугольника: ${ rect1.area() }")

            val rect2 = Rect.create("\nСоздание 2 прямоугольника\n", sc)

            println(
                if (Rect.contains(rect1, rect2)) "1 прямоугольник содержится во 2.\n"
                else "1 прямоугольник не содержится во 2.\n"
            )

            val rectangles: Array<Rect> = arrayOf(
                Rect(356),
                Rect(),
                Rect(13, 63),
                Rect(13.2f, 12.4f)
            )

            rectangles[2].w = 42.0
            rectangles[2].h = 14.25

            rectangles.mapIndexed { i, r ->
                println(
                    "Параметры ${ i + 3 } прямоугольника:" +
                    "\n\tРазмеры: ${ r.w } x ${ r.h }" +
                    "\n\tПериметр: ${ r.per() }" +
                    "\n\tПлощадь: ${ r.area() }\n"
                )
            }

            println("Всего создано прямоуголтьников: ${ Rect.counter }")
        }
    }
}
