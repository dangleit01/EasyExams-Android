# Error “File google-services.json is missing from module root folder. The Google Services Plugin cannot function without it” [duplicate]
https://stackoverflow.com/questions/33866061/error-file-google-services-json-is-missing-from-module-root-folder-the-google
Goto

https://console.firebase.google.com/

Select your project

On the left menu, click on settings > project settings

Add an app or download the google-services.json file under the Your Apps section.

# SDK location not found. Define location with sdk.dir in the local.properties file or with an ANDROID_HOME environment variable
https://stackoverflow.com/questions/27620262/sdk-location-not-found-define-location-with-sdk-dir-in-the-local-properties-fil
Go to your react-native Project then go to android directory Create a file with following name:
local.properties

Open the file and paste your Android SDK path like below:
For windows users:

sdk.dir=C:\\Users\\UserName\\AppData\\Local\\Android\\sdk
Replace UserName with your pc user name . Also make sure the folder is sdk or Sdk. In my case my computer user name is Zahid so the path look like:

sdk.dir=C:\\Users\\Zahid\\AppData\\Local\\Android\\sdk
For Mac users:

sdk.dir = /Users/USERNAME/Library/Android/sdk
Where USERNAME is your OSX username.

For Linux (Ubuntu) users:

sdk.dir = /home/USERNAME/Android/Sdk


# DECA Quiz App
This is an app that allows users to study deca exams on the go. The file provides source code and shows how to make a simple exam application for Android users. 

<img src="https://image.ibb.co/eUNhs9/Screenshot_1536537835_pixel_very_silver_portrait.png" />

## Authors
* **Srihari Vishnu**
* **JJoe** - *Graph UI* - [GraphView](https://github.com/jjoe64/GraphView)

## License

Copyright [2018] [Srihari Vishnu]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

