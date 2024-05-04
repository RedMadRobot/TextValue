plugins {
    convention.library.android
}

description = "Compose extensions for TextValue"

dependencies {
    api(projects.textvalue)
    api(libs.androidx.compose.ui)
}

android {
    namespace = "$group.compose"

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}
