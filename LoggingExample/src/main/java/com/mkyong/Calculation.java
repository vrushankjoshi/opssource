package com.mkyong;

import org.apache.log4j.Logger;

public class Calculation {

	final static Logger logger = Logger.getLogger(Calculation.class);

	public static void main(String[] args) {

		System.out.println("test");
		Calculation obj = new Calculation();

		int j = 200;
		for (int i = 1; i < 19; i++, j++) {
			try {
				obj.add(i, j);
			} catch (Exception exp) {
				logger.error(exp.getMessage(), exp);
			}

		}
		j = 0;
		int i = 0;
		for (i = 1; i < 1; i++, j++) {
			try {
				obj.multiply(i, j);
			} catch (Exception exp) {
				logger.error(exp.getMessage(), exp);
			}

		}

		j = 0;
		i = 0;
		for (i = 1; i < 2; i++, j++) {
			try {
				obj.divide(i, j);
			} catch (Exception exp) {
				logger.error(exp.getMessage(), exp);
			}

		}


	}

	private int add(int val1, int val2) {
		logger.info("Method Add Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<--");
		int result = val1 + val2;
		logger.info("Method Add Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<-- result -->" + result + "<--");

		return result;
	}

	private int multiply(int val1, int val2) {
		logger.info("Method Multiply Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<--");
		int result = val1 * val2;
		logger.info("Method Multiply Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<-- result -->" + result + "<--");

		return result;
	}

	private int divide(int val1, int val2) {
		logger.info("Method Divide Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<--");
		int result = val1 / val2;
		logger.info("Method Divide Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<-- result -->" + result + "<--");

		return result;
	}

	private int subtract(int val1, int val2) {
		logger.info("Method Subtract Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<--");
		int result = val1 - val2;
		logger.info("Method Subtract Val1 -->" + val1 + "<-- Val2 -->" + val2 + "<-- result -->" + result + "<--");

		return result;
	}

	private int runMe(int parameter, int div) {
		logger.info("Method Entry - Parameter -->" + parameter + "<--");
		int result = 0;
		// div = 0;
		result = parameter / div;

		logger.info("before return - input-->" + parameter + "<-- div -->" + div + "<-- restult -->" + result + "<--");
		return result;
	}

}