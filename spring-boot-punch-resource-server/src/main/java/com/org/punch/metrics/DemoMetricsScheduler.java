package com.org.punch.metrics;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoMetricsScheduler {

        private final DemoMetrics demoMetrics;

        public DemoMetricsScheduler(DemoMetrics demoMetrics) {
            this.demoMetrics = demoMetrics;
        }

        @Scheduled(fixedRate = 5000)
        public void triggerCustomMetrics() {
            demoMetrics.getRandomMetricsData();

        }
}

