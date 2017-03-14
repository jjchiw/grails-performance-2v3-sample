# grails-performance

https://github.com/grails/grails-core/issues/640
https://github.com/grails/grails-core/issues/10463

The name of the `apps` are not `g2` or `g3`, I generated the war and then I copy them to `apache-tomcat-8.5.11` and rename them
running with `java version "1.8.0_112"`

I added two databases with the same data (100 Rows) and this schema

```
CREATE TABLE `Foo` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `phone` varchar(100) default NULL,
  `email` varchar(255) default NULL,
  `somedate` varchar(255),
  `company` varchar(255),
  `siret` varchar(14),
  `chilean_rut_number` varchar(15) default NULL,
  `personal_number` varchar(13) default NULL,
  `organization_number` varchar(11) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;
```


siege -c 25 -b -r 15  http://localhost:8080/g2/foo/

## grails 2.5.0

```
Transactions:                    250 hits
Availability:                 100.00 %
Elapsed time:                   0.96 secs
Data transferred:               7.29 MB
Response time:                  0.05 secs
Transaction rate:             261.23 trans/sec
Throughput:                     7.61 MB/sec
Concurrency:                   12.99
Successful transactions:         250
Failed transactions:               0
Longest transaction:            0.87
Shortest transaction:           0.01
```

siege -c 25 -b -r 15  http://localhost:8080/g3/foo/

## Grails 3.2.4:

```
Transactions:                    250 hits
Availability:                 100.00 %
Elapsed time:                   1.81 secs
Data transferred:               6.79 MB
Response time:                  0.09 secs
Transaction rate:             138.12 trans/sec
Throughput:                     3.75 MB/sec
Concurrency:                   12.53
Successful transactions:         250
Failed transactions:               0
Longest transaction:            1.68
Shortest transaction:           0.01
```
