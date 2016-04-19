package com.study;

public interface Printer {
	public boolean isMono();
	public boolean isColor();
	public boolean isDuplex();
	public boolean isLargePaper();
	public boolean hasScanner();

	public void print();
	public void cancelPrint();
}