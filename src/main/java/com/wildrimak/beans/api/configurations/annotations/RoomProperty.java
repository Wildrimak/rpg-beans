package com.wildrimak.beans.api.configurations.annotations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("player.rooms")
public class RoomProperty {

	private Integer amount;
	private Integer enemies;
	private Integer cells;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getEnemies() {
		return enemies;
	}

	public void setEnemies(Integer enemies) {
		this.enemies = enemies;
	}

	public Integer getCells() {
		return cells;
	}

	public void setCells(Integer cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "RoomProperty [amount=" + amount + ", enemies=" + enemies + ", cells=" + cells + "]";
	}

}
