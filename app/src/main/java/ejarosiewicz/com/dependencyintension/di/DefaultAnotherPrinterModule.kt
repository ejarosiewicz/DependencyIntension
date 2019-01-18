package ejarosiewicz.com.dependencyintension.di

import dagger.Binds
import dagger.Module
import ejarosiewicz.com.dependencyintension.printer.AnotherPrinter
import ejarosiewicz.com.dependencyintension.printer.DefaultAnotherPrinter

@Module
abstract class DefaultAnotherPrinterModule {

    @Binds
    abstract fun bindsAnotherPrinter(defaultAnotherPrinter: DefaultAnotherPrinter): AnotherPrinter
}