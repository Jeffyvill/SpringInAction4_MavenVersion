package d_mixedConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource( locations = "classpath:d_mixedConfig_spring.xml" )
public class SoundSystemConfig {

}
