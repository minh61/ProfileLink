package com.ghtk.ProfileLink.repository;

import com.ghtk.ProfileLink.model.dto.SocialDto;
import com.ghtk.ProfileLink.model.entity.SocialEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialRepository extends JpaRepository<SocialEntity, Long> {
    @Query(value = "SELECT * FROM social WHERE profile_id = :profileId",nativeQuery = true)
    List<SocialEntity> getSocialByProfileId(@Param("profileId") Long profileId);
}
