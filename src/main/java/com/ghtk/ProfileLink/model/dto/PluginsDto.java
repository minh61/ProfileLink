package com.ghtk.ProfileLink.model.dto;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PluginsDto implements Serializable {
    private String title;
    private String url;
    private String image;
}
