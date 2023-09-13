import java.util.LinkedList;
import java.util.Queue;

public static final int  BUFFER_SIZE=5;
public static final int MAX_SIZE=20;

private static final Queue<Integer> buffer = new LinkedList<>();
private static int itemCount=0;

public class CP implements Runnable
{
	public void run()
	{
		while(True)
		{
			synchronized(buffer)
			{
				while(buffer.size == BUFFER_SIZE)
				{
					try
					{
						buffer.wait();
					}
					catch(InterruptedException e)
					{
						Thread.CurrentThread.interrupt();
					}
				}

				int item=itemCount++;
				buffer.add(item);
				System.out.println("Produced:"+item);
				buffer.notifyAll();
				if(item == MAX_ITEMS)
				{
					break;
				}
			}
		}
	}
}
