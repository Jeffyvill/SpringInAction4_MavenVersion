package b_javaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

}
