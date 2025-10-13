plugins {
    alias(libs.plugins.kotlin.compose)
    convention.library.android
}

description = "Compose extensions for TextValue"

dependencies {
    api(projects.textvalue)
    api(libs.androidx.compose.ui)
}

android {
    namespace = "$group.compose"
}
