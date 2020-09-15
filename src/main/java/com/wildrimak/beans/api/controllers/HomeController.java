package com.wildrimak.beans.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildrimak.beans.api.configurations.annotations.EnemyProperty;
import com.wildrimak.beans.api.configurations.annotations.HeroProperty;
import com.wildrimak.beans.api.configurations.annotations.RoomProperty;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private HeroProperty heroProperty;

	@Autowired
	private EnemyProperty enemyProperty;

	@Autowired
	private RoomProperty roomProperty;

	@GetMapping
	public String start() {

		System.out.println(heroProperty);
		System.out.println(enemyProperty);
		System.out.println(roomProperty);

		return print("RPG Beans - Start", heroProperty.toString(), enemyProperty.toString(), roomProperty.toString());
	}

	private String print(String... strings) {

		String result = "";

		for (String string : strings) {
			result += string + "<br>&emsp;";
		}

		return result;
	}

}
