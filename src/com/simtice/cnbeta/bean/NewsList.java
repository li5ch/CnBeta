package com.simtice.cnbeta.bean;

import com.j256.ormlite.field.DatabaseField;

public class NewsList {
	@DatabaseField(id = true)
	private long ArticleID;
	@DatabaseField
	private String title;
	@DatabaseField
	private String pubtime;
	private boolean cmtClosed;
	@DatabaseField
	private String summary;
	@DatabaseField
	private String topicLogo;
	@DatabaseField
	private int cmtnum;
	@DatabaseField
	private boolean isFavorite;
	@DatabaseField
	private String theme;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubtime() {
		return pubtime;
	}

	public void setPubtime(String pubtime) {
		this.pubtime = pubtime;
	}

	public long getArticleID() {
		return ArticleID;
	}

	public void setArticleID(long articleID) {
		ArticleID = articleID;
	}

	public boolean isCmtClosed() {
		return cmtClosed;
	}

	public void setCmtClosed(boolean cmtClosed) {
		this.cmtClosed = cmtClosed;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTopicLogo() {
		return topicLogo;
	}

	public void setTopicLogo(String topicLogo) {
		this.topicLogo = topicLogo;
	}

	public int getCmtnum() {
		return cmtnum;
	}

	public void setCmtnum(int cmtnum) {
		this.cmtnum = cmtnum;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
