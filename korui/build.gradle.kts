/*
dependencies {
    if (hasAndroid) {
        androidMainApi "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        androidTestImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    }

    //androidMainCompileOnly 'com.google.android:android:4.1.1.4'
    commonMainApi "com.soywiz:korim:$korimVersion"
    commonMainApi project(":korag")
    commonMainApi project(":korag-opengl")
    commonMainApi project(":korev")

    commonTestApi project(":korag")
    commonTestApi project(":korag-opengl")
    commonTestApi project(":korev")

    /////////////////////

    commonMainApi "com.soywiz:klock:$klockVersion"
    commonMainApi "com.soywiz:kmem:$kmemVersion"
    commonMainApi "com.soywiz:kds:$kdsVersion"
    commonMainApi "com.soywiz:korio:$korioVersion"

    commonMainApi "com.soywiz:korma:$kormaVersion"
    commonMainApi "com.soywiz:korim:$korimVersion"

    commonTestApi "com.soywiz:klock:$klockVersion"
    commonTestApi "com.soywiz:kmem:$kmemVersion"
    commonTestApi "com.soywiz:kds:$kdsVersion"
    commonTestApi "com.soywiz:korio:$korioVersion"

    commonTestApi "com.soywiz:korma:$kormaVersion"
    commonTestApi "com.soywiz:korim:$korimVersion"

}

kotlin {
    sourceSets {
        iosMain
        iosTest

        configure([iosX64Main, iosArm32Main, iosArm64Main]) {
            dependsOn iosMain
            dependsOn iosTest
        }
    }
}
*/
