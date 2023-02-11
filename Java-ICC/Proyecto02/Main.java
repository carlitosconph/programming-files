import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Persona people[] = new Persona[15];
    Random random = new Random();

    // | MAIN FOR TO GENERATE 15 PERSONS
    for (int indexPerson = 0; indexPerson < people.length; indexPerson++) {

      int age = 0;
      String gender = "";
      String size = "";

      int randomForAge = random.nextInt(100);
      int randomForGender = random.nextInt(2);
      int randomForSize = random.nextInt(4);

      // ! AGE
      while (randomForAge < 5) {
        randomForAge = random.nextInt(100);
      }
      age = randomForAge;

      // ! GENDER
      if (randomForGender == 0) {
        gender = "Hombre";
      } else {
        gender = "Mujer";
      }

      // ! SIZE
      if (randomForSize == 0) {
        size = "S";
      } else if (randomForSize == 1) {
        size = "M";
      } else if (randomForSize == 2) {
        size = "G";
      } else {
        size = "XG";
      }

      // | GENERATE MENU FOR PERSON
      // ! PERSON SIZE XG

      int randomForSandwich90 = random.nextInt(100);
      int randomForQuesadillas70 = random.nextInt(100);
      int radomForSelectDrink = random.nextInt(2);
      int randomForSizeDrink = random.nextInt(3);

      // ! PERSON AGE 5-17
      if ((age >= 5 && age <= 17)) {
        int randomForMenu517 = random.nextInt(100) + 1;
        int randomForAdditionalDrink = random.nextInt(100) + 1;
        int randomForDrink = random.nextInt(3);
        radomForSelectDrink = random.nextInt(2);
        int radomForSelectChilaquiles = random.nextInt(2);

        if (randomForMenu517 > 0 && randomForMenu517 <= 40) {

          Menu menu = new Menu(60, 1);
          people[indexPerson] = new Persona(age, gender, size, menu);

          // ! SELECT THE FLAVOR OF THE CHILAQUILES
          if (radomForSelectChilaquiles == 0) {
            if (radomForSelectDrink == 0) {
              people[indexPerson].menu.setComida("Chilaquiles verdes", "Fruta", "Jugo");
            } else {
              people[indexPerson].menu.setComida("Chilaquiles verdes", "Fruta", "Cafe");
            }
          } else {
            if (radomForSelectDrink == 1) {
              people[indexPerson].menu.setComida("Chilaquiles rojos", "Fruta", "Jugo");
            } else {
              people[indexPerson].menu.setComida("Chilaquiles rojos", "Fruta", "Cafe");
            }
          }

          // ! ADDITIONAL DRINK 80%
          if (randomForAdditionalDrink > 0 && randomForAdditionalDrink <= 80) {
            if (randomForDrink == 0) {
              people[indexPerson].menu.setAdicionales("1", "Cafe G", "1", "Pieza de pan dulce");
              people[indexPerson].menu.setPriceAdicionales(27);
              people[indexPerson].menu.setPriceAdicionales(17);
              
            } else if (randomForDrink == 1) {
              people[indexPerson].menu.setAdicionales("1", "Te G", "0", "ninguno");
              people[indexPerson].menu.setPriceAdicionales(12);
            } else if (randomForDrink == 2) {
              people[indexPerson].menu.setAdicionales("1", "Atole G", "0", "ninguno");
              people[indexPerson].menu.setPriceAdicionales(30);
            }
          }

          // ! IF WOMEN AND 70% ADD COFFE CREAM
          if ((gender.equals("Mujer")) && people[indexPerson].menu.aperitivosAdicionales[1].equals("ninguno")) {
            int randomForWoman70 = random.nextInt(100) + 1;
            if (randomForWoman70 > 0 && randomForWoman70 <= 70) {
              if(people[indexPerson].menu.aperitivosAdicionales[2].equals("0")){
                  people[indexPerson].menu.setPriceAdicionales(3);
                  people[indexPerson].menu.aperitivosAdicionales[2] = "1";
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                } else if(people[indexPerson].menu.aperitivosAdicionales[2].equals("1")){
                  people[indexPerson].menu.setPriceAdicionales(3);
                  people[indexPerson].menu.aperitivosAdicionales[2] = "2";
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                }
            }

          }

          Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
          ticket.printTicket();

        } else if (randomForMenu517 > 40 && randomForMenu517 <= 95) {

          Menu menu = new Menu(45, 2);
          people[indexPerson] = new Persona(age, gender, size, menu);

          if (radomForSelectDrink == 0) {
            people[indexPerson].menu.setComida("Molletes", "Plato de avena", "Te");
          } else {
            people[indexPerson].menu.setComida("Molletes", "Plato de avena", "Atole");
          }

          // ! ADD ADDITIONAL DRINK
          if (randomForAdditionalDrink > 0 && randomForAdditionalDrink <= 80) {
            if (randomForDrink == 0) {
              people[indexPerson].menu.setAdicionales("1", "Cafe G", "1", "Pieza de pan dulce");
              people[indexPerson].menu.setPriceAdicionales(27);
              people[indexPerson].menu.setPriceAdicionales(17);
            } else if (randomForDrink == 1) {
              people[indexPerson].menu.setAdicionales("1", "Te G", "0", "ninguno");
              people[indexPerson].menu.setPriceAdicionales(12);
            } else if (randomForDrink == 2) {
              people[indexPerson].menu.setAdicionales("1", "Atole G", "0", "ninguno");
              people[indexPerson].menu.setPriceAdicionales(30);
            }
          }

          Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
          ticket.printTicket();

        } else {

          Menu menu = new Menu(70, 3);
          people[indexPerson] = new Persona(age, gender, size, menu);

          if (radomForSelectDrink == 0) {
            people[indexPerson].menu.setComida("Costillas de res", "Papas horneadas", "Cafe");
          } else {
            people[indexPerson].menu.setComida("Costillas de res", "Papas horneadas", "Jugo");
          }

          if (randomForAdditionalDrink > 0 && randomForAdditionalDrink <= 80) {
            if (randomForDrink == 0) {
              people[indexPerson].menu.setAdicionales("1", "Cafe G", "1", "Pieza de pan dulce");
              people[indexPerson].menu.setPriceAdicionales(27);
              people[indexPerson].menu.setPriceAdicionales(17);
            } else if (randomForDrink == 1) {
              people[indexPerson].menu.setAdicionales("1", "Te G", "0", "ninguno");
              people[indexPerson].menu.setPriceAdicionales(12);
            } else if (randomForDrink == 2) {
              people[indexPerson].menu.setAdicionales("1", "Atole G", "0", "ninguno");
              people[indexPerson].menu.setPriceAdicionales(30);
            }
          }

          if (size.equals("XG")) {
            people[indexPerson].menu.setAperitivosAdicionales("1", "Orden de cebollitas y nopales", "1",
                "crema para cafe");
            people[indexPerson].menu.setPriceAdicionales(18);

            if (randomForSandwich90 > 0 && randomForSandwich90 <= 90) {
              if (randomForSizeDrink == 0) {
                people[indexPerson].menu.setAdicionalesDos("1", "Te CH", "1", "Sandwich sencillo ");
                people[indexPerson].menu.setPriceAdicionales(43);
              } else if (randomForSizeDrink == 1) {
                people[indexPerson].menu.setAdicionalesDos("1", "Te M", "1", "Sandwich sencillo ");
                people[indexPerson].menu.setPriceAdicionales(44);
              } else if (randomForSizeDrink == 2) {
                people[indexPerson].menu.setAdicionalesDos("1", "Te G", "1", "Sandwich sencillo ");
                people[indexPerson].menu.setPriceAdicionales(45);
              }

            } else {
              if (randomForSizeDrink == 0) {
                people[indexPerson].menu.setAdicionalesDos("1", "Te CH", "0", "ninguno");
                people[indexPerson].menu.setPriceAdicionales(10);
              } else if (randomForSizeDrink == 1) {
                people[indexPerson].menu.setAdicionalesDos("1", "Te M", "0", "ninguno");
                people[indexPerson].menu.setPriceAdicionales(11);
              } else if (randomForSizeDrink == 2) {
                people[indexPerson].menu.setAdicionalesDos("1", "Te G", "0", "ninguno");
                people[indexPerson].menu.setPriceAdicionales(12);
              }

            }

            // ! IF RANDOM == 0-70% ADD QUESADILLAS
            if (randomForQuesadillas70 > 0 && randomForQuesadillas70 <= 70) {
              people[indexPerson].menu.adicionalesDos[3] += "Quesadillas";
              people[indexPerson].menu.setPriceAdicionales(20);
            }

          }

          Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
          ticket.printTicket();

        }
      } // ! PERSONs 60-99 AGE AND SIZE S
        // ? VER LAS DEMAS POSIBILIDADES (25% RESTANTES)
      else if ((age >= 60 && age <= 99) && size.equals("S")) { // !

        int randomForMenu6099 = random.nextInt(100) + 1;
        int randomForAdditionalFruitOats = random.nextInt(100) + 1;
        radomForSelectDrink = random.nextInt(2);

        if (randomForMenu6099 > 0 && randomForMenu6099 <= 75) {
          Menu menu = new Menu(45, 2);
          people[indexPerson] = new Persona(age, gender, size, menu);

          if (radomForSelectDrink == 0) {
            people[indexPerson].menu.setComida("Molletes", "Plato de avena", "Te");
          } else {
            people[indexPerson].menu.setComida("Molletes", "Plato de avena", "Atole");
          }

          if (randomForAdditionalFruitOats > 0 && randomForAdditionalFruitOats <= 60) {
            people[indexPerson].menu.setAperitivosAdicionales("1", "Fruta", "0", "ninguno");
            people[indexPerson].menu.setPriceAdicionales(10);
          }

          Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
          ticket.printTicket();

        } else { // ! CUANDO NO ES MENU 2

          int randomForSelectMenu = random.nextInt(2);

          if (randomForSelectMenu == 0) {
            radomForSelectDrink = random.nextInt(2);
            int radomForSelectChilaquiles = random.nextInt(2);

            Menu menu = new Menu(60, 1);
            people[indexPerson] = new Persona(age, gender, size, menu);

            if (radomForSelectChilaquiles == 0) {
              if (radomForSelectDrink == 0) {
                people[indexPerson].menu.setComida("Chilaquiles verdes", "Fruta", "Jugo");
              } else {
                people[indexPerson].menu.setComida("Chilaquiles verdes", "Fruta", "Cafe");
              }
            } else {
              if (radomForSelectDrink == 1) {
                people[indexPerson].menu.setComida("Chilaquiles rojos", "Fruta", "Jugo");
              } else {
                people[indexPerson].menu.setComida("Chilaquiles rojos", "Fruta", "Cafe");
              }
            }

            if ((gender.equals("Mujer"))) {
              int randomForWoman70 = random.nextInt(100) + 1;
              if (randomForWoman70 > 0 && randomForWoman70 <= 70) {
                if(people[indexPerson].menu.aperitivosAdicionales[2].equals("0")){
                  people[indexPerson].menu.setPriceAdicionales(3);
                  people[indexPerson].menu.aperitivosAdicionales[2] = "1";
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                } else if(people[indexPerson].menu.aperitivosAdicionales[2].equals("1")){
                  people[indexPerson].menu.setPriceAdicionales(3);
                  people[indexPerson].menu.aperitivosAdicionales[2] = "2";
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                }
              }

            }

            Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
            ticket.printTicket();

          } else {

            radomForSelectDrink = random.nextInt(2);

            Menu menu = new Menu(70, 3);
            people[indexPerson] = new Persona(age, gender, size, menu);

            if (radomForSelectDrink == 0) {
              people[indexPerson].menu.setComida("Costilla de res", "Papas horneadas", "Cafe");
            } else {
              people[indexPerson].menu.setComida("Costilla de res", "Papas horneadas", "Jugo");
            }

            Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
            ticket.printTicket();

          }
        }

      } else {
        // ! CUANDO LAS CONDICIONES NO SE EFECTUAN POR UNO U OTRA RAZON
        int randomForSelectMenu = random.nextInt(3);

        if (randomForSelectMenu == 0) {
          radomForSelectDrink = random.nextInt(2);
          int radomForSelectChilaquiles = random.nextInt(2);
          int randomForSelectAdditionalDrink = random.nextInt(2);
          int randomForSelectAdditionalFood = random.nextInt(2);

          String additionalDrink = "ninguno";
          String additionalFood = "ninguno";
          String counterAdditionalDrink = "0";
          String counterAdditionalFood = "0";

          Menu menu = new Menu(60, 1);
          people[indexPerson] = new Persona(age, gender, size, menu);

          if (radomForSelectChilaquiles == 0) {
            if (radomForSelectDrink == 0) {
              people[indexPerson].menu.setComida("Chilaquiles verdes", "Fruta", "Jugo");
            } else {
              people[indexPerson].menu.setComida("Chilaquiles verdes", "Fruta", "Cafe");
            }
          } else {
            if (radomForSelectDrink == 1) {
              people[indexPerson].menu.setComida("Chilaquiles rojos", "Fruta", "Jugo");
            } else {
              people[indexPerson].menu.setComida("Chilaquiles rojos", "Fruta", "Cafe");
            }
          }

          // ! 0 == ADDITIONAL DRINK AND ADDITIONAL FOOD
          if (randomForSelectAdditionalDrink == 0) {
            int randomForNewDrink = random.nextInt(3);
            int randomForSelectSizeDrink = random.nextInt(3);

            if (randomForNewDrink == 0) {
              // =cafe
              if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Cafe CH";
                people[indexPerson].menu.setPriceAdicionales(15);
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
              } else if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Cafe M";
                people[indexPerson].menu.setPriceAdicionales(22);
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
              } else {
                additionalDrink = "Cafe G";
                people[indexPerson].menu.setPriceAdicionales(27);
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
              }
            } else if (randomForNewDrink == 1) {
              // =te
              if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Te CH";
                people[indexPerson].menu.setPriceAdicionales(10);
              } else if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Te M";
                people[indexPerson].menu.setPriceAdicionales(11);
              } else {
                additionalDrink = "Te G";
                people[indexPerson].menu.setPriceAdicionales(12);
              }
            } else {
              // =atole
              if (randomForSelectSizeDrink == 2) {
                additionalDrink = "Atole CH";
                people[indexPerson].menu.setPriceAdicionales(20);
              } else if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Atole M";
                people[indexPerson].menu.setPriceAdicionales(25);
              } else {
                additionalDrink = "Atole G";
                people[indexPerson].menu.setPriceAdicionales(30);
              }
            }
            counterAdditionalDrink = "1";
          }

          if (randomForSelectAdditionalFood == 0) {
            int randomForNewFood = random.nextInt(4);

            if (randomForNewFood == 0) {
              // =sandwich
              additionalFood = "Sandwich sencillo";
              people[indexPerson].menu.setPriceAdicionales(33);

            } else if (randomForNewFood == 1) {
              // =quesadillas
              additionalFood = "Quesadillas";
              people[indexPerson].menu.setPriceAdicionales(20);

            } else if (randomForNewFood == 2) {
              // = pan
              additionalFood = "Pieza de pan dulce";
              people[indexPerson].menu.setPriceAdicionales(17);
            } else {
              // = crema para cafe
              additionalFood = "Crema para cafe";
              people[indexPerson].menu.setPriceAdicionales(3);
            }
            counterAdditionalFood = "1";
          }

          people[indexPerson].menu.setAdicionales(counterAdditionalDrink, additionalDrink, counterAdditionalFood,
              additionalFood);

          // ! APERITIVOS ADICIONALES
          int randomForSelectIfAdditionalFruit = random.nextInt(2);
          int randomForSelectIfAdditionalCoffeCream = random.nextInt(2);

          String aperitivoAdditionalDrink = "ninguno";
          String aperitivoAdditionalFood = "ninguno";
          String counterAperitivoAdditionalDrink = "0";
          String counterAperitivoAdditionalFood = "0";

          if (randomForSelectIfAdditionalFruit == 0) {
            aperitivoAdditionalFood = "Miel y granola";
            counterAperitivoAdditionalFood = "1";
            people[indexPerson].menu.setPriceAdicionales(5);
          }
          if (randomForSelectIfAdditionalCoffeCream == 0) {
            aperitivoAdditionalDrink = "Crema para cafe";
            counterAperitivoAdditionalDrink = "1";
            people[indexPerson].menu.setPriceAdicionales(3);
          }

          people[indexPerson].menu.setAperitivosAdicionales(counterAperitivoAdditionalFood, aperitivoAdditionalFood,
              counterAperitivoAdditionalDrink, aperitivoAdditionalDrink);

          if ((gender.equals("Mujer"))) {
            int randomForWoman70 = random.nextInt(100) + 1;
            if (randomForWoman70 > 0 && randomForWoman70 <= 70) {
              if(people[indexPerson].menu.aperitivosAdicionales[2].equals("0")){
                  people[indexPerson].menu.aperitivosAdicionales[2] = "1";
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                  people[indexPerson].menu.setPriceAdicionales(3);
                } else if(people[indexPerson].menu.aperitivosAdicionales[2].equals("1")){
                  people[indexPerson].menu.aperitivosAdicionales[2] = "2";
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                  people[indexPerson].menu.setPriceAdicionales(3);
                }
            }

          }

          Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
          ticket.printTicket();

          // ! cuando se pide el menu 2
        } else if (randomForSelectMenu == 1) {

          radomForSelectDrink = random.nextInt(2);
          int randomForSelectAdditionalDrink = random.nextInt(2);
          int randomForSelectAdditionalFood = random.nextInt(2);

          String additionalDrink = "ninguno";
          String additionalFood = "ninguno";
          String counterAdditionalDrink = "0";
          String counterAdditionalFood = "0";

          Menu menu = new Menu(45, 2);
          people[indexPerson] = new Persona(age, gender, size, menu);

          if (radomForSelectDrink == 0) {
            people[indexPerson].menu.setComida("Molletes", "Plato de avena", "Te");
          } else {
            people[indexPerson].menu.setComida("Molletes", "Plato de avena", "Atole");
          }

          // ! 0 == ADDITIONAL DRINK AND ADDITIONAL FOOD
          if (randomForSelectAdditionalDrink == 0) {
            int randomForNewDrink = random.nextInt(3);
            int randomForSelectSizeDrink = random.nextInt(3);

            if (randomForNewDrink == 0) {
              // =cafe
              if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Cafe CH";
                people[indexPerson].menu.setPriceAdicionales(15);
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
              } else if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Cafe M";
                people[indexPerson].menu.setPriceAdicionales(22);
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
              } else {
                additionalDrink = "Cafe G";
                people[indexPerson].menu.setPriceAdicionales(27);
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
              }
            } else if (randomForNewDrink == 1) {
              // =te
              if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Te CH";
                people[indexPerson].menu.setPriceAdicionales(10);
              } else if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Te M";
                people[indexPerson].menu.setPriceAdicionales(11);
              } else {
                additionalDrink = "Te G";
                people[indexPerson].menu.setPriceAdicionales(12);
              }
            } else {
              // =atole
              if (randomForSelectSizeDrink == 2) {
                additionalDrink = "Atole CH";
                people[indexPerson].menu.setPriceAdicionales(20);
              } else if (randomForSelectSizeDrink == 0) {
                additionalDrink = "Atole M";
                people[indexPerson].menu.setPriceAdicionales(25);
              } else {
                additionalDrink = "Atole G";
                people[indexPerson].menu.setPriceAdicionales(30);
              }
            }
            counterAdditionalDrink = "1";
          }

          if (randomForSelectAdditionalFood == 0) {
            int randomForNewFood = random.nextInt(4);

            if (randomForNewFood == 0) {
              // =sandwich
              additionalFood = "Sandwich sencillo";
              people[indexPerson].menu.setPriceAdicionales(33);

            } else if (randomForNewFood == 1) {
              // =quesadillas
              additionalFood = "Quesadillas";
              people[indexPerson].menu.setPriceAdicionales(20);

            } else if (randomForNewFood == 2) {
              // = pan
              additionalFood = "Pieza de pan dulce";
              people[indexPerson].menu.setPriceAdicionales(17);
            } else {
              // = crema para cafe
              additionalFood = "Crema para cafe";
              people[indexPerson].menu.setPriceAdicionales(3);
            }
            counterAdditionalFood = "1";
          }

          people[indexPerson].menu.setAdicionales(counterAdditionalDrink, additionalDrink, counterAdditionalFood,
              additionalFood);

          // ! APERITIVOS ADICIONALES
          int randomForSelectIfAdditionalFruit = random.nextInt(2);

          String aperitivoAdditionalDrink = "ninguno";
          String aperitivoAdditionalFood = "ninguno";
          String counterAperitivoAdditionalDrink = "0";
          String counterAperitivoAdditionalFood = "0";

          if (randomForSelectIfAdditionalFruit == 0) {
            aperitivoAdditionalFood = "Fruta";
            counterAperitivoAdditionalFood = "1";
            people[indexPerson].menu.setPriceAdicionales(10);
          }

          people[indexPerson].menu.setAperitivosAdicionales(counterAperitivoAdditionalFood, aperitivoAdditionalFood,
              counterAperitivoAdditionalDrink, aperitivoAdditionalDrink);

          Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
          ticket.printTicket();

          // ! se pide el menu 3
        } else if (randomForSelectMenu == 2) {

          if (size.equals("XG")) {
            Menu menu = new Menu(70, 3);
            people[indexPerson] = new Persona(age, gender, size, menu);

            // | RANDOM FOR DRINK AND ADDITIONAL
            if (radomForSelectDrink == 0) {
              people[indexPerson].menu.setComida("Costilla de res", "Papas horneadas", "Cafe");
              people[indexPerson].menu.setAperitivosAdicionales("1", "Orden de cebollitas y nopales", "1",
                  "crema para cafe");
              people[indexPerson].menu.setPriceAdicionales(18);
            } else {
              people[indexPerson].menu.setComida("Costilla de res", "Papas horneadas", "Jugo");
              people[indexPerson].menu.setAperitivosAdicionales("1", "Orden de cebollitas y nopales", "1",
                  "crema para cafe");
              people[indexPerson].menu.setPriceAdicionales(18);
            }
            // | CHOSE SIZE OF THE ADDITIONAL DRINK AND ADDITIONAL FOOD

            if (randomForSandwich90 > 0 && randomForSandwich90 <= 90) {
              if (randomForSizeDrink == 0) {
                people[indexPerson].menu.setAdicionales("1", "Te CH", "1", "Sandwich sencillo");
                people[indexPerson].menu.setPriceAdicionales(43);
              } else if (randomForSizeDrink == 1) {
                people[indexPerson].menu.setAdicionales("1", "Te M", "1", "Sandwich sencillo");
                people[indexPerson].menu.setPriceAdicionales(44);
              } else if (randomForSizeDrink == 2) {
                people[indexPerson].menu.setAdicionales("1", "Te G", "1", "Sandwich sencillo");
                people[indexPerson].menu.setPriceAdicionales(45);
              }

            } else {
              if (randomForSizeDrink == 0) {
                people[indexPerson].menu.setAdicionales("1", "Te CH", "0", "ninguno");
                people[indexPerson].menu.setPriceAdicionales(10);
              } else if (randomForSizeDrink == 1) {
                people[indexPerson].menu.setAdicionales("1", "Te M", "0", "ninguno");
                people[indexPerson].menu.setPriceAdicionales(11);
              } else if (randomForSizeDrink == 2) {
                people[indexPerson].menu.setAdicionales("1", "Te G", "0", "ninguno");
                people[indexPerson].menu.setPriceAdicionales(12);
              }

            }

            // ! IF RANDOM == 0-70% ADD QUESADILLAS
            if (randomForQuesadillas70 > 0 && randomForQuesadillas70 <= 70) {
              people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Quesadillas");
              people[indexPerson].menu.setPriceAdicionales(20);
            }

            Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
            ticket.printTicket();

          } else {
            radomForSelectDrink = random.nextInt(2);
            int randomForSelectAdditionalDrink = random.nextInt(2);
            int randomForSelectAdditionalFood = random.nextInt(2);

            String additionalDrink = "ninguno";
            String additionalFood = "ninguno";
            String counterAdditionalDrink = "0";
            String counterAdditionalFood = "0";

            Menu menu = new Menu(70, 3);
            people[indexPerson] = new Persona(age, gender, size, menu);

            if (radomForSelectDrink == 0) {
              people[indexPerson].menu.setComida("Costilla de res", "Papas horneadas", "Cafe");
            } else {
              people[indexPerson].menu.setComida("Costilla de res", "Papas horneadas", "Jugo");
            }

            // ! 0 == ADDITIONAL DRINK AND ADDITIONAL FOOD
            if (randomForSelectAdditionalDrink == 0) {
              int randomForNewDrink = random.nextInt(3);
              int randomForSelectSizeDrink = random.nextInt(3);

              if (randomForNewDrink == 0) {
                // =cafe
                if (randomForSelectSizeDrink == 0) {
                  additionalDrink = "Cafe CH";
                  people[indexPerson].menu.setPriceAdicionales(15);
                  people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
                } else if (randomForSelectSizeDrink == 0) {
                  additionalDrink = "Cafe M";
                  people[indexPerson].menu.setPriceAdicionales(22);
                  people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
                } else {
                  additionalDrink = "Cafe G";
                  people[indexPerson].menu.setPriceAdicionales(27);
                  people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "1", "Pieza de pan dulce");
                people[indexPerson].menu.setPriceAdicionales(17);
                }
              } else if (randomForNewDrink == 1) {
                // =te
                if (randomForSelectSizeDrink == 0) {
                  additionalDrink = "Te CH";
                  people[indexPerson].menu.setPriceAdicionales(10);
                } else if (randomForSelectSizeDrink == 0) {
                  additionalDrink = "Te M";
                  people[indexPerson].menu.setPriceAdicionales(11);
                } else {
                  additionalDrink = "Te G";
                  people[indexPerson].menu.setPriceAdicionales(12);
                }
              } else {
                // =atole
                if (randomForSelectSizeDrink == 2) {
                  additionalDrink = "Atole CH";
                  people[indexPerson].menu.setPriceAdicionales(20);
                } else if (randomForSelectSizeDrink == 0) {
                  additionalDrink = "Atole M";
                  people[indexPerson].menu.setPriceAdicionales(25);
                } else {
                  additionalDrink = "Atole G";
                  people[indexPerson].menu.setPriceAdicionales(30);
                }
              }
              counterAdditionalDrink = "1";
            }

            if (randomForSelectAdditionalFood == 0) {
              int randomForNewFood = random.nextInt(4);

              if (randomForNewFood == 0) {
                // =sandwich
                additionalFood = "Sandwich sencillo";
                people[indexPerson].menu.setPriceAdicionales(33);

              } else if (randomForNewFood == 1) {
                // =quesadillas
                additionalFood = "Quesadillas";
                people[indexPerson].menu.setPriceAdicionales(20);

              } else if (randomForNewFood == 2) {
                // = pan
                additionalFood = "Pieza de pan dulce";
                people[indexPerson].menu.setPriceAdicionales(17);
              } else {
                // = crema para cafe
                additionalFood = "Crema para cafe";
                people[indexPerson].menu.setPriceAdicionales(3);
              }
              counterAdditionalFood = "1";
            }

            people[indexPerson].menu.setAdicionales(counterAdditionalDrink, additionalDrink, counterAdditionalFood,
                additionalFood);

            // ! APERITIVOS ADICIONALES
            int randomForSelectIfAdditionalFruit = random.nextInt(2);
            int randomForSelectIfAdditionalCoffeCream = random.nextInt(2);

            String aperitivoAdditionalDrink = "ninguno";
            String aperitivoAdditionalFood = "ninguno";
            String counterAperitivoAdditionalDrink = "0";
            String counterAperitivoAdditionalFood = "0";

            if (randomForSelectIfAdditionalFruit == 0) {
              aperitivoAdditionalFood = "Orden de cebollitas y nopales";
              counterAperitivoAdditionalFood = "1";
              people[indexPerson].menu.setPriceAdicionales(15);
            }
            if (randomForSelectIfAdditionalCoffeCream == 0) {
              aperitivoAdditionalDrink = "Crema para cafe";
              counterAperitivoAdditionalDrink = "1";
              people[indexPerson].menu.setPriceAdicionales(3);
            }

            people[indexPerson].menu.setAperitivosAdicionales(counterAperitivoAdditionalFood, aperitivoAdditionalFood,
                counterAperitivoAdditionalDrink, aperitivoAdditionalDrink);

            if(gender.equals("Hombre") && (age >= 30 && age <= 40) && size.equals("G") && people[indexPerson].menu.adicionales[3].equals("Cafe")){
              int randomForPan = random.nextInt(100)+1;
              if (randomForPan > 0 && randomForPan <= 90){
                people[indexPerson].menu.setAdicionalesDos("0", "ninguno", "3", "Pieza de pan dulce");

                if(people[indexPerson].menu.aperitivosAdicionales[3].equals("Crema para cafe")){
                  people[indexPerson].menu.aperitivosAdicionales[2] = "3";
                  people[indexPerson].menu.setPriceAdicionales(6);
                } else {
                  people[indexPerson].menu.aperitivosAdicionales[3] = "Crema para cafe";
                  people[indexPerson].menu.aperitivosAdicionales[2] = "3";
                  people[indexPerson].menu.setPriceAdicionales(6);
                }
              }
            }

            Ticket ticket = new Ticket(people[indexPerson], menu, indexPerson);
            //System.out.println(ticket);
            ticket.printTicket();
          }

        }
      }
    }

    // ! prueba de mis otras clases
    /*
     * Menu menuPersona = new Menu(14, 1, "Ninguno", 0);
     * Persona persona = new Persona(14, "Homber", "CH", menuPersona);
     * Ticket ticket1 = new Ticket(persona, menuPersona);
     * System.out.println(ticket1);
     */

    /* // ! print array
    for (int i = 0; i < people.length; i++) {
      System.out.println(people[i]);
    } */

  }
}