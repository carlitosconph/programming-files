from ntpath import join
import os
from shutil import copyfile
import time
import random
import sqlite3
from pathlib import Path
import re

SCRIPT_FILE_NAME = 'FOR YOU.txt'

def get_user_path():
  return f'{Path.home()}/'
  

def delay_action():
  time_sleep = random.randrange(1, 4)
  time.sleep(time_sleep)


def creat_hacker_file(user_path):
  hacker_file = open(user_path + 'Escritorio/'+ SCRIPT_FILE_NAME,'w')
  hacker_file.write('INICIANDO RECOPILACION DE DATOS\n\n')
  return hacker_file


def get_brave_history(user_path):
  urls = None
  while not urls:
    try: 
      history_path = user_path + '/.config/BraveSoftware/Brave-Browser/Default/History'
      temp_history = history_path + 'temp'
      copyfile(history_path, temp_history)
      connection = sqlite3.connect(temp_history)
      cursor = connection.cursor()
      cursor.execute('SELECT title, last_visit_time, url FROM urls ORDER BY last_visit_time DESC')
      urls = cursor.fetchall()
      connection.close()
      return urls
      
    except sqlite3.OperationalError:
      print('Esperando...')
      time.sleep(3)


def check_yt_and_scare_usar(hacker_file, brave_history):
  channels_visited = []
  for channel in brave_history[:350]:
    channel_results = re.findall('https://www.youtube.com/c/([A-Za-z0-9]+)$', channel[2])
    if channel_results:
      channels_visited.append(channel_results[0])

  hacker_file.write(f'Ultimamente has mirado los canales de {", ".join(channels_visited)}\n\n')



def check_twitter_and_scare_user(hacker_file, brave_history):
  profile_visited = []
  for item in brave_history[:350]:
    results = re.findall('https://twitter.com/([A-Za-z0-9]+)$', item[2])
    if results and results[0] not in ['notification', 'home']:
      profile_visited.append(results[0])

  if len(profile_visited) >= 1:
    hacker_file.write(f'Has mirado los perfiles en Twitter de {", ".join(profile_visited)}\n\n')

def check_bank_account(hacker_file, brave_history):
  his_bank = None
  banks = ['BBVA','Santander','Banamex','Banorte','Scotiabank','HSBC']
  for item in brave_history:
    for b in banks:
      if b.lower() in item[0].lower():
        his_bank = b
        break
    if his_bank:
      break
  if his_bank:
    hacker_file.write(f'Ademas, tu dinero esta en {his_bank}, cuida un poco mas tu dinero.\n\n')


def check_steam_game(hacker_file,user_path):
  try:
    game_list = []
    steam_path = f'{user_path}.local/share/Steam/steamapps/common'
    games = os.listdir(steam_path)
    for game in games:
      if game not in ['Steam Controller Configs', 'SteamLinuxRuntime','SteamLinuxRuntime_soldier','Steam.dll']:
        game_list.append(game)

    hacker_file.write(f'Tambien se que has jugado a {", ".join(game_list)}\n\n')

  except FileNotFoundError:
    print('Deberias de jugar una que otra vez, instalar un par de juegos no te vendrian mal.')


def main():

  #! Time sleep
  delay_action()
  #!Get user path
  user_path = get_user_path()
  #!Get history Brave
  brave_history = get_brave_history(user_path)
  #!Create file in desktop
  hacker_file = creat_hacker_file(user_path)
  #!Check twiiter and write message
  check_twitter_and_scare_user(hacker_file, brave_history)
  #!Check YT and write message
  check_yt_and_scare_usar(hacker_file, brave_history)
  #!Check bank account
  check_bank_account(hacker_file, brave_history)
  #!Check steam games
  check_steam_game(hacker_file,user_path)


if __name__ == '__main__':
  main()

