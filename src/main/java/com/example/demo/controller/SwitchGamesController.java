package com.example.demo.controller;

import com.example.demo.entity.SwitchGame;
import com.example.demo.mapper.SwitchGamesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class SwitchGamesController {

    @Autowired
    private SwitchGamesMapper switchGamesMapper;

    @GetMapping("/games")
    public String showGames(Model model) {
        List<SwitchGame> games = switchGamesMapper.findAll();
        model.addAttribute("games", games);
        return "games";
    }
}
