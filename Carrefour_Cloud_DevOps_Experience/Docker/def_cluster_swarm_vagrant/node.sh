#!/bin/bash
echo Swarm Join...
sudo docker swarm join --token $(cat /vagrant/node_token) 192.168.56.200:2377