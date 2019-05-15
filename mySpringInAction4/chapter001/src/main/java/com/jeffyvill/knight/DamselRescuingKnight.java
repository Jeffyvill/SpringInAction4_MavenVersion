package com.jeffyvill.knight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DamselRescuingKnight implements Knight {
	
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}

}
