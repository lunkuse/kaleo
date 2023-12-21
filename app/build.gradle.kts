plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.kaleo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kaleo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")

    //    material design
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.navigation:navigation-fragment:2.6.0")
    implementation("androidx.navigation:navigation-ui:2.6.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0")
//    glide
    implementation("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.11.0")

//    material design
//    implementation("com.google.android.material:material:1.2.1")

//    animatoo dependency
//    implementation("com.github.mohammadatif:Animatoo:master")
    implementation("com.github.AtifSayings:Animatoo:1.0.1")
//    country code
    implementation("com.hbb20:ccp:2.5.1")
//    retrofit
    implementation("com.squareup.retrofit2:retrofit:2..9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation("com.mcxiaoke.volley:library:1.0.19")
    implementation ("commons-validator:commons-validator:1.7")
    implementation("com.google.android.gms:play-services-maps:17.0.1")
    implementation("com.google.android.gms:play-services-location:17.1.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.gms:play-services-places:17.0.0")
    implementation("de.hdodenhof:circleimageview:1.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



}