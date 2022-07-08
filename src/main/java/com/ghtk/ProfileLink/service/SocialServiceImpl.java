package com.ghtk.ProfileLink.service;

import com.ghtk.ProfileLink.model.entity.SocialEntity;
import com.ghtk.ProfileLink.repository.SocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialServiceImpl implements SocialService{

    @Autowired
    private SocialRepository socialRepository;
    public List<SocialEntity> getSocialByProfileId(Long profileId) {
        return socialRepository.getSocialByProfileId(profileId);
    }
}
