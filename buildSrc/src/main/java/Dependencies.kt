object CommonDependencies {
    object Versions {
        internal const val androidGradlePlugin = "4.2.1"
        internal const val kotlin = "1.5.20-RC"

        object AndroidSdk {
            const val compile = 30
        }
    }

    object Plugins {
        const val android = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }
}