package ejarosiewicz.com.dependencyintension

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import ejarosiewicz.com.dependencyintension.printer.AnotherPrinter
import ejarosiewicz.com.dependencyintension.printer.MyPrinter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var myPrinter: MyPrinter
    @Inject
    lateinit var anotherPrinter: AnotherPrinter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        printOne.text = myPrinter.printMe()
        printTwo.text = anotherPrinter.printMeToo()
    }
}
