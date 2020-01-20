package com.maximgoodman.pupapp.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Builder
public class Animal {

    public UUID id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("coloration")
    private String coloration;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("addressFound")
    private String addressFound;

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("active")
    private boolean active = true;

    public Animal(){
        UUID id = UUID.randomUUID();
        this.id=id;
    }

}
