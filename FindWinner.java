import java.util.*;
class FindWinner {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=1;i<=n;++i)
        {
            arr1.add(i);
        }
        int cur_ind=0;

        while(arr1.size()>1)
        {
            int  next_to_remove=(cur_ind + k-1) % arr1.size();
            arr1.remove(next_to_remove);
            cur_ind = next_to_remove;
        }
        return arr1.get(0);
    }
}
