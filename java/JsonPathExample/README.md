This simple code is to validate the structure of Json string object using JsonPath.

## Prerequisites

Add JsonPath dependency using Gradle
```
compile group: 'com.jayway.jsonpath', name: 'json-path', version: '2.3.0'
```

Or using maven
```
<dependency>
    <groupId>com.jayway.jsonpath</groupId>
    <artifactId>json-path</artifactId>
    <version>2.3.0</version>
</dependency>
```

`jsonPathIsExist` method validates that specific path in Json is exist or not.

`getJsonPathValue` method returns tha value of specific path in the Json. In case the path is not exist, it returns null.
