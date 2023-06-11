package modelo;

import java.util.List;

public class Response<T> {
    private boolean success;
    private String message;
    private T data;
    private List<T> dataList;
    
    public Response (boolean success ){
        this(success, null, null, null);
    }
    public Response(boolean success, String message) {
        this(success, message, null, null);
    }
    public Response(boolean success, T data) {
        this(success, null, data, null);
    }
    public Response(boolean success, List<T> dataList) {
        this(success, null, null, dataList);
    }
    public Response(boolean success, String message, T data) {
        this(success, message, data, null);
    }
    public Response(boolean success, String message, List<T> dataList) {
        this(success, message, null, dataList);
    }
    public Response(boolean success, String message, T data, List<T> dataList) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.dataList = dataList;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public List<T> getDataList() {
        return dataList;
    }
    
}
