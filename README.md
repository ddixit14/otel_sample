# What is this repo?
This repo is a sample Spring Boot app that demonstrates OpenTelemetry metrics in Spanner.

# How to run this sample?
This repo is dependent on **SNAPSHOT** versions of gax and spanner.
1. Enable Cloud Monitoring API. 
2. Give "Monitoring Admin" access to your 
2. Update project/instance/table ids in SpannerController. 
2. Start the app
3. Navigate to http://localhost:8080/spanner/ for a few read requests
4. Wait up to 1 minute, the metrics should show up in Cloud Monitoring dashboard on Metrics explorer tab. The relevant metrics are under Global -> Custom metrics. 
