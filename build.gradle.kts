buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // Android
        classpath(CommonDependencies.Plugins.android)

        // Kotlin
        classpath(CommonDependencies.Plugins.kotlin)
    }
}

subprojects {
    repositories {
        google()
        mavenCentral()
    }
}
