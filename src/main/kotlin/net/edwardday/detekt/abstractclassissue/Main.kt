package net.edwardday.detekt.abstractclassissue

abstract class Foo {
    abstract val i: Int
    val j = 1
}

abstract class Bar : Foo()
