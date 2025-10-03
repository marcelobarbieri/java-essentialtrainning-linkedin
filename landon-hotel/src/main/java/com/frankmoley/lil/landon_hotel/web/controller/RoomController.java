package com.frankmoley.lil.landon_hotel.web.controller;

import com.frankmoley.lil.landon_hotel.data.repository.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    private final RoomRepository roomRepository;

    @GetMapping
    public String getRooms(Model model) {
        model.addAttribute("rooms",this.roomRepository.findAll());
        return "room-list";
    }

}
