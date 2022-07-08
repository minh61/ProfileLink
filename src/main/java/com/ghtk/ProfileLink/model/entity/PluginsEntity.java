package com.ghtk.ProfileLink.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "plugins")
public class PluginsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private String image;
    private Boolean isHeader;
    private Boolean isPlugin;
    private Boolean isHide;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileEntity profileId;
}
