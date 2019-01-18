package ejarosiewicz.com.dependencyintension.printer

import javax.inject.Inject

class DefaultAnotherPrinter @Inject constructor() : AnotherPrinter {

    override fun printMeToo(): String = "I'm default another printer!"
}