package net.sunofbeach.blog.response;

/**
 * @Author danny
 * @Date 2021/8/10 9:25 下午
 * @Version 1.0
 */
public enum ResponseState {

    SUCCESS(true, 200, "请求成功"),
    FAILED(false, 400, "请求失败");


    ResponseState(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    private int code;
    private String message;
    private boolean success;
}
