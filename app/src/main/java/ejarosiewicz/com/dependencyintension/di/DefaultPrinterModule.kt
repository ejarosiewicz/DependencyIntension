package ejarosiewicz.com.dependencyintension.di

import dagger.Binds
import dagger.Module
import ejarosiewicz.com.dependencyintension.printer.DefaultPrinter
import ejarosiewicz.com.dependencyintension.printer.MyPrinter

@Module
abstract class DefaultPrinterModule {

    @Binds
    abstract fun bindsMyPrinter(defaultPrinter: DefaultPrinter): MyPrinter
}