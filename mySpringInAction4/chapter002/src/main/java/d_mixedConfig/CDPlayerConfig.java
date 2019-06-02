package d_mixedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CDPlayerConfig {
	@Bean
	public MediaPlayer mediaPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
