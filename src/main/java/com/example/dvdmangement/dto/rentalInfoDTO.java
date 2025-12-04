package com.example.dvdmangement.dto;

import lombok.Getter;

public class rentalInfoDTO {
    @Getter
    private final int userId;
    @Getter
    private final String userName;
    @Getter
    private final int userAge;
    @Getter
    private final int Id;
    @Getter
    private final String title;
    @Getter
    private final String rentalDate;
    @Getter
    private final int movieId;

    public rentalInfoDTO(int userId, String userName, int userAge,int Id, String title, String rentalDate, int movieId) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.Id = Id;
        this.title = title;
        this.rentalDate = rentalDate;
        this.movieId = movieId;
    }

}
