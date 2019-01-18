package ejarosiewicz.com.printer

import ejarosiewicz.com.dependencyintension.printer.AnotherPrinter

class AnotherOnePrinter: AnotherPrinter {

    override fun printMeToo(): String = "I'm another one printer!"
}