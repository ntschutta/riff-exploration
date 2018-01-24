# hello-node
Take input (say like a name), return "Hello " plus the input, otherwise known as Hello World. Couldn't be easier right?

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
riff build -n hello-node -v 0.0.1 -f .
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
curl $GATEWAY/requests/hello-node-topic -H "$HEADER" -d "Han"
```

Which will return:
```
Hello Han
```
Cleaning Up
---
Done saying Hello? I know it's hard to imagine such a time but it will happen. Remove your function by calling:
```
riff delete -n hello-node-function
```
And delete your queue by calling:
```
kubectl delete topic hello-node-topic
```
