package core;

import java.text.DecimalFormat;
import java.util.Random;

public class Math {
    private boolean status;
    private int number1;
    private int number2;
    private double res;

    public String execute() {
	number1 = new Random().nextInt(101);
	number2 = new Random().nextInt(101);
	status = new Random().nextBoolean();
	String operation = " + ";
	int opt;
	if (status == true) {
	    opt = new Random().nextInt(4);
	    switch (opt) {
	    case 0: // +
		res = (double) number1 + number2;
		operation = " + ";
		break;
	    case 1: // -
		res = (double) number1 - number2;
		operation = " - ";
		break;
	    case 2: // *
		res = (double) number1 * number2;
		operation = " * ";
		break;
	    case 3: // /
		if (number2 == 0) number2 = 1;
		res = (double) number1 / number2;
		operation = " / ";
		break;
	    }
	} else {
	    opt = new Random().nextInt(4);
	    int ran = new Random().nextInt(10 - 2 + 1) + 2;
	    switch (opt) {
	    case 0: // +
		operation = " + ";
		res = (double) number1 + number2 + ran;
		break;
	    case 1: // -
		operation = " - ";
		res = (double) number1 + number2 + ran;
		break;
	    case 2: // *
		operation = " * ";
		res = (double) number1 + number2 + ran;
		break;
	    case 3: // /
		if (number2 == 0) number2 = 1;
		res = (double) number1 / number2 + ran;
		operation = " / ";
		break;
	    }
	}
	DecimalFormat df = new DecimalFormat("#.###");
	return number1 + operation + number2 + " = " + df.format(res);
    }

    public boolean isStatus() {
	return status;
    }

    public void setStatus(boolean status) {
	this.status = status;
    }

    public int getNumber1() {
	return number1;
    }

    public void setNumber1(int number1) {
	this.number1 = number1;
    }

    public int getNumber2() {
	return number2;
    }

    public void setNumber2(int number2) {
	this.number2 = number2;
    }

    public double getRes() {
	return res;
    }

    public void setRes(long res) {
	this.res = res;
    }

}
