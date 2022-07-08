package com.ghtk.ProfileLink.controller;

import com.ghtk.ProfileLink.service.ProfileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("api/v1.0/profile")
public class ProfileController {

    @Autowired
    private ProfileServiceImpl profileService;

    @GetMapping("/{profileName}/{url}")
    public RedirectView handle(@PathVariable String profileName , @PathVariable String url) {
        url = "https://google.com";
        return new RedirectView(url);
    }

    @GetMapping("/{username}")
    public ResponseEntity getProfile(@PathVariable String username) {
        return ResponseEntity.ok(profileService.getUserProfileByUsername(username));
    }
}
