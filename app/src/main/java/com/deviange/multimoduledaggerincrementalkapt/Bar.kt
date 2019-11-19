package com.deviange.multimoduledaggerincrementalkapt

import com.deviange.library.Foo
import dagger.Component
import dagger.Module
import dagger.Provides

class Bar : Foo() {
    fun asdf() {}
}

@Component(modules = [ProvideModule::class])
interface BarComponent {
    fun inject(bar: Bar)
}

@Module
object ProvideModule {
    @Provides
    fun string() = "ASDF"
}