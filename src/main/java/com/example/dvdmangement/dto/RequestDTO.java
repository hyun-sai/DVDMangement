package com.example.dvdmangement.dto;

public class RequestDTO {
    private String userName;
    private Integer user_Id;
    private Integer userAge;
    private String movieTitle;
    private Integer movieId;

    public RequestDTO() {}

    public RequestDTO(String userName,Integer user_Id, Integer userAge, String movieTitle, Integer movieId) {
        this.userName = userName;
        this.userAge = userAge;
        this.movieTitle = movieTitle;
        this.movieId = movieId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserAge() {
        return userAge;
    }
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public Integer getMovieId() {
        return movieId;
    }
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
    public Integer getUser_Id() {
        return user_Id;
    }
    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }
}


