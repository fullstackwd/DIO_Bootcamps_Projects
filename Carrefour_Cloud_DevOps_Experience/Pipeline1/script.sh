#!/bin/bash

docker build -t pipeline1/kubernetes-projeto2-dio:1.0 app/
docker build -t pipeline1/kubernetes-projeto2-dio:1.0
kubectl apply -f ./load-balancer.yml
kubectl apply -f ./secrets.yml
kubectl apply -f ./mysql-deployments.yml --record
kubectl apply -f ./app-deployments.yml --record


