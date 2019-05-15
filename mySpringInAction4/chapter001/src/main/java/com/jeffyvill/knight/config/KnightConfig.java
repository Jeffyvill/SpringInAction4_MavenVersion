package com.jeffyvill.knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jeffyvill.knight.BraveKnight;
import com.jeffyvill.knight.Knight;
import com.jeffyvill.knight.Quest;
import com.jeffyvill.knight.SlayDragonQuest;

@Configuration
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
