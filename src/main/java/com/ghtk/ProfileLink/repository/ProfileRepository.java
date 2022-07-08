package com.ghtk.ProfileLink.repository;

import com.ghtk.ProfileLink.model.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity , Long> {

    @Query(value = "SELECT * FROM profile WHERE user_id = :userId",nativeQuery = true)
    ProfileEntity getProfileByUserId(@Param("userId") Long userId) ;

}
