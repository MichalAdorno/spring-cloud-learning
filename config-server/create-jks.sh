#!/bin/bash
cd src/main/resources
keytool -genkeypair -alias config-server-key \
       -keyalg RSA -keysize 4096 -sigalg SHA512withRSA \
       -dname 'CN=ConfigServer,OU=SpringCloud,O=LearningOrg' \
       -keypass my-key-pass -keystore config-server.jks \
       -storepass my-store-pass