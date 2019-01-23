package ejarosiewicz.com.codegen.processor

import java.io.File
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedAnnotationTypes
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

@SupportedAnnotationTypes("ejarosiewicz.com.processor.ComponentSource")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
class MyProcessor : AbstractProcessor() {

    override fun process(set: Set<TypeElement>, env: RoundEnvironment): Boolean {
        for (annotation in set) {
            generateClass("Hello")
        }
        return true
    }


    private fun generateClass(className: String){
        val fileName = "Generated_$className"
        val fileContent = "class Generated_$className{}"

        val kaptKotlinGeneratedDir = processingEnv.options[KAPT_KOTLIN_GENERATED_OPTION_NAME]
        val file = File(kaptKotlinGeneratedDir, "$fileName.kt")

        file.createNewFile()
    }

    companion object {
        const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"
    }
}
