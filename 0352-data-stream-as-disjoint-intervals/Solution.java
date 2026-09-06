
class SummaryRanges {
    private TreeMap<Integer, Integer> intervals; // key = interval start, value = interval end

    public SummaryRanges() {
        intervals = new TreeMap<>();
    }

    public void addNum(int value) {
        int left = value;
        int right = value;

        Map.Entry<Integer, Integer> justGreater = intervals.higherEntry(value);

        // check peeche wala interval (jiska start <= value)
        Map.Entry<Integer, Integer> ekPeeche = intervals.floorEntry(value);

        if (ekPeeche != null) {
            if (ekPeeche.getValue() >= value) {
                return; // value already kisi interval ke andar hai
            }
            if (ekPeeche.getValue() == value - 1) {
                left = ekPeeche.getKey(); // adjacent hai, merge karo
            }
        }

        if (justGreater != null && justGreater.getKey() == value + 1) {
            right = justGreater.getValue();
            intervals.remove(justGreater.getKey());
        }

        intervals.put(left, right);
    }

    public int[][] getIntervals() {
        int[][] result = new int[intervals.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : intervals.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }
        return result;
    }
}