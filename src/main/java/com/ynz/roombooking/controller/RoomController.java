package com.ynz.roombooking.controller;

import com.ynz.roombooking.domain.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static List<Room> rooms = new ArrayList<>();

    static {
        IntStream.range(0, 10).forEach(i -> rooms.add(new Room(i, "room-" + i, "100" + i, "info: w" + i)));
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", rooms);
        return "rooms";
    }


}
