#!/usr/bin/env bash

if [ ! -d $1 ]; then
  mkdir -p $1;
fi

docker run -d --rm -p 3306:3306 --name=mysql -v $1:/var/lib/mysql \
    -e "MYSQL_ROOT_PASSWORD=d8yn3df;s9adaj" \
    -e "MYSQL_DATABASE=rep" \
    mysql:8.0.1