# ManagerSharedPreferences
SharedPreferences in Android

```Java
public class PrefsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Prefs class
        new SP.Builder()
        .setContext(this)
        .setMode(ContextWrapper.MODE_PRIVATE)
        .setPrefsName(getPackageName())
        .setUseDefaultSharedPreference(true).build();

    }
}
```

# Usage

After initialization, you can use simple one-line methods to save values to the shared preferences anywhere in your app, such as:

- `SP.putString(key, string)`
- `SP.putLong(key, long)`
- `SP.putBoolean(key, boolean)`

Other

- `SP.getString(key, string)`
- `SP.getLong(key, long)`
- `SP.getBoolean(key, boolean)`

- `SP.getString(key)`
- `SP.getLong(key)`
- `SP.getBoolean(key)`


https://jitpack.io

Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
    compile 'com.github.rogerp91:ManagerSharedPreferences:{latest version}'
}
```

### Based
  - [EasyPreferences](https://github.com/Pixplicity/EasyPreferences)

### License
    Copyright 2016 Roger Patiño

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
