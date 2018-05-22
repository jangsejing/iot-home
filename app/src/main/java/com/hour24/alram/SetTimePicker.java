package com.hour24.alram;

import android.app.Activity;
import android.util.Log;
import android.widget.TimePicker;

/**
 * timepicker �ð� ��
 */
public class SetTimePicker {

	Activity activity;
	TimePicker timePicker;
	String device;

	public SetTimePicker(Activity activity, TimePicker timePicker, String device) {
		super();
		this.activity = activity;
		this.timePicker = timePicker;
		this.device = device;

	}

	public void onSet() {
		String result = new AlramSharedPreferences(activity).getValue(device);
		String[] flag = result.split("#");
		Log.e("devIoT", result);

		timePicker.setCurrentHour(Integer.parseInt(flag[1]));
		timePicker.setCurrentMinute(Integer.parseInt(flag[2]));
	}
}
