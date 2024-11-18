plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.fruitlist"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fruitlist"
        minSdk = 28
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    dependencies {
        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.lifecycle.runtime.ktx)
        implementation(libs.androidx.activity.compose)
        implementation("androidx.compose.ui:ui:1.5.0")
        implementation("androidx.compose.ui:ui-tooling:1.5.0")
        implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")
        implementation("androidx.compose.foundation:foundation:1.5.0")
        implementation("androidx.compose.material3:material3:1.1.1")
        implementation("androidx.compose.material:material-icons-extended:1.5.0")
        implementation("androidx.navigation:navigation-compose:2.7.2")
        implementation("io.coil-kt:coil-compose:2.2.2")

        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)
        androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.5.0")
        debugImplementation("androidx.compose.ui:ui-tooling:1.5.0")
        debugImplementation("androidx.compose.ui:ui-test-manifest:1.5.0")
    }

}