package com.org.punch.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class DemoMetrics {
    private final Counter counter;
    private final AtomicInteger demoGauage;

    public DemoMetrics(MeterRegistry meterRegistry){
        this.counter = meterRegistry.counter("sre_demo_counter");
        this.demoGauage = meterRegistry.gauge("sre_demo_guage", new AtomicInteger(0));
    }

    public void getRandomMetricsData() {
        demoGauage.set(getRandomNumberInRange(0, 100));
        counter.increment();
        System.out.println("counter "+counter+" guage "+demoGauage.get());
    }


    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
