package mergeintervals;


import java.util.ArrayList;

class Interval {
    int startTime;
    int endTime;
    public Interval(int startTime,int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
public class Main {

    public static void main(String args[]) {
        System.out.println("Learning arrays merge intervals");
    }

    private static ArrayList<Interval> getIntervals(ArrayList<Interval> intervals, Interval newInterval) {
        if (intervals == null) {
            intervals = new ArrayList<>();
            intervals.add(newInterval);
            return intervals;
        } else if (intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        Interval toInsert = newInterval;
        int i = 0;
        while (i< intervals.size()){
            Interval currentInterval = intervals.get(i);
            if (currentInterval.endTime < toInsert.startTime) {
                i++;
                continue;
            } else if (toInsert.endTime < currentInterval.startTime) {
                intervals.add(i,toInsert);
                break;
            } else {
                int minStartTime = Math.min(toInsert.startTime,currentInterval.startTime);
                int maxStartTime = Math.max(toInsert.endTime,currentInterval.endTime);
                intervals.remove(intervals.get(i));

            }
        }

        if (i == intervals.size()) {
            intervals.add(toInsert);
        }
        return intervals;
    }

}
