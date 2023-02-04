plugins {
    id("gradleconvention.android.library")
    id("gradleconvention.android.library.compose")
}

android {
    namespace = "garousi.dev.design_system"
}

dependencies {
    api(libs.androidx.core.ktx)
    api(libs.androidx.compose.bom)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.activity.compose)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.lifecycle.livedata.ktx)
    api(libs.androidx.compose.material.iconsExtended)
    testApi(libs.junit4)
    debugApi(libs.androidx.compose.ui.test)
    debugApi(libs.androidx.compose.ui.tooling)
    debugApi(libs.androidx.compose.ui.testManifest)
    androidTestApi(libs.androidx.test.ext)
    androidTestApi(libs.androidx.test.espresso.core)
    androidTestImplementation(libs.androidx.compose.bom)
}