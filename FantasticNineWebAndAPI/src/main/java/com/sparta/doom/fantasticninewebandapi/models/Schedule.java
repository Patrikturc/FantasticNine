package com.sparta.doom.fantasticninewebandapi.models;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Document(collection = "schedules")
public class Schedule {
    @Id
    private String id;
    //I'm currently trying to mock these, so i can test stuff;
    //these fields should actually just be Ids in the database
    @NotNull
    @DBRef
    private Theatre theatre;
    @NotNull
    @DBRef
    private Movie movie;
    @NotNull
    @Future
    private LocalDateTime startTime;

}
