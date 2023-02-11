#!/bin/bash

echo -n 'Instalar programa? [S/N]: '
read num_1

if [[ $num_1 == [sS] ]]; then
  echo 'Gracias x participar'
elif [[ $num_1 == [nN] ]]; then
  echo 'No se instalara'
else
  echo 'OK, entiendo...'
fi