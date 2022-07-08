package com.ghtk.ProfileLink.daos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserProfileDao {
    private final EntityManager entityManager;

//
//    public List<UserProfileDto> getUserProfile(Integer userId) {
//        Query query = null;
//        try {
//            String str = "SELECT p.name AS profileName, " +
//                         "p.bio AS profileBio, " +
//                         "p.image AS profileImage, " +
//                         "s.name AS socialName, " +
//                         "s.url AS socialUrl, " +
//                         "pl.title AS pluginsTitle, " +
//                         "pl.url AS pluginsUrl, " +
//                         "pl.image AS pluginsImage " +
//                         "FROM ((profile p " +
//                         "INNER JOIN social s ON s.profile_id = p.id) " +
//                         "INNER JOIN plugins pl ON pl.profile_id = p.id)";
//
//            query = entityManager.createNativeQuery(str,"UserProfileDto");
//        } catch (NullPointerException ex){
//            ex.printStackTrace();
//        }
//        return query.getResultList();
//    }
//
//    public List<UserProfileDto> getUserProfileByProfileName(String profileId) {
//        StringBuilder builder = new StringBuilder("SELECT " +
//                "p.name AS profileName, " +
//                "p.bio AS profileBio, " +
//                "p.image AS profileImage, " +
//                "s.name AS socialName, " +
//                "s.url AS socialUrl, " +
//                "pl.title AS pluginsTitle, " +
//                "pl.url AS pluginsUrl, " +
//                "pl.image AS pluginsImage " +
//                "FROM ((profile p " +
//                "INNER JOIN social s ON s.profile_id = p.id) " +
//                "INNER JOIN plugins pl ON pl.profile_id = p.id) ");
//        if(StringUtils.hasText(profileId)) {
//            builder.append(" WHERE p.id = :profileId");
//        }
//        Query query = entityManager.createNativeQuery(builder.toString() , "UserProfileDto");
//        if(StringUtils.hasText(profileId)) {
//            Long id = Long.parseLong(profileId);
//            query.setParameter("profileId",id);
//        }
//        return query.getResultList();
//    }
//


}
