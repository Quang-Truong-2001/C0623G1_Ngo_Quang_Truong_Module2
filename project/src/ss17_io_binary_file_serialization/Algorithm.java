package ss17_io_binary_file_serialization;

import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        int[] a={-1, 150, 190, 170, -1, -1, 160, 180};
        int[] n=new int[a.length];
        Queue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1)
                queue.add(a[i]);
        }
        for(int i=0;i<n.length;i++){
            if(a[i]==-1)
                n[i]=-1;
             else
                n[i]=queue.poll();
        }
    }
}

