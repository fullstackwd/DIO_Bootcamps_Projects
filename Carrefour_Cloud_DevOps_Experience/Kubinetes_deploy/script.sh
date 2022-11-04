#!/bin/bash
echo "Criando as imagens Docker........!!!!!"

docker build -t kubinete_deploy/projeto-backend:1.0 backend/.
docker build -t kubinete_deploy/projeto-database:1.0 database/.

echo "Fazendo push das imagens docker....!!!!!!"

docker push kubinete_deploy/projeto-backend:1.0
docker push kubinete_deploy/projeto-database:1.0

echo "Criando serviços no cluster Kubernetes.......!!!!"

kubectl apply -f ./services.yml

echo "Criando os deployments......!!!!!"

kubectl apply -f ./deployment.yml