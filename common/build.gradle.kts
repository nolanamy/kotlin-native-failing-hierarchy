import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

version = "0.0.1"

android {
    compileSdkVersion(CommonDependencies.Versions.AndroidSdk.compile)
}

kotlin {
    android()

    targets {
        val iOSTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
                if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
                    ::iosArm64
                else
                    ::iosX64

        iOSTarget("ios") {
            binaries {
                framework("common")
            }
        }
    }
}
