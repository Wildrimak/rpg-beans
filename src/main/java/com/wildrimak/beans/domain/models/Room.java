package com.wildrimak.beans.domain.models;

import java.util.Set;

public class Room {

	private Integer id;
	private Integer amountLinesAndColumns;
	private Player hero;
	private Set<Player> enemies;

	public Room() {
	}

	public Room(Integer amountLinesAndColumns, Player hero, Set<Player> enemies) {
		this.amountLinesAndColumns = amountLinesAndColumns;
		this.hero = hero;
		this.enemies = enemies;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmountLinesAndColumns() {
		return amountLinesAndColumns;
	}

	public void setAmountLinesAndColumns(Integer amountLinesAndColumns) {
		this.amountLinesAndColumns = amountLinesAndColumns;
	}

	public Player getHero() {
		return hero;
	}

	public void setHero(Player hero) {
		this.hero = hero;
	}

	public Set<Player> getEnemies() {
		return enemies;
	}

	public void setEnemies(Set<Player> enemies) {
		this.enemies = enemies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
