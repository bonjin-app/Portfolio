package kr.co.bonjin.portfolio.common.response;

import lombok.Getter;

@Getter
public class ApiDataResponse<E> extends ApiResponse {

	// 공통되지 않는 데이터
	private E data;

	public ApiDataResponse(E data) {
		super();
		this.data = data;
	}
}