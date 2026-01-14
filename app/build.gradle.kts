plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "dev.chu.infos"
    compileSdk = 35

    defaultConfig {
        applicationId = "dev.chu.infos"
        minSdk = 30
        targetSdk = 35
        versionCode = 100005
        versionName = "1.0.5"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.11.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

//    implementation("com.google.auth:google-auth-library-oauth2-http:1.3.0")
//    implementation("com.google.apis:google-api-services-androidpublisher:v3-rev20201007-1.30.10")
//    implementation(group: "com.google.oauth-client", name: "google-oauth-client-java6", version: "1.11.0-beta")
//    implementation(group: "com.google.oauth-client", name: "google-oauth-client-jetty", version: "1.11.0-beta")
}