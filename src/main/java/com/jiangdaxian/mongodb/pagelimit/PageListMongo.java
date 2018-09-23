package com.jiangdaxian.mongodb.pagelimit;

import java.io.Serializable;
import java.util.ArrayList;

public class PageListMongo<T> extends ArrayList<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 总行数
	private Long totalCount;

	/** 页号 */
	private Integer page;
	/** 分页大小 */
	private Integer limit;

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}
