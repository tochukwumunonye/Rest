![Android Build](https://github.com/Ezike/StarWarsSearch/workflows/Android%20Build/badge.svg)

# Cookad App


Hi 👋🏼👋🏼👋🏼
Thanks for checking out my project. For the rest of this document, I will be explaining the reasons for the technical decisions I made for this case study, the problems I faced, and what I learnt from them.

## Table of content

- [Prerequisite](#prerequisite)
- [Preview](#preview)
- [Feature](#feature)
- [Design](#design)
- [Architecture](#architecture)
- [Testing](#testing)
- [Improvement](#improvement)
- [Extras](#Extras)

## Prerequisite
- Android Studio Arctic Fox | 2020.3.1
- Gradle version 7.0.2
- MinSdk 21
- TargetSdk 31

## Preview
<img src="https://user-images.githubusercontent.com/61085272/163265305-f9ca1ec0-508b-43dc-8960-3978d9dceba6.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/163265317-7b8fc1e2-6d07-48e1-b70b-b6bada74487a.png" width="33%" /> 


<img src="https://user-images.githubusercontent.com/61085272/163267998-c4710d0c-86e4-49d8-bd6c-334d71eb5d08.png" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/163268011-1700510f-a05a-4ce8-9ecf-e2573a289bbf.png" width="33%" /> 


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



## Design
Before taking any coding and architecture decisions, I first  come up with an idea of how I wanted the app to look, and the kind of experience I wanted users to have when using the app. This also guided my decisions on what tools were best suited to bring about a good user experience. Some decisions required for the features were:
- Two screens with functionality to navigate between themselves.
- Layouts should be rendered in less than 60 frames per second which means leveraging on constraint layouts
- An architecture which will ensure separation of concerns. Preventing memory leaks, threading issues while also testable and scalable
- A form of storage which will serve as a single source of  truth, since when collections are liked  or unliked, they should reflect in both screens. This will be discussed later on.

## Architecture

The application follows clean architecture because of the benefits it brings to software which includes scalability, maintainability and testability.
It enforces separation of concerns and dependency inversion, where higher and lower level layers all depend on abstractions. In the project, the layers are separated into different layers namely:

- Data Layer
- Presentation

### Data Layer
The data layer contains application data and business logic. The business logic is what gives value to your app—it's made of real-world business rules that determine how application data must be created, stored, and changed.

#### Remote layer
The remote later relies on Retrofit library to fetch data from cookpad API.  The remote layer contains its own data class called collectionDTO which maps to different data classes within out application. Here I added` @Transient var isLiked: Boolean = false` to the enity class since I needed to monitor if a collection is liked or not.

#### Cache Layer
In android the could persist data in several ways;
- Shared preference: SharedPreferences is a key/value store where you can save a data under certain key. I made the desision not to store data with shared preference because it is made for store private primitive data types: booleans, floats, ints, longs, and strings, not arrays or complex objects.
- Room Database: This served as a single source of truth because it always provided consistent up-to-date and correct information of collections that were liked or not. Room is suitable for large data sets and I made use of `Type Converters` to convert arraylist of urls to a string. I accessed the room database through a Data Access Object class.


#### Repository
My repository was used to expose data to the rest of the application and also reolving conflicts. Helped in Abstracting sources of data from the rest of the app.
- It was responsible for fetching and inserting favourite images.
- Made network calls for ne collection with the API
- Provided both favorite and non favorite collections to the main screenn
<img src="https://developer.android.com/topic/libraries/architecture/images/final-architecture.png" width="40%" />

### Presentation
The UI/Presentation layer is the pipeline that converts application data changes to a form that the UI can present and then displays it. I used a  pattern where state of the application flows down and events flow up called Unidirectional data flow. Here the view model holds and exposes the state in an observable data holder called `Stateflow`. This ensures quick retoration of state after configuration changes. Alos the UI can react to any changes made in the state without having to manually pull data directly from the ViewModel.

The UI notifies the ViewModel of user events.
The ViewModel handles the user actions and updates the state.
The updated state is fed back to the UI to render.
The above is repeated for any event that causes a mutation of state.



## Testing
Testing is done with Junit4 testing framework for assertions and Mockito for mocking classes. Each  layer has its own test. 
Viewmodel tests verify that each call to repository produces the correct view state.
Repository Test verify each interaction with database or server returns the expected result.


## Improvement
- Rather than a generic response for an error,  the real cause should be provided to the user for example no network connectivity.
- Paging Library should be used for pagination to allow the app use both network bandwidth and system resources more efficiently


## - Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [StateFlows](https://developer.android.com/kotlin/flow) -  Flow APIs that enable flows to optimally emit state updates and emit values to multiple consumers.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [OkHttp](http://square.github.io/okhttp/) - HTTP client that's efficient by default: HTTP/2 support allows all requests to the same host to share a socket
- [Glide](https://github.com/bumptech/glide) - image loading framework for Android
- [Gson](https://github.com/google/gson) - used to convert Java Objects into their JSON representation and vice versa.
- [Mockito](http://site.mockito.org/) - Most popular mocking framework for Java/kotlin.
