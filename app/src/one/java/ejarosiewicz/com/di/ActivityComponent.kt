package ejarosiewicz.com.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ejarosiewicz.com.dependencyintension.MainActivity

@Module
abstract class ActivityComponent {

    @ContributesAndroidInjector
    abstract fun bindsMainActivity(): MainActivity
}