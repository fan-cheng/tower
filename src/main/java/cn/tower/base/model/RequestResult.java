package cn.tower.base.model;


/**
 * 统一返回json格式
 * 
 * @author Administrator
 *
 */
public class RequestResult {
	
	//返回码
	private Integer code = 0;
	//成功失败信息
	private String message;
	//具体返回数据
	private Object data;
	
	
	public RequestResult(Integer code,String message,Object data){
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public RequestResult(Integer code,String message){
		this.code = code;
		this.message = message;
	}
	
	public RequestResult(Integer code , Object data){
		this.code = code;
		this.data = data;
	}
	


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RequestResult{" +
				"code=" + code +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}
}
