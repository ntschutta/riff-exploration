# square-java
Take a number, square it and return it. Couldn't be easier right?

## Setup
This demo assumes your riff environment is setup per Brian McClain's [riff-demos](https://github.com/BrianMMcClain/riff-demos) shell script or via the instructions found on the [riff project](https://github.com/projectriff/riff) itself.

Don't forget to setup your shell environment by running the commands (if you haven't already!):

```
eval $(minikube docker-env)
export GATEWAY=`minikube service --url demo-riff-http-gateway`
export HEADER="Content-Type: text/plain"
```
Build the Function
---
```
mvn install
mvn package
riff build -n square-java -v 0.0.1 -f .
```

Apply the Function
---
```
riff apply -f .
```

Call the Function
---
To call the function:
```
curl $GATEWAY/requests/square-java-topic -H "$HEADER" -d 8
```

Which will return:
```
8.0 squared is 64.0
```
Cleaning Up
---
Done squaring numbers? I know it's hard to imagine such a time but it will happen. Remove your function by calling:
```
riff delete -n square-java-function
```
And delete your queue by calling:
```
kubectl delete topic square-java-topic
```
