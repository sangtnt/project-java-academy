package Entities;

import java.util.List;
import java.util.Random;

public class RandomList {
	public static Content Random(List<Content> contentList) {
		Random rand= new Random();
		return contentList.get(rand.nextInt(contentList.size()));
	}
}
