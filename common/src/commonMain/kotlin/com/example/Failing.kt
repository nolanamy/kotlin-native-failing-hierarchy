package com.example

interface A<T>

class B<T> {
    init {
        mutableListOf<A<out T>>()
            .sortWith { _, _ -> 1 }
    }
}
