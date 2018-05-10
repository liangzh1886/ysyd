package cn.ysyd.model;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int SUCCESS = 0;

	public static final int FAIL = 1;
	
	private int status = SUCCESS;

	private T data;

	public ResultBean() {
		super();
	}

	public ResultBean(T data) {
		super();
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
