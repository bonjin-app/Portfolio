package kr.co.bonjin.portfolio.common.error;

public class ApiError {

	public static final ApiError MISSING_PARAMETER = new ApiError("1000", "Missing Require Parameter : ");
	public static final ApiError INVALID_PARAMETER = new ApiError("1001", "Invalid Parameter : ");

	public static final ApiError INVALID_PATH = new ApiError("2001", "Filename contains Invalid Path : ");
	public static final ApiError FILE_NOT_FOUND = new ApiError("2002", "File not found : ");

	public static final ApiError TOKEN_NOT_FOUND = new ApiError("3000", "Token not found : ");

	public static final ApiError DEPLICATE_ERROR = new ApiError("4000", "Duplicate error : ");
	public static final ApiError UNAUTHORIZED_ERROR = new ApiError("4010", "Unauthorized error : ");
	public static final ApiError FORBIDDEN_ERROR = new ApiError("4030", "Forbidden error : ");

	public static final ApiError INTERNAL_SERVER_ERROR = new ApiError("5000", "Internal Server Error : ");

	public static final ApiError DEFAULT_ERROR = new ApiError("9999", "");

	private String code;
	private String message;

	public ApiError(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
