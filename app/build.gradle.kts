plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pas_genap_absen5_absen11"
<<<<<<< HEAD
    compileSdk = 34
=======
    compileSdk = 35
>>>>>>> origin/master

    defaultConfig {
        applicationId = "com.example.pas_genap_absen5_absen11"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
<<<<<<< HEAD

=======
    implementation ("com.google.android.material:material:1.11.0")
>>>>>>> origin/master
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}