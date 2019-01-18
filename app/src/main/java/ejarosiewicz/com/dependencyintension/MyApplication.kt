package ejarosiewicz.com.dependencyintension

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import ejarosiewicz.com.di.DaggerAppComponent

class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        appComponent.inject(this)
        return appComponent
    }
}