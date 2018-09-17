package com.esoxjem.movieguide.listing.sorting;

/**
 * @author arun
 */
public interface SortingDialogPresenter
{
    void setLastSavedOption();

    void onPopularMoviesSelected();

    void onHighestRatedMoviesSelected();

    void onFavoritesSelected();

    void onNewestMoviesSelected();


    void onUsersSelected();

    void setView(SortingDialogView view);

    void destroy();
}
