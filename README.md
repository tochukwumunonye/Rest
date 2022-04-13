![Android Build](https://github.com/Ezike/StarWarsSearch/workflows/Android%20Build/badge.svg)

# Cookad App

 Features
* Clean Architecture with MVI (Uni-directional data flow)
* Kotlin Coroutines with Flow
* Dagger Hilt
* Kotlin Gradle DSL
* GitHub actions for CI

Hi 👋🏼👋🏼👋🏼Before taking any coding and architecture decisions, I first had to come up with an idea of how I wanted the app to look, and the kind of experience I wanted users to have when using the app. This also guided my decisions on what tools were best suited to bring about a good user experience. Some decisions required for the features were:
Thanks for checking out my project. For the rest of this document, I will be explaining the reasons for the technical decisions I made for this case study, the problems I faced, and what I learnt from them.

## Table of content

- [Prerequisite](#prerequisite)
- [Preview](#preview)
- [Feature](#Feature)
- [Design](#Design)
- [Architecture](#architecture)
- [Testing](#testing)
- [Recommendation](#Libraries)
- [Extras](#Extras)

## Prerequisite
- Android Studio Arctic Fox | 2020.3.1
- Gradle version 7.0.2
- MinSdk 21
- TargetSdk 31


## Design
