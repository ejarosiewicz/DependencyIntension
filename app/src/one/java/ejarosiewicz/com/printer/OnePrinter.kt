package ejarosiewicz.com.printer

import ejarosiewicz.com.dependencyintension.printer.MyPrinter

class OnePrinter: MyPrinter {
    override fun printMe(): String = "I'm printer one!"
}