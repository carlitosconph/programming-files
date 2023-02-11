#!/bin/bash

echo -n 'Escribe un numero: '
read num_1

if [[ $num_1 -gt 5 ]]; then
  echo 'Es mayor que 5'
else
  echo 'El numero es menor a 5'
fi