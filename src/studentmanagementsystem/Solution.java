package studentmanagementsystem;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution implements KeyListener {
    public int smallestDistancePair(int[] nums, int k) {
        int i=0, j=1;
        List<Integer> diff = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
        // we don't have to return just the value of the min sum,
        // otherwise we would've used a min variable,
        // we need to calculate the kth minimum difference
        int count = 0;
        while(i < j && (i < n && j < n) && count != k){
            int d = nums[j] - nums[i];
            if(d == 0){
                continue;
            }
            else{
                if(nums[j] - nums[i] > d){
                    i++;j++;
                }else{
                    count++;
                }
            }
        }

        Collections.sort(diff);

        return diff.get(k);

    }

    public static void main(String[] args) {
        System.out.println("anuj".hashCode());

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == 10){
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

