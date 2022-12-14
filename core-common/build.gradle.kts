plugins {
    id("codewithdk.android.library")
    id("codewithdk.android.library.jacoco")
    kotlin("kapt")
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    //testImplementation(project(":core-testing"))
}