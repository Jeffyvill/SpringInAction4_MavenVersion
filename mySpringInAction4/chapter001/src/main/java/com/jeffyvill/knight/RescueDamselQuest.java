package com.jeffyvill.knight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RescueDamselQuest implements Quest {
	
	@Override
	public void embark() {
		log.info("Embarking on a quest to rescue a damsel.");
	}

}
