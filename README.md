# web-image-capture
Captures a picture from a webcam, and posts it to aws rekog service

Create your own aws.properties file in src/main/resources <br/>
with contents:<br/>
aws.access.key=YourAccessKeyHere<br/>
aws.secret.key=YourSecretKeyHere<br/>
<br/>
run with command:<br/>
mvn spring-boot:run<br/>
<br/>
http://localhost:8080/camera <--to index face<br/>
http://localhost:8080/searchByPicture <-- to search faces that have already been indexed<br/>
