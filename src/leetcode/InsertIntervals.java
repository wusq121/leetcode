package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval){
		List<Interval> res = new ArrayList<Interval>();
		int i = 0;
		while(i < intervals.size() && intervals.get(i).end < newInterval.start)
			res.add(intervals.get(i++));
		while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
			int start = (intervals.get(i).start > newInterval.start) ? newInterval.start : intervals.get(i).start;
			int end = (intervals.get(i).end > newInterval.end) ? intervals.get(i).end : newInterval.end;
			newInterval = new Interval(start, end);
			i++;
		}
		res.add(newInterval);
		while(i < intervals.size())
			res.add(intervals.get(i++));
		
		return res;
	}
}
