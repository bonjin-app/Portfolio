package kr.co.bonjin.portfolio.common.response;

import kr.co.insungbank.app.isbank.common.error.ApiError;
import lombok.Getter;

@Getter
public class ApiResponse {

	//공통적으로 갖고 있는것
	private String status;
	private ApiError error;
	
	public ApiResponse() {
		status = "OK";
		error = new ApiError("", "");
	}
	
	public ApiResponse(ApiError error) {
		status = "Failed";
		this.error = error;
	}
}
