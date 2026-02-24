package com.study.example.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsDTO {
    
    private final long count; 
    private final double sum;
    private final double avg;
    private final double max;
    private final  double min;

    public StatisticsDTO(DoubleSummaryStatistics statistics) {
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.max = statistics.getMax();
        this.min = statistics.getMin();
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public long getCount() {
        return count;
    }

}
