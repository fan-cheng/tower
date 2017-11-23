package cn.tower.base.utils;



import cn.tower.base.model.RequestResult;

import java.util.HashMap;
import java.util.Map;

/**
 * 处理返回
 * @author Administrator
 *
 */
public class ResultFactory {
	

	
public static Map<Integer, String> msgMap = new HashMap<Integer, String>();
     /**成功**/
	public static final int CODE_200 = 200;
	public final static int CODE_404 = 404;
	public final static int CODE_500 = 500;
	/**请求参数错误**/
	public final static int CODE_1000 = 1000;
	/**未查询到数据**/
	public final static int CODE_1001 = 1001;
	/**更新数据失败**/
	public final static int CODE_1002 = 1002;
	/**用户不存在**/
	public final static int CODE_1003 = 1003;
	/**密码错误**/
	public final static int CODE_1004 = 1004;
	/**删除失败***/
	public final static int CODE_1005 = 1005;
	static{
		msgMap.put(CODE_200,"成功");
		msgMap.put(CODE_404, "请求错误");
		
		msgMap.put(CODE_1000, "请求参数错误");
		msgMap.put(CODE_1001, "未查询到数据");
		msgMap.put(CODE_1002, "更新失败");
		msgMap.put(CODE_1003, "用户不存在");
		msgMap.put(CODE_1004, "密码错误");
		msgMap.put(CODE_1005, "删除失败");
		msgMap.put(400, "Bad Request!");
		msgMap.put(401, "NotAuthorization");
		msgMap.put(405, "Method Not Allowed");
		msgMap.put(406, "Not Acceptable");
		msgMap.put(CODE_500, "Internal Server Error");
	
	}
	
	public static RequestResult requestResult(int code){
		RequestResult result = new RequestResult(code, msgMap.get(code));		
		return result;
	}
	
	public static RequestResult requestResult(Object data){
		RequestResult result;
		if(CommonUtils.isEmpty(data)){
			result = new RequestResult(CODE_1001, msgMap.get(CODE_1001));
		}else{
			result = new RequestResult(CODE_200,msgMap.get(CODE_200), data);
		}
		return result;
	}
	
}
