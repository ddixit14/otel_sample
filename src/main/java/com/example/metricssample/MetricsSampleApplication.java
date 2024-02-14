package com.example.metricssample;

import io.opencensus.exporter.stats.stackdriver.StackdriverStatsConfiguration;
import io.opencensus.exporter.stats.stackdriver.StackdriverStatsExporter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class MetricsSampleApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MetricsSampleApplication.class, args);
		StackdriverStatsConfiguration configuration = StackdriverStatsConfiguration.builder()
				.setMetricNamePrefix("custom.googleapis.com")
				.build();
		StackdriverStatsExporter.createAndRegister(configuration);
	}
}
