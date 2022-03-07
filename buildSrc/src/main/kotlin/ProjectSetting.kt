/*
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object ProjectSetting {

    // Project Name
    const val NAME_APP = "Frogo Kick Start Library"
    const val REPOSITORY_NAME = "frogo-kick-start-library"

    const val APP_DOMAIN = "com"
    const val APP_PLAY_CONSOLE = "frogobox"
    const val APP_NAME = "kickstartlibrary"

    const val LIBRARY_NAME_SDK = "frogolibraryname"
    const val LIBRARY_NAME_CORE_SDK = "coresdk"

    const val MODULE_NAME_SDK = "frogolibraryname"
    const val MODULE_NAME_CORE_SDK = "frogocoresdk"

    // ---------------------------------------------------------------------------------------------

    const val VERSION_MAJOR = 0
    const val VERSION_MINOR = 0
    const val VERSION_PATCH = 1

    // ---------------------------------------------------------------------------------------------

    const val PROJECT_MIN_SDK = 21
    const val PROJECT_COMPILE_SDK = 31
    const val PROJECT_TARGET_SDK = PROJECT_COMPILE_SDK

    // ---------------------------------------------------------------------------------------------

    const val GITHUB_KEY_ID = "50381689"
    const val GITHUB_KEY_TOKEN = "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"

    const val BASE_PACAKGE_NAME = "$APP_DOMAIN.$APP_PLAY_CONSOLE"

    const val PROJECT_APP_ID = "$BASE_PACAKGE_NAME.$APP_NAME"
    const val PROJECT_LIB_ID_SDK = "$BASE_PACAKGE_NAME.$LIBRARY_NAME_SDK"
    const val PROJECT_LIB_ID_CORE_SDK = "$BASE_PACAKGE_NAME.$LIBRARY_NAME_CORE_SDK"

    const val PROJECT_VERSION_CODE = (VERSION_MAJOR * 100) + (VERSION_MINOR * 10) + (VERSION_PATCH * 1)
    const val PROJECT_VERSION_NAME = "$VERSION_MAJOR.$VERSION_MINOR.$VERSION_PATCH"

    val NAME_APK = NAME_APP.toLowerCase().replace(" ", "-")

    val NAME_DB = NAME_APP.toLowerCase().replace(" ", "_")
    val DB = "\"$NAME_DB.db\""

    // ---------------------------------------------------------------------------------------------

    const val PLAYSTORE_STORE_FILE = "frogoboxmedia.jks"
    const val PLAYSTORE_STORE_PASSWORD = "amirisback"
    const val PLAYSTORE_KEY_ALIAS = "frogoisback"
    const val PLAYSTORE_KEY_PASSWORD = "amirisback"

}