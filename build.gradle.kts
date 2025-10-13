plugins {
    alias(libs.plugins.infrastructure.detekt)
    alias(libs.plugins.versions)
    alias(libs.plugins.kotlin.compose) apply false
    convention.detekt
}
