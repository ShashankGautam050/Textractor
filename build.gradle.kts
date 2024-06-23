// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.4" )// Ensure this is compatible with Gradle 8.6
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
    }
}





