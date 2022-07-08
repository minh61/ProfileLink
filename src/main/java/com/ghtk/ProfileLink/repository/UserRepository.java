package com.ghtk.ProfileLink.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ghtk.ProfileLink.model.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<UserEntity, Long>{

        UserEntity findByUsername(String username);

}
