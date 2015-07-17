# https-spring-boot-demo
Spring boot demo in HTTPS/TSL



keytool -keystore src\main\resources\testkeystore -genkey -alias client

keytool -genkey -dname "cn=Chintan Patel, ou= DevOps, o=mycompany, c=IN" -alias mycompany -keystore src\main\resources\testkeystore 

C:\>keytool -genkey -keyalg RSA -dname "cn=Chintan Patel, ou= DevOps, o=mycompany, c=IN" -alias mycompany -keystore src\main\resources\testkeystore -storepass changeit -validity 360 -keysize 2048
EnteEnter key password for<mycompany> (RETURN if same as keystore password):
