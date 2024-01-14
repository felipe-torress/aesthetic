plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

// Dependencies Versions

ext {

}

dependencies {
    val ktxVersion = "1.12.0"
    val appcompatVersion = "1.6.1"
    val materialVersion = "1.11.0"
    val jUnitTestVersion = "4.13.2"
    val androidXJUnitTestVersion = "1.1.5"
    val androidXExpressoTestVersion = "3.5.1"

    implementation("androidx.core:core-ktx:$ktxVersion")
    implementation("androidx.appcompat:appcompat:$appcompatVersion")
    implementation("com.google.android.material:material:$materialVersion")
    testImplementation("junit:junit:$jUnitTestVersion")
    androidTestImplementation("androidx.test.ext:junit:$androidXJUnitTestVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:$androidXExpressoTestVersion")
}