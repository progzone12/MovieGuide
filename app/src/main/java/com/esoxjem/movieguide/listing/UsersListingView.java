package com.esoxjem.movieguide.listing;

import com.esoxjem.movieguide.User;

import java.util.List;

interface UsersListingView {

    void showUsers(List<User> users);
    void loadingStarted();
    void loadingFailed(String errorMessage);
    void onUserClicked(User user);
}
