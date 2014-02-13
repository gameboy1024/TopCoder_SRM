package tc.srm.srm598;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class BinPackingEasy{
	public int minBins(int[] item){
		int count = 0;	
		Arrays.sort(item);
		List<int[]> items = Arrays
	    Collections.reverse(list);
	    students = list.toArray();
		for(int i = 0; i < item.length; i++){
			if(item[i] <= 300){
				for (int j = i; j < item.length; j++){
					if (item[i] + item[j] <= 300) {
						count++;
						item[j] = 999;
						break;
					}
				}
			}			
		}
		return count;
	}
}import java.util.Arrays;
import java.util.Collections;
public class BinPackingEasy{
	public int minBins(int[] item){
		int count = 0;
		Arrays.sort(item, Collections.reverseOrder());
		for(int i = 0; i < item.length; i++){
			if(item[i] <= 300){
				for (int j = i; j < item.length; j++){
					if (item[i] + item[j] <= 300) {
						count++;
						item[j] = 999;
						break;
					}
				}
			}			
		}
		return count;
	}
}