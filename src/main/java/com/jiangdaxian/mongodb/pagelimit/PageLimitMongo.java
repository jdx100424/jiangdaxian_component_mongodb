package com.jiangdaxian.mongodb.pagelimit;

import java.io.Serializable;

public class PageLimitMongo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static int NO_PAGE = 1;
	public final static int NO_ROW_LIMIT = 10;
	/** 页号 */
	protected int page = NO_PAGE;
	/** 分页大小 */
	protected int limit = NO_ROW_LIMIT;

	/** 结果集是否包含TotalCount */
	protected boolean containsTotalCount;

	public PageLimitMongo() {
		this(NO_PAGE,NO_ROW_LIMIT,false);
	}
	
	/**
	 * Query TOP N, default containsTotalCount = false
	 * 
	 * @param limit
	 */
	public PageLimitMongo(int limit) {
		this(NO_PAGE,limit,false);
	}

	public PageLimitMongo(int page, int limit) {
		this(page,limit,false);
	}
	public PageLimitMongo(int page, int limit,boolean containsTotalCount) {
		this.limit = limit;
		this.page = page;
		this.containsTotalCount = containsTotalCount;
	}

	public int getPage() {
		if(page <=0) {
			return NO_PAGE;
		}
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public boolean isContainsTotalCount() {
		return containsTotalCount;
	}

	public void setContainsTotalCount(boolean containsTotalCount) {
		this.containsTotalCount = containsTotalCount;
	}
}
