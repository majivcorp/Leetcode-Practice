class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> hp = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            hp.add(stone);
        }
        
        while (hp.size() > 1) {
            int stone1 = hp.remove();
            int stone2 = hp.remove();
            if (stone1 != stone2) {
                hp.add(stone1 - stone2);
            }
        }
        
        return hp.isEmpty() ? 0 : hp.remove();
    }
} 