package com.ghtk.ProfileLink.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@Table(name = "social")
@NoArgsConstructor
@AllArgsConstructor
public class SocialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileEntity profileId;
}
