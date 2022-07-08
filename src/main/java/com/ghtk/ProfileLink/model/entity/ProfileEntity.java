package com.ghtk.ProfileLink.model.entity;

import lombok.*;
import org.apache.catalina.mapper.Mapper;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "profile")
@NoArgsConstructor
@AllArgsConstructor
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    private String bio;
    private String image;
    private Long userId;

    @OneToMany(mappedBy = "profileId")
    private List<SocialEntity> socialEntityList;

    @OneToMany(mappedBy = "profileId")
    private List<PluginsEntity> pluginsEntityList;
}
