# Movies App

## Демонстрация
![Movie Video](/app/src/main/res/drawable/movie_video.gif)

![Film Info Dark](/app/src/main/res/drawable/film_info_dark.jpg)

![Film Info Lite](/app/src/main/res/drawable/film_info_lite.jpg)

![Popular Dark](/app/src/main/res/drawable/popular_dark.jpg)

![Popular Lite](/app/src/main/res/drawable/popular_lite.jpg)

![Upcoming](/app/src/main/res/drawable/upcoming_dark.jpg)

## Описание
Приложение для просмотра информации о фильмах с использованием API The Movie Database (TMDB).

## Структура проекта
```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/moviesapp/
│   │   │   ├── details/
│   │   │   │   └── presentation/ - Экраны детального просмотра фильма
│   │   │   ├── movieList/
│   │   │   │   ├── data/ - Слой данных (сетевой, локальный, мапперы)
│   │   │   │   ├── domain/ - Бизнес-логика
│   │   │   │   └── presentation/ - Экраны списка фильмов
│   │   │   └── ui/theme/ - Темизация приложения
│   │   └── res/ - Ресурсы приложения
└── build.gradle.kts - Конфигурация модуля
```

## Технологии
- **Язык программирования:** Kotlin
- **Платформа:** Android
- **UI Toolkit:** Jetpack Compose
- **DI:** Hilt
- **Сетевые запросы:** Retrofit
- **Локальное хранилище:** Room
- **Загрузка изображений:** Coil
- **Навигация:** Jetpack Navigation

## Архитектура
- **Clean Architecture** с разделением на слои: Presentation, Domain, Data
- **MVVM** паттерн для организации UI-логики
- **Repository** паттерн для управления источниками данных

## Настройка
Для работы приложения требуется указать API-ключ TMDB в файле `local.properties`:
```
MOVIE_API_KEY=your_api_key_here
```