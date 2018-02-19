import java.util.Calendar;
import java.util.Date;

public class T456 {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new TP(i)).start();
		}
	}
}

class TP implements Runnable {
	TP() {
	}

	int i;

	TP(int i) {
		this.i = i;
	}

	public void run() {

		System.out.println("*****************************");
		System.out.println("-------------" + i + "----------------");
		System.out.println("*****************************");

		Calendar lCDateTime = Calendar.getInstance();
		long currenttimeinmillis = lCDateTime.getTimeInMillis();
		System.out.println("Calender - Time in milliseconds :" + currenttimeinmillis);

		long sleeptime = (60 * 1000) + currenttimeinmillis;
		long currentpollingtime = (20 * 1000) + currenttimeinmillis;

		while (currentpollingtime < sleeptime) {
			System.out.println(
					"pollintervaltime" + new Date(currentpollingtime) + "\n" + "sleeptime" + new Date(sleeptime));
			try {
				Thread.sleep(20 * 1000);
				currentpollingtime = currentpollingtime + (20 * 1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in ProcessDataCabinet.run" + "\n Exception Type is InterruptedException"
						+ "\n Exception is :" + e);
			}
		}
		System.out.println("Time exceeded....Start working");

		new Thread(new TP(i)).start();
	}
}