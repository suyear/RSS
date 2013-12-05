package com.suyears.rss.main;

import com.suyears.rss.model.Feed;
import com.suyears.rss.model.FeedMessage;
import com.suyears.rss.read.RSSFeedParser;

/**
 * 引自http://www.vogella.com/
 */
public class ReadXml {
	
	public static void main(String[] args) {
		RSSFeedParser parser = new RSSFeedParser("http://news.csdn.net/rss_tag.html?tag=%E5%AF%B9%E8%AF%9Dcto");
	    Feed feed = parser.readFeed();
	    System.out.println(feed);
	    for (FeedMessage message : feed.getMessages()) {
	      System.out.println(message);
	    }	
	}
}
