package com.wildrimak.beans.domain.models;

public class Player {

	private Integer id;
	private Integer experience;
	private Integer atack;
	private Integer defense;
	private Integer life;
	private Boolean isEnemy;

	public Player() {
	}

	public Player(Integer experience, Integer atack, Integer defense, Integer life, Boolean isEnemy) {
		super();
		this.experience = experience;
		this.atack = atack;
		this.defense = defense;
		this.life = life;
		this.isEnemy = isEnemy;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getAtack() {
		return atack;
	}

	public void setAtack(Integer atack) {
		this.atack = atack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Boolean getIsEnemy() {
		return isEnemy;
	}

	public void setIsEnemy(Boolean isEnemy) {
		this.isEnemy = isEnemy;
	}

	public Integer getNivel() {

		Integer nivel = Integer.divideUnsigned(this.getExperience(), 100);

		return nivel;

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
		Player other = (Player) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
