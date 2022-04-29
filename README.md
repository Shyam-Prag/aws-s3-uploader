# aws-s3-uploader

Application Architecture:
-> Springboot Java backend application
-> Spiringboot Rest API's used to communicate with front end.
-> React front-end
-> AWS S3 bucket storage
-> Temp database {Needs to be migrated to real database} 

Application:
-> User drag and drop image into front-end client. 
-> React sends HTTP request to Springboot.
-> Backend server processes request, uploads image to Amazon S3 bucket + Send user data to "database".
===
-> Backend server then downloads image from S3 bucket and displays as profile image for user.
-> Front-end CSS handles image size and height. 


