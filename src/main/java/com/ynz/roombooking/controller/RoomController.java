package com.ynz.roombooking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {
//    private static List<Room> rooms = new ArrayList<>();
//
//    static {
//        IntStream.range(0, 10).forEach(i -> rooms.add(new Room(i, "room-" + i, "100" + i, "info: www" + i)));
//    }
//
//    @GetMapping
//    public String getAllRooms(Model model) {
//        model.addAttribute("rooms", rooms);
//        return "rooms";
//    }

    @GetMapping("hello")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("hello world!", HttpStatus.OK);
    }


}
