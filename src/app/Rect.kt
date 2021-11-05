package app

import java.util.*

open class Rect {
    var w = 10.0
    var h = 10.0

    constructor(w: Double, h: Double) {
        this.w = w
        this.h = h
    }

    constructor(w: Double) {
        this.w = w
    }

    constructor() {}

    constructor(w: Int, h: Int) {
        this.w = w.toDouble()
        this.h = h.toDouble()
    }

    constructor(w: Int) {
        this.w = w.toDouble()
    }

    constructor(w: Float, h: Float) {
        this.w = w.toDouble()
        this.h = h.toDouble()
    }

    constructor(w: Float) {
        this.w = w.toDouble()
    }

    fun per(): Double = 2 * w + 2 * h

    fun area(): Double = w * h

    companion object {
        fun create(text: String?, sc: Scanner): Rect {
            text?.let { println(text) }

            println("Введите длину прямоугольника: ")
            val w = sc.nextDouble()
            println("Введите высоту прямоугольника: ")
            val h = sc.nextDouble()

            return Rect(w, h)
        }

        fun contains(rect1: Rect, rect2: Rect): Boolean = rect1.w <= rect2.w && rect1.h <= rect2.h
    }
}