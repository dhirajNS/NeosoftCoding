import java.util.LinkedList;
import java.util.Queue;

public class QueueRecentCounter {
    Queue<Integer> queue;
    public QueueRecentCounter() {
        queue=new LinkedList<>();

    }

    public int ping(int t) {
        if(queue.size()==0){
            queue.add(t);
            return 1;
        }else {
            if (t <= 3000) {
                queue.add(t);
            }else{
                int margin=t-3000;
                while(queue.size()!=0 &&queue.peek() <margin){
                    queue.poll();
                }
                queue.add(t);
            }
            return  queue.size();
        }
    }

    public static void main(String[] args) {
        QueueRecentCounter obj = new QueueRecentCounter();
        int param_1 = obj.ping(1);
        int param_2 = obj.ping(100);
        obj.ping(3001);
        obj.ping(3002);
    }
}
