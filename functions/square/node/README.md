# node-square
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
riff build -n square-node -v 0.0.1 -f .
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
curl $GATEWAY/requests/square-topic -H "$HEADER" -d 8
```

Which will return:
```
8 squared is 64
```
