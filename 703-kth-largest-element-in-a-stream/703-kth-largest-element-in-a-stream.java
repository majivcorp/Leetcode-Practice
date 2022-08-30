class KthLargest {
    //1. We initialize a priority queue with a size of k.
    private static int k;
    private PriorityQueue<Integer> heap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        //2. We iterate through the nums array and add each element to the priority queue.
        for (int n : nums) {
            add(n);
        }
        
    }
    
    public int add(int val) {
        //3. If the priority queue is not full, we add the element to the priority queue.
        if (heap.size() < k) {
            heap.offer(val);
        }//4. If the priority queue is full and the new element is greater than the current top element, 
        else if (val > heap.peek()) {
            heap.poll(); //we remove the top element
            heap.add(val); //and add the new element
        }
        return heap.peek(); //5. Finally, we return the top element of the priority queue.
    }
}

