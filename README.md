Minimal reproducer for https://youtrack.jetbrains.com/issue/KT-47424

Calling `./gradlew linkCommonDebugFrameworkIos` succeeds on Kotlin 1.4.32, but leads to a `java.lang.StackOverflowError` on Kotlin 1.5.0, 1.5.10, and 1.5.20.
