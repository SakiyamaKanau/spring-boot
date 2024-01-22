// DemoController.java
package com.example.demo.controller;

import java.util.List;
import com.example.demo.entity.SwitchGame;
import com.example.demo.mapper.SwitchGamesMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @Autowired
    private SwitchGamesMapper switchGamesMapper;

    @GetMapping("/")
    public String showGames(Model model) {
        List<SwitchGame> games = switchGamesMapper.findAll();
        model.addAttribute("games", games);
        return "games";
    }
}