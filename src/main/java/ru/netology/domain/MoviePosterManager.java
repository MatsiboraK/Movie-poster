package ru.netology.domain;

public class MoviePosterManager {
    private MoviePoster[] posters = new MoviePoster[0];
    private int limit = 5;

    public MoviePosterManager() {
    }

    public MoviePosterManager(int limit) {
        this.limit = limit;
    }

    public void add(MoviePoster poster) {
        MoviePoster[] tmp = new MoviePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public MoviePoster[] findAll() {
        return posters;
    }

    public MoviePoster[] findLast() {
        int resultLength = (posters.length < limit) ? posters.length : limit;

        MoviePoster[] result = new MoviePoster[resultLength];
        for (int i = (result.length - 1) ; i >= 0; i--) {
            result[i] = posters[posters.length - i - 1];
        }
        return result;

//       MoviePoster[] result = new MoviePoster[resultLength];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = posters[posters.length - 1 - i];
//        }
//        return result;
    }
}
