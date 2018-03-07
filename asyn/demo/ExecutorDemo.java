package asyn.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 异步任务
 * 
 * ExecutorService : 任务提交
 * @author ‌jin
 * @date 2018年3月7日 下午10:17:56
 */
public class ExecutorDemo {
	private ExecutorService executor = Executors.newFixedThreadPool(1);

	public void asynTask() throws InterruptedException {
		executor.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int sum = 0;
				for(int i = 1; i < 1000; i++) {
					sum += i;
				}
				System.out.println("1+2+3+......+999 = "+sum);
			}
		});

	}
}
