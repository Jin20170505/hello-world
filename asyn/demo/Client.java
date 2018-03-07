package asyn.demo;
/**
 *  task2是个异步任务,执行到task2,主线程不会在task2 阻塞,不用等待task2 处理完,可以往下执行task3,主线程可以先执行完成.
 * @author ‌jin
 * @date 2018年3月7日 下午10:43:23
 */
public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		boolean r = task2();
		if(r){
			task3();
		}
		System.out.println("-----main end-----");
	}
	
	static boolean task2() throws InterruptedException{
		ExecutorDemo executor = new ExecutorDemo();
		executor.asynTask();
		System.out.println("------task2 end-----");
		return true;
	}
	static void task3() throws InterruptedException{
		int i = 1;
		Thread.sleep(5000);
		while(true){
			if(i++>1000){
				break;
			}
		}
		System.out.println("----task3 end--------");
	}
}
