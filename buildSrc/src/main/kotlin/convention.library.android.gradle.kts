plugins {
    id("com.redmadrobot.android-library")
    id("convention.publishing")
    id("convention.detekt")
}

redmadrobot {
    android.minSdk = 19
    android.compileSdk = "35"
}
