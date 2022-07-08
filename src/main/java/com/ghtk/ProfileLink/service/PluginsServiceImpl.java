package com.ghtk.ProfileLink.service;

import com.ghtk.ProfileLink.model.entity.PluginsEntity;
import com.ghtk.ProfileLink.model.entity.SocialEntity;
import com.ghtk.ProfileLink.repository.PluginsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PluginsServiceImpl implements PluginsService{
    @Autowired
    private PluginsRepository pluginsRepository;

    public List<PluginsEntity> getPluginsByProfileId(Long profileId) {
        return pluginsRepository.getPluginsByProfileId(profileId);
    }
}
