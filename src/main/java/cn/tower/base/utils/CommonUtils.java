package cn.tower.base.utils;

import java.util.Collection;
import java.util.Map;


public class CommonUtils {


	/**
	 * 判断是否为空
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public static boolean isEmpty(Object obj) {
		if (obj instanceof String) {
			return isEmpty((String) obj);
		} else if (obj instanceof Object[]) {
			return isEmpty((Object[]) obj);
		} else if (obj instanceof Collection<?>) {
			return isEmpty((Collection<?>) obj);
		} else if (obj instanceof Map<?, ?>) {
			return isEmpty((Map<?, ?>) obj);
		}
		return obj == null;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isEmpty(String input) {
		return input == null || input.trim().isEmpty();
	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static boolean isEmpty(Object[] array) {
		return array == null || array.length == 0;
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isEmpty(Collection<?> c) {
		return c == null || c.isEmpty();
	}

	/**
	 * 
	 * @param map
	 * @return
	 */
	public static boolean isEmpty(Map<?, ?> map) {
		return map == null || map.isEmpty();
	}




}
