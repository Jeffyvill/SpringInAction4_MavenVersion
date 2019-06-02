package c_xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c_xmlConfig_spring.xml");
		MediaPlayer mediaplayer = context.getBean(CDPlayer.class);
		mediaplayer.play();
		context.close();
	}
}
