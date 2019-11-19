# MultiModuleDaggerIncrementalKapt

Note the library module contains a class `Foo`, and the app module contains a class `Bar` which subclasses `Foo`. When built, Dagger will generate a `Foo_MembersInjector` file, which has only `Foo` as an originating element, but will not be able to processed incrementally.
