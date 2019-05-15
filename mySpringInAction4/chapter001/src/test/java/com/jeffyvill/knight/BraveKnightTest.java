package com.jeffyvill.knight;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class BraveKnightTest {
	
	@Test
	public void KnightShouldEmbarkQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}

}
