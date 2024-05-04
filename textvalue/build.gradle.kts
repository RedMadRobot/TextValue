plugins {
    convention.library.android
    id("kotlin-parcelize")
}

description = "TextValue is an abstraction over Android text"

android {
    namespace = "$group"
}

dependencies {
    api(kotlin("stdlib"))
    api(libs.androidx.annotation)
    compileOnly(libs.androidx.compose.runtime)
}
