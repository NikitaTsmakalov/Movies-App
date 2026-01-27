package com.example.moviesapp.movieList.util

sealed class Screens(val route: String) {
    object Home: Screens("main")
    object PopularMovieList: Screens("popularMovie")
    object UpComingMoviesList: Screens("upcomingMovies")
    object Details: Screens("details")
}