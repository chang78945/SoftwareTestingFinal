package gradeSystem;

import exception.NoSuchCommandExceptions;
import exception.NoSuchIDExceptions;

//class Main 
//main ( ) 


public class Main {
	static final String NO_SUCH_ID_EXCEPTIONS_STRING = "此ID不存在!";
	static final String NO_SUCH_COMMAND_EXCEPTIONS_STRING = "指令錯了!";

	// public static void main (String args[])
	// try { call UI() 建構 aUI } end try
	// catch (NoSuchIDExceptions e1) {print msg1} //ex 此ID不存在!
	// catch (NoSuchCommandExceptions e2) {print msg2}//ex指令錯誤!
	// end class Main
	public static void main(String[] args) {
		try {
			UI aUi = new UI();
		} catch (NoSuchIDExceptions e) {
			System.out.print(NO_SUCH_ID_EXCEPTIONS_STRING);
		} catch (NoSuchCommandExceptions e) {
			System.out.print(NO_SUCH_COMMAND_EXCEPTIONS_STRING);
		}
	}
}
