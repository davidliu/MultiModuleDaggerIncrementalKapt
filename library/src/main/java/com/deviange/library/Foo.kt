package com.deviange.library

import javax.inject.Inject

open class Foo {
    @Inject
    lateinit var value: String
}