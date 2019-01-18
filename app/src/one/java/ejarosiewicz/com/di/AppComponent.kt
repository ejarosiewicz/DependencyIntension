package ejarosiewicz.com.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import ejarosiewicz.com.dependencyintension.MyApplication
import ejarosiewicz.com.dependencyintension.di.DefaultAnotherPrinterModule
import ejarosiewicz.com.dependencyintension.di.DefaultPrinterModule


@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityComponent::class,
        DefaultPrinterModule::class,
        DefaultAnotherPrinterModule::class
    ]
)
interface AppComponent: AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(application: DaggerApplication)

    fun inject(myApplication: MyApplication)
}