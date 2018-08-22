package Step3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }

public class MergeIntervals {
	private class IntervalComparator implements Comparator<Interval> {
	    @Override
	    public int compare(Interval a, Interval b) {
	        return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
	    }
	}
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        LinkedList<Interval> merged = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast().end < interval.start) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
            }
        }

        return merged;
    }
    public List<Interval> merge2(List<Interval> intervals){
    	if(intervals == null || intervals.size()==0 || intervals.size()==1)
    		return intervals;
    	List<Interval> res= new ArrayList<>();
    	Interval ins = new Interval(intervals.get(0).start,intervals.get(0).end);
        for( int i=0; i<intervals.size(); i++){
        	if(i<intervals.size()-1){
            	int start2 = intervals.get(i+1).start;
            	int end2 = intervals.get(i+1).end;
            	if(ins.end>=start2){
            		if(ins.start>end2){
                		Interval newInterval = new Interval(ins.start, ins.end);
                		res.add(newInterval);
                		ins.start = start2;
                		ins.end = end2;
            		}
            		ins.start = ins.start < start2? ins.start:start2;
            		ins.end = ins.end>end2? ins.end:end2;
            		continue;
            	}else{
            		Interval newInterval = new Interval(ins.start, ins.end);
            		res.add(newInterval);
            		ins.start = start2;
            		ins.end = end2;
            	}
        	}else{
        		Interval newInterval = new Interval(Math.min(ins.start, intervals.get(i).start),Math.max(ins.end, intervals.get(i).end));
        		res.add(newInterval);
        	}
        }
        return res;
    }
}

