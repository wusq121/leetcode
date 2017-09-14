package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval{
	int start;
	int end;
	public Interval() {
		start = 0;
		end = 0;
	}
	public Interval(int s, int e){
		start = s;
		end = e;
	} 
}
public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals){
		List<Interval> res = new ArrayList<Interval>();
		if(intervals == null || intervals.isEmpty()) return res;
		Comparator<Interval> comparator = new Comparator<Interval>() {
			public int compare(Interval a, Interval b){
				if(a.start < b.start) return -1;
				else if (a.start > b.start) return 1;
				else{
					if(a.end < b.end) return -1;
					else if(a.end > b.end) return 1;
					else return 0;
				}
			}
		};
		
		Collections.sort(intervals, comparator);
		for(int i = 0; i < intervals.size(); i++){
			Interval curr = intervals.get(i);
			if(res.isEmpty()){
				res.add(curr);
			}else{
				Interval last = res.get(res.size() - 1);
				if(last.end >= curr.start){
					last.end = (last.end > curr.end) ? last.end : curr.end;
				}else{
					res.add(curr);
				}
			}
		}
		return res;
	}
}
