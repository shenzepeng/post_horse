package com.example.post_horse.pojo;

/**
 * @Auther: SualLabel
 * @Date: 2019-04-23 20:31
 * @Description: SualLabel, Write down some description!!!
 */
public class FavoritesQueryVo {
    private Favorites favorites;
    private User user;
    private Company company;

    public Favorites getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorites favorites) {
        this.favorites = favorites;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }


    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "FavoritesQueryVo{" +
                "favorites=" + favorites +
                ", user=" + user +
                ", company=" + company +
                '}';
    }
}
