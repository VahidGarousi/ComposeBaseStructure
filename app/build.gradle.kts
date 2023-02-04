import dev.garousi.composebasestructure.ComposeBaseStructureBuildType
plugins {
    id("gradleconvention.android.application")
    id("gradleconvention.android.application.compose")
    id("gradleconvention.android.hilt")
}

android {
    namespace = "garousi.dev.composebasestructure"
    defaultConfig {
        applicationId = "garousi.dev.composebasestructure"
        minSdk =  21
        targetSdk =  33
        versionCode =  1
        versionName = "0.0.3" // X.Y.Z; X = Major, Y = minor, Z = Patch level

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        val debug by getting {
            applicationIdSuffix = ComposeBaseStructureBuildType.DEBUG.applicationIdSuffix
        }
        val release by getting {
            isMinifyEnabled = true
            applicationIdSuffix = ComposeBaseStructureBuildType.RELEASE.applicationIdSuffix
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(project(":core:design-system"))
    implementation(project(":feature:home"))
    implementation(libs.androidx.lifecycle.runtimeCompose)

}

// androidx.test is forcing JUnit, 4.12. This forces it to use 4.13
configurations.configureEach {
    resolutionStrategy {
        force(libs.junit4)
        // Temporary workaround for https://issuetracker.google.com/174733673
        force("org.objenesis:objenesis:2.6")
    }
}