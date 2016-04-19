package com.study;

public class PrinterColor implements Printer {

	@Override
	public boolean isColor() {
		return false;
	}

	@Override
	public boolean isDuplex() {
		return false;
	}

	@Override
	public boolean isMono() {
		return false;
	}

	@Override
	public boolean isLargePaper() {
		return false;
	}

	@Override
	public boolean hasScanner() {
		return true;
	}

	@Override
	public void print() {
		System.out.println("Teste de impressão");
	}

	@Override
	public void cancelPrint() {
		System.out.println("Cancelar impressão");
	}
}