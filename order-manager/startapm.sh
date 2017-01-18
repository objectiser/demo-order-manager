. /home/gbrown/repositories/hawkular/objectiser/hawkular-apm/dist/target/hawkular-apm-dist-0.13.1.Final-SNAPSHOT/apm/setenv.sh 8180 opentracing

java $JAVA_OPTS -DHAWKULAR_APM_SERVICE_NAME=order-manager -DHAWKULAR_APM_BUILDSTAMP=v5 -jar target/order-manager-swarm.jar -Dswarm.http.port=3000
