class MovingAverage {
    private Queue<Integer> queue;
    private int maxsize;
    private double sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        maxsize = size;
            
        }
    
    
    public double next(int val) {
        if(queue.size() < maxsize){
            sum += val;
            queue.offer(val);
            return sum/queue.size();
        }else{
           queue.poll();
           queue.offer(val);
           double sum1 = 0;
            for(Integer q:queue){
                sum1 += q;
            }
            return sum1/maxsize;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */