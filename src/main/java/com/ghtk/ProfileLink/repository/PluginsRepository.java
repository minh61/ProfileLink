package com.ghtk.ProfileLink.repository;

import com.ghtk.ProfileLink.model.dto.PluginsDto;
import com.ghtk.ProfileLink.model.entity.PluginsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PluginsRepository extends JpaRepository<PluginsEntity , Long> {

    @Query(value = "SELECT * FROM plugins WHERE profile_id = :profileId",nativeQuery = true)
    List<PluginsEntity> getPluginsByProfileId(@Param("profileId") Long profileId);
}
