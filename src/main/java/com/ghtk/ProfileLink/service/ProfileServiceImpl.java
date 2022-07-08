package com.ghtk.ProfileLink.service;

import com.ghtk.ProfileLink.daos.UserProfileDao;
import com.ghtk.ProfileLink.model.dto.PluginsDto;
import com.ghtk.ProfileLink.model.dto.ProfileDto;
import com.ghtk.ProfileLink.model.dto.SocialDto;
import com.ghtk.ProfileLink.model.entity.*;
import com.ghtk.ProfileLink.model.exception.NotFoundException;
import com.ghtk.ProfileLink.model.reponse.ResponseData;
import com.ghtk.ProfileLink.repository.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{
    @Autowired
    private ProfileRepository profileRepository;


    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ClickProfileRepository clickProfileRepository;

    @Autowired
    private SocialServiceImpl socialService;

    @Autowired
    private PluginsServiceImpl pluginsService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseData getUserProfileByUsername(String username) {
        UserEntity userEntity = userService.getUserByUsername(username);
        ProfileEntity profileEntity = profileRepository.getProfileByUserId(userEntity.getId());
        Long profileId = profileEntity.getId();
        LocalDate date = LocalDate.now();

        ClickProfileEntity clickProfileEntity = clickProfileRepository.getClickCountByDate(date , profileId);
        if(clickProfileEntity == null) {
            ClickProfileEntity newClick = new ClickProfileEntity(null , 1 , date , profileId);
            clickProfileRepository.save(newClick);
        }
        else {
            ClickProfileEntity newClick = new ClickProfileEntity(clickProfileEntity.getId(),
                    clickProfileEntity.getClickCount() + 1 ,
                    date,
                    profileId);
            clickProfileRepository.save(newClick);
        }

        List<SocialEntity> listSocial = socialService.getSocialByProfileId(profileId);
        List<SocialDto> listSocialDto = listSocial.stream().map(s -> modelMapper.map(s,SocialDto.class)).collect(Collectors.toList());

        List<PluginsEntity> listPlugins = pluginsService.getPluginsByProfileId(profileId);
        List<PluginsDto> listPluginsDto = listPlugins.stream().map(p -> modelMapper.map(p , PluginsDto.class)).collect(Collectors.toList());

        ProfileDto profileDto = new ProfileDto(username , profileEntity.getName(),profileEntity.getBio(),profileEntity.getImage(), listSocialDto , listPluginsDto );
        ArrayList<ProfileDto> list = new ArrayList<>();
        list.add(profileDto);

        return ResponseData.builder()
                .success(true)
                .message("Thanh cong")
                .data(list)
                .build();
    }


}
