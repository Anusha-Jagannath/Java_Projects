package arraylistintervals;

import java.util.ArrayList;

class Interval {
    int startTime;
    int endTime;
    Interval(int startTime,int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
public class Main {

    public static void main(String args[]) {
        System.out.println("Learning merge intervals problem");

    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (intervals == null || intervals.size() == 0) return intervals;

        Interval toInsert = newInterval;
        int i = 0;
        while (i<intervals.size()){
            Interval current = intervals.get(i);
            if (current.endTime < toInsert.startTime) {
                i++;
                continue;
            } else if (toInsert.endTime < current.startTime) {
                intervals.add(i,toInsert);
                break;
            } else {
                toInsert.startTime = Math.min(toInsert.startTime,current.startTime);
                toInsert.endTime = Math.max(toInsert.endTime,current.endTime);
                intervals.remove(i);

            }
        }

        if (i == intervals.size()) {
            intervals.add(toInsert);
        }

        return intervals;
    }
}
