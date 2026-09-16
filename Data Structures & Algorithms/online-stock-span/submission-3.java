class StockSpanner {
    Stack<Integer> ori;
    Stack<Integer> span;
    public StockSpanner() {
        ori=new Stack<>();
        span=new Stack<>();
    }
    
    public int next(int price) {
    return process(price);
    }

    public int process(int in){
        if(ori.isEmpty() || ori.peek()>in){
            ori.push(in);
            span.push(1);
        }
        else{
            int curr=1;
            while(!ori.isEmpty() && ori.peek()<=in){
                ori.pop();
                curr+=span.pop();
            }
            ori.push(in);
            span.push(curr);
        }
    return span.peek();
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */