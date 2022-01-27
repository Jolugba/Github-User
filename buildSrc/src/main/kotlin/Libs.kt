object Libs {

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_stdlib_version}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx_verstion}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val vectordrawable =
        "androidx.vectordrawable:vectordrawable:${Versions.vectordrawable_version}"
    const val multidex = "com.android.support:multidex:${Versions.multidex_version}"
    const val gradleTools = "com.android.tools.build:gradle:${Versions.buildGradle}"



    // Kotlin
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_stdlib_version}"


    /* ------------------------------ Retrofit & Network  --------------------------------------- */

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor_version}"

    /* ------------------------------------- Timber --------------------------------------------- */
    const val timber: String = "com.jakewharton.timber:timber:${Versions.timber}"


    /* ------------------------------------- Glide --------------------------------------------- */
    const val glide: String = "com.github.bumptech.glide:glide:${Versions.glide}"

    /* ------------------------------------- Test --------------------------------------------- */
    const val junit: String = "junit:junit:" + Versions.junit
    const val mockk: String = "io.mockk:mockk:" + Versions.mockk
    const val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin_version}"
    const val mockito_android = "org.mockito:mockito-android:${Versions.mockito_android_version}"
    const val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext_version}"
    const val expresso_core =
        "androidx.test.espresso:espresso-core:${Versions.expresso_core_version}"


    /* ------------------------------------ DI ---------------------------------------------- */

    const val hilt_android = "com.google.dagger:hilt-android:${Versions.hilt_version}"
    const val hilt_android_compiler =
        "com.google.dagger:hilt-android-compiler:${Versions.hilt_version}"
    const val hilt_navigation_fragment =
        "androidx.hilt:hilt-navigation-fragment:${Versions.hilt_navigation_fragment_version}"
    const val hiltPlugin ="com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt_version}"

    /* ------------------------------------  Paging --------------------------------------------- */

    const val paging = "androidx.paging:paging-runtime:${Versions.paging_version}"
    const val pagingRxJava = "androidx.paging:paging-rxjava3:${Versions.paging_version}"

    /* ------------------------------------  rxJava --------------------------------------------- */
    const val rxJava = "io.reactivex.rxjava3:rxjava:${Versions.rxJava}"
    const val rxKotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxJava}"
   const val  rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxJava}"
   const val rxRetrofitAdapter="com.github.akarnokd:rxjava3-retrofit-adapter:${Versions.rxJava}"

    /* ------------------------------------- Recyclerview--------------------------------------------- */
    const val recyclerview: String = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"

    /* ------------------------------------- Fragments --------------------------------------------- */
   const val fragments = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_VERSION}"
   const val viewModels = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VERSION}"


    /* ------------------------------------- Navigation --------------------------------------------- */
   const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.JETPACK_NAVIGATION_VERSION}"
   const val navigationUi =
        "androidx.navigation:navigation-ui-ktx:${Versions.JETPACK_NAVIGATION_VERSION}"
   const val navigationSafeArgsPlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.JETPACK_NAVIGATION_VERSION}"

    /* ------------------------------------- Room --------------------------------------------- */
  const val roomkt= "androidx.room:room-ktx:${Versions.roomVersion}"
   const val roomRuntime="androidx.room:room-runtime:${Versions.roomVersion}"
   const val roomComplier= "androidx.room:room-compiler:${Versions.roomVersion}"


}
