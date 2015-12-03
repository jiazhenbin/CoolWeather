package cn.edu.jssvc.jiazhenbin.coolweather.util;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
