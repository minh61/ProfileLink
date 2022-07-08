package com.ghtk.ProfileLink.model.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ResponseData {
    private Boolean success;
    private String message;
    private List<?> data;
}
