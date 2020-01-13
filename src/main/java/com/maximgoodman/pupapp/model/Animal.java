package com.maximgoodman.pupapp.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Animal {

    private UUID id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("coloration")
    private String coloration;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("addressFound")
    private String addressFound;



}
