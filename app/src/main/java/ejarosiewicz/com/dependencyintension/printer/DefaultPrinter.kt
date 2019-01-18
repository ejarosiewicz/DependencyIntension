package ejarosiewicz.com.dependencyintension.printer

import javax.inject.Inject

class DefaultPrinter @Inject constructor() : MyPrinter {

    override fun printMe(): String = "I'm default printer!"
}