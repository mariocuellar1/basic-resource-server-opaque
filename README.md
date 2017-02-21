# README

## Spring Boot OAuth Resource Server using Opaque Token

The resource server is the OAuth 2.0 term for your API server. The resource server handles authenticated requests after the application has obtained an access token.

This project is a simple but functional example of OAuth2 Resource Server implemented using Spring Boot. This project is mainly use to test [Oauth2 Authorization Server](https://github.com/mariocuellar1/oauth-server-opaque).

### How to install
It's a eclipse project, just import it and run.

### Parameters & Configuration
* **application.properties**
  * **security.oauth2.client.clientId**: Your client id. 
  * **security.oauth2.client.clientSecret** : Your client secret
  * **security.oauth2.resource.tokenInfoUri** : Oauth server location and checktoken URI. e.g: http://localhost:40051/oauth/check_token

### How to test

Before you run this server you need to configure and init your own Authorization Server if you don't have one please take a look to our [Oauth2 Authorization Server](https://github.com/mariocuellar1/oauth-server-opaque)

1. Configure application (application.properties above)
2. Start Resource Server [rigth-clic, run  :) ]
3. Import postman project *OpaqueResourceServerTest.postman_collection.json* to postman
   * To test get my information (/user):
   ```
   Get a valid oAuth Token, you can use test "Token - password" maybe you have to adjust URI and/or authentication.
   Set a valid token using Authorization header in test "Resource get ME Data" and press "Send". 
   You'll get something that look like user information (HTTP Status 200 OK).
   ```
   * To test URI securized by ROLE (User Authority)
   ```
   Get a valid oAuth Token, you can use test "Token - password" maybe you have to adjust URI and/or authentication.
   Set a valid token using Authorization header in test "Resource get private Admin info" and press "Send". 
   You'll get an HTTP Status 200 OK and some text data.
   ```
   * To test URI securized by oauth scope 
   ```
   Get a valid oAuth Token, you can use test "Token - password". Token must contains "write" scope.
   Set a valid token using Authorization header in test "Resource get write scope info" and press "Send". 
   You'll get an HTTP Status 200 OK and some text data.
   ```
   
And you Done !!!!

### Notes:
- I use postman to test 'cause it's what I usually do :) , if you want, modify this readme adding other ways, CURL, junit, simple java ó whatever.
- Please feel free to add/modify/correct/update any part of this content as necessary

### Other Projects:
- [oAuth Server using oauth and opaque token](https://github.com/mariocuellar1/oauth-server-opaque)
- [oAuth Server using JWT Token](https://github.com/mariocuellar1/oauth-server-jwt)
- [Basic Resource Server validating JWT Token](https://github.com/mariocuellar1/basic-resource-server-jwt)

   
   
