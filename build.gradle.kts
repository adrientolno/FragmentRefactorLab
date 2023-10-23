// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

    dependencies {
        val fragment_version = "1.6.1"

        // Kotlin
        implementation("androidx.fragment:fragment-ktx:$fragment_version")
    }


fun implementation(s: String) {

}
