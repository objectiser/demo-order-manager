. /home/gbrown/repositories/hawkular/objectiser/hawkular-apm/dist/target/hawkular-apm-dist-0.13.1.Final-SNAPSHOT/apm/setenv.sh 8180 opentracing

java $JAVA_OPTS -Dorg.jboss.byteman.verboseX -DHAWKULAR_APM_LOG_LEVEL=INFO -cp src/main/resources -jar target/order-manager-swarm.jar -Dswarm.http.port=3000
