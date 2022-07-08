package com.ghtk.ProfileLink.service;

import com.ghtk.ProfileLink.model.reponse.ResponseData;

public interface ProfileService {

//    ResponseData getUserProfileByProfileName(String profileName);

    ResponseData getUserProfileByUsername(String username);
}
