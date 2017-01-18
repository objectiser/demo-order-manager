# Demo Order Management Application: Order Manager


## Standalone Run & Build
```shell
$ mvn clean install
$ java -jar target/order-manager-swarm.jar -Dswarm.http.port=3000
```

Or run with OpenTracing JavaAgent using
```shell
$ ./startapm.sh
```

NOTE: Need to set the path to your Hawkular APM installation in the script.
