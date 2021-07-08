package com.epam.unit06.task02;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 | hours >= 24) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}

	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 | minutes >= 60) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds < 0 | seconds >= 60) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public void add(int hours, int minutes, int seconds) {
		int currentTime;
		int addTime;
		int resultTime;
		int hoursRes;
		int minutesRes;
		int secondsRes;

		currentTime = this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
		addTime = hours * 60 * 60 + minutes * 60 + seconds;

		resultTime = currentTime + addTime;

		hoursRes = (resultTime / 3600);
		minutesRes = ((resultTime - hoursRes * 3600) / 60);
		secondsRes = (resultTime - hoursRes * 3600 - minutesRes * 60);

		this.setHours(hoursRes);
		this.setMinutes(minutesRes);
		this.setSeconds(secondsRes);
	}

}
