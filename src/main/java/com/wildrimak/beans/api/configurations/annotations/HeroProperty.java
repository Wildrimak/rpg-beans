package com.wildrimak.beans.api.configurations.annotations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("player.hero")
public class HeroProperty {

	private Integer life;
	private Integer atack;
	private Integer defense;
	private Integer experience;

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
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

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "HeroProperty [life=" + life + ", atack=" + atack + ", defense=" + defense + ", experience=" + experience
				+ "]";
	}

}
