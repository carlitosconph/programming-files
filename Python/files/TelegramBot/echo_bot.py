import telebot

bot = telebot.TeleBot("5905395111:AAF58ArFkofRU6tluP-z71VkDqnt0jZjg4k")

@bot.message_handler(commands=['start', 'help'])
def send_welcome(message):
	bot.reply_to(message, "Howdy, how are you doing?")

@bot.message_handler(func=lambda message: True)
def echo_all(message):
	bot.reply_to(message, message.text)

bot.infinity_polling()