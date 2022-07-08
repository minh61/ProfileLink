package com.ghtk.ProfileLink.repository;

import com.ghtk.ProfileLink.model.entity.ClickProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
@Repository
public interface ClickProfileRepository extends JpaRepository<ClickProfileEntity , Long> {

    @Query(value = "SELECT * FROM click_profile WHERE date = :date AND profile_id = :profileId", nativeQuery = true)
    ClickProfileEntity getClickCountByDate(@Param("date") LocalDate date , @Param("profileId") Long profileId);

}
