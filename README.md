# FirebaseRestDemoV1

Simple demo for integrate firebase with rest APIs

Implementations are under:
com.mycompany.myapp.security.firebase

Import and start main method from FirebaseRestDemoV1App to run services

To get Token ID:
User command line navigate to src\main\resources\auth and run firebase serve -> the host info will be shown after initialized
Copy URL from console and open on Browser. E.g:
hosting: Local server: http://localhost:5005

Open browser console (Token ID is logged after login successfully)
Select Google sign-in using Popup -> do login -> token will be printed on console

Test with APIs:
Post http://localhost:8080/api/register
Header (X-Authorization-Firebase, token ID)
{
"id": null,
"password" : "123456",
"login": "anonymoususer1",
"firstName": "anonymoususer",
"lastName": null,
"email": "testingMail@gmail.com",
"imageUrl": null,
"activated": false,
"langKey": null,
"createdBy": null,
"createdDate": null,
"lastModifiedBy": null,
"lastModifiedDate": null,
"authorities": null
}
GET http://localhost:8080/api/accounts
Header (X-Authorization-Firebase, token ID)
