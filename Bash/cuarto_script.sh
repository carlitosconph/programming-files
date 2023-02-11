#!/bin/bash

if [ ! -d $1 ]; then
  echo 'Este dir no existe.'
  exit 1
fi

names=`ls $1`
total=0

for f in $names; do
  ficheros=$1/$f #(S1 -> el parametro, $f -> el iterable del for)
  if [ -f $ficheros ]; then
    bytes=`ls -l $ficheros | cut -d ' ' -f 5`
    echo 'Fichero' $ficheros 'ocupa' $bytes | tr -s /
    (( total += $bytes ))
  fi
done

echo -e '\nTotal: ' $total 'de bytes ocupados'