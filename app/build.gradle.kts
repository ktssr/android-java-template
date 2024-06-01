plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.ktssr.myapplication"
    compileSdk = 34

    defaultConfig {
        minSdk = 29
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.22"))
    implementation(libs.appcompat)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
}