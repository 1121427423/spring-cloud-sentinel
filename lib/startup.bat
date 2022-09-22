java -Dserver.port=18080\
 -Dcsp.sentinel.dashboard.server=localhost:18080\
 -Dproject.name=sentinel-dashboard\
 -Dauth.enabled=true\
 -Dsentinel.dashboard.auth.username=sentinel\
 -Dsentinel.dashboard.auth.password=123456\
 -Dserver.servlet.session.timeout=7200\
 -jar sentinel-dashboard-1.8.5.jar
