package com.wildrimak.beans.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	@GetMapping
	public String situation() {

		return "position of player, position of enemy, informations from board";
	}

	@GetMapping("/{line}/{column}")
	public String atack(@PathVariable Integer line, @PathVariable Integer column) {

		System.out.println(line);
		System.out.println(column);

		return "return the new situation with atack of player";
	}
}
