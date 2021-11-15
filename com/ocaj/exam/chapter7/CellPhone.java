package com.ocaj.exam.chapter7;

public class CellPhone implements Phone{
	private boolean callInProgress;

	@Override
	public void dialNumber(int number) {}

	@Override
	public boolean isCallInProgress() {
		return callInProgress;
	}
}
