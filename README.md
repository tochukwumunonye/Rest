![Android Build](https://github.com/Ezike/StarWarsSearch/workflows/Android%20Build/badge.svg)

# Cookad App

 Features
* Clean Architecture with MVI (Uni-directional data flow)


Hi 👋🏼👋🏼👋🏼Before taking any coding and architecture decisions, I first had to come up with an idea of how I wanted the app to look, and the kind of experience I wanted users to have when using the app. This also guided my decisions on what tools were best suited to bring about a good user experience. Some decisions required for the features were:
Thanks for checking out my project. For the rest of this document, I will be explaining the reasons for the technical decisions I made for this case study, the problems I faced, and what I learnt from them.

## Table of content

- [Prerequisite](#prerequisite)
- [Preview](#preview)
- [Feature](#feature)
- [Design](#design and thought process)
- [Architecture](#architecture)
- [Testing](#testing)
- [Recommendation](#Libraries)
- [Extras](#Extras)

## Prerequisite
- Android Studio Arctic Fox | 2020.3.1
- Gradle version 7.0.2
- MinSdk 21
- TargetSdk 31

## Preview
<img src="https://user-images.githubusercontent.com/61085272/163265305-f9ca1ec0-508b-43dc-8960-3978d9dceba6.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/163265317-7b8fc1e2-6d07-48e1-b70b-b6bada74487a.png" width="33%" /> 



## Feature


#### Collections List Feature

```
In the recipe collection card
When the user taps the favorite button
Then collection is added to the favorite list
And the favorite button icon indicates that the collection is a favorite
```

```
In recipe collection card for a favorite collection
When the user taps the favorite button
Then collection is be removed from the favorite list
And the favorite button icon indicates that this collection is not a favorite
```

#### Favorites List

```
When the user views their favorites
Then a list of favorite collections is presented
```

```
In the recipe collection card
When the user taps the favorite button in the favorite list
Then the recipe collection is be removed from the favorite list
```



## Design and Thought Process
