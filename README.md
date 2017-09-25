# web-image-capture
Captures a picture from a webcam, and posts it to aws rekog service
<br/>
Create an AWS collection ready for storing indexed faces:<br/>
aws rekognition create-collection --collection-id "cwinDemo" --region eu-west-1<br/>
<br/>

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
