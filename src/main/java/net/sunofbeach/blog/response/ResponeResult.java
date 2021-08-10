package net.sunofbeach.blog.response;

/**
 * @Author danny
 * @Date 2021/8/10 9:01 下午
 * @Version 1.0
 */
public class ResponeResult {

    public ResponeResult(ResponseState responseState) {
        this.success = responseState.isSuccess();
        this.code = responseState.getCode();
        this.message = responseState.getMessage();
    }

    public static ResponeResult SUCCESS() {
        return new ResponeResult(ResponseState.SUCCESS);
    }

    public static ResponeResult FAILED() {
        return new ResponeResult(ResponseState.FAILED);
    }

//    # 重构一个登录成功接口返回
    public static ResponeResult SUCCESS(String message) {
        ResponeResult responeResult = new ResponeResult(ResponseState.SUCCESS);
        responeResult.setMessage(message);
        return responeResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    private boolean success;
    private int code;
    private String message;

    public Object getData() {
        return data;
    }

    public ResponeResult setData(Object data) {
        this.data = data;
        return this;
    }


    private Object data;
}
