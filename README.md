# Android Easy Version
This is a shortcut code to simplify for checking what Android version is used in the devices.

## Installation

### settings.gradle.kts
```gradle
dependencyResolutionManagement {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### build.gradle (Module :app)
```gradle
implementation("com.github.eriffanani:easy-version:1.0.1")
```

### build.gradle (Module :app) For Kotlin
```gradle
implementation("com.github.eriffanani:easy-version-ktx:1.0.1")
```

## How to use
* Java
```java
if (AndroidVersion.Tiramisu13()) {
  // TODO ACTION  
} else if (AndroidVersion.Snow12()) {
  // TODO ACTION
} else {
  // TODO ACTION
}
```
```java
if (AndroidVersion.Snow12AndUp()) {
  // TODO ACTION  
} else if (AndroidVersion.QuinceTart10AndDown()){
  // TODO ACTION  
}
```

* Kotlin
```kotlin
AndroidVersion.`Tiramisu-13` {
  // TODO ACTION
} ?: AndroidVersion.`Snow-12` {
  // TODO ACTION
}               
```
```kotlin
val value = AndroidVersion.`RedVelvet-11`.andUp { 
  "My value 11"
} ?: AndroidVersion.`QuinceTart-10`.andDown {
  "My value 10"
} ?: {
  "My other value"
}
```

### License
```license
Copyright [2024] [Mukhammad Erif Fanani]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
