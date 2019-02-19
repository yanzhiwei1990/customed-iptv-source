/*
 * Copyright 2017 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package com.droidlogic.android.media.tv.companionlibrary.utils;

import android.content.SharedPreferences;

/** Constants for the companion library */
public class Constants {

    /**
     * Used for interacting with {@link SharedPreferences}.
     *
     * @hide
     */
    public static final String PREFERENCES_FILE_KEY =
            "com.google.android.media.tv.companionlibrary";
    /**
     * Base key string used to identifying last played ad times for a channel TODO This key will be
     * shared by multiple Sessions (e.g. PIP)
     *
     * @hide
     */
    public static final String SHARED_PREFERENCES_KEY_LAST_CHANNEL_AD_PLAY =
            "last_program_ad_time_ms";
}
