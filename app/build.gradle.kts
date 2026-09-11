plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.kusuu.pos"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kusuu.pos"
        minSdk = 23
        targetSdk = 35
        versionCode = 2072
        versionName = "19.7.2"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

kotlin {
    jvmToolchain(17)
}
