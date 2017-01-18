. /home/gbrown/repositories/hawkular/objectiser/hawkular-apm/dist/target/hawkular-apm-dist-0.13.1.Final-SNAPSHOT/apm/setenv.sh 8180 opentracing

java $JAVA_OPTS -DHAWKULAR_APM_SERVICE_NAME=account-manager -DHAWKULAR_APM_BUILDSTAMP=v2 -jar target/account-manager-swarm.jar -Dswarm.http.port=3001
