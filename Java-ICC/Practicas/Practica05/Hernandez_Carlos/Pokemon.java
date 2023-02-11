import java.util.Random;

public class Pokemon {

  // ! ATRIBUTOS
  String nombre;
  String tipo;
  String estadoDeSaludo;
  double HP;
  String[] bolsita = {"oranberry", "Full Heal"};

  // ! CONSTRUCTOR
  public Pokemon(String nombre, String tipo, String estadoDeSalud, double HP ){
    this.nombre = nombre;
    this.tipo = tipo;
    this.estadoDeSaludo = estadoDeSalud;
    this.HP = HP;
  }

  // ! GETTERS AND SETTERS
  public String getNombre() {return nombre;}

  public String getTipo() {return tipo;}

  public String getEstadoDeSalud() {return estadoDeSaludo;}
  
  public double getHP() {return HP;}

  public String[] getBolsita(){return bolsita;}

  public void setNombre(String nombre) {this.nombre = nombre;}

  public void setTipo(String tipo) {this.tipo = tipo;}

  public void setEstadoDeSalud(String estadoDeSalud) {this.estadoDeSaludo = estadoDeSalud;}

  public void setHP(double HP) {this.HP = HP;}

  public void setBolsita(String bolsita){
    if (bolsita.equals("NoOranberry")){
      this.bolsita[0] = "vacio1";
    } else if (bolsita.equals("NoFullHeal")){
      this.bolsita[1] = "vacio2";
    }
  }

  // ! ENFERMEDAD
  public void probabilidadEnfermarse(Pokemon pokemon) {
    Random random = new Random();
    int probabilidad = random.nextInt(100) + 1;
    if (probabilidad >= 1 && probabilidad <= 20) {
      pokemon.setEstadoDeSalud("envenenado");
    } else if (probabilidad > 20 && probabilidad <= 50) {
      pokemon.setEstadoDeSalud("quemado");
    } else if (probabilidad > 50 && probabilidad <= 65) {
      pokemon.setEstadoDeSalud("congelado");
    } else {
      pokemon.setEstadoDeSalud("normal");
    }
  }

  // ! COMPARAR POKEMON
  // * ARRAYS PARA DETETECTAR EL TIPO DE POKEMON Y PODER COMPARAR
  String pokemonsDebilesAAcero[] = { "Hielo", "Roca", "Hada" };
  String pokemonsDebilesAVolador[] = { "Planta", "Bicho", "Lucha" };
  String pokemonsDebilesAAgua[] = { "Roca", "Tierra", "Fuego" };
  String pokemonsDebilesAHielo[] = { "Volador", "Planta", "Tierra", "Dragon" };
  String pokemonsDebilesAPlanta[] = { "Agua", "Roca", "Tierra" };
  String pokemonsDebilesABicho[] = { "Planta", "Psiquico", "Siniestro" };
  String pokemonsDebilesAElectrico[] = { "Volador", "Agua" };
  String pokemonsDebilesANormal[] = { "" };
  String pokemonsDebilesARoca[] = { "Hielo", "Volador", "Bicho", "Fuego" };
  String pokemonsDebilesATierra[] = { "Electrico", "Roca", "Fuego", "Veneno", "Acero" };
  String pokemonsDebilesAFuego[] = { "Hielo", "Planta", "Bicho", "Acero" };
  String pokemonsDebilesALucha[] = { "Hielo", "Normal", "Roca", "Siniestro", "Acero" };
  String pokemonsDebilesAHada[] = { "Lucha", "Dragon", "Siniestro" };
  String pokemonsDebilesAPsiquico[] = { "Lucha", "Veneno" };
  String pokemonsDebilesAVeneno[] = { "Planta", "Hada" };
  String pokemonsDebilesADragon[] = { "Dragon" };
  String pokemonsDebilesAFantasma[] = { "Psiquico", "Fantasma" };
  String pokemonsDebilesASiniestro[] = { "Psiquico", "Fantasma" };
  boolean comparando = true;
  public void comparaPokemones(Pokemon pokemon) {
    while (comparando) {

      // | if para comprar this -> pokemon
      if (this.getTipo().equals("Acero")) {
        for (String tipo : pokemonsDebilesAAcero) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Volador")) {
        for (String tipo : pokemonsDebilesAVolador) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Agua")) {
        for (String tipo : pokemonsDebilesAAgua) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Hielo")) {
        for (String tipo : pokemonsDebilesAHielo) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Planta")) {
        for (String tipo : pokemonsDebilesAPlanta) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Bicho")) {
        for (String tipo : pokemonsDebilesABicho) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Electrico")) {
        for (String tipo : pokemonsDebilesAElectrico) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Normal")) {
        for (String tipo : pokemonsDebilesANormal) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Roca")) {
        for (String tipo : pokemonsDebilesARoca) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Tierra")) {
        for (String tipo : pokemonsDebilesATierra) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Fuego")) {
        for (String tipo : pokemonsDebilesAFuego) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Lucha")) {
        for (String tipo : pokemonsDebilesALucha) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Hada")) {
        for (String tipo : pokemonsDebilesAHada) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Psiquico")) {
        for (String tipo : pokemonsDebilesAPsiquico) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Veneno")) {
        for (String tipo : pokemonsDebilesAVeneno) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Dragon")) {
        for (String tipo : pokemonsDebilesADragon) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Fantasma")) {
        for (String tipo : pokemonsDebilesAFantasma) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      } else if (this.getTipo().equals("Siniestro")) {
        for (String tipo : pokemonsDebilesASiniestro) {
          if (pokemon.getTipo() == tipo) {
            System.out.println(pokemon.getNombre() + " es vulnerable a " + this.getNombre());
            comparando = false;
          }
        }
      }

      if (comparando) {
        // | if para comprar pokemon -> this
        if (pokemon.getTipo().equals("Acero")) {
          for (String tipo : pokemonsDebilesAAcero) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Volador")) {
          for (String tipo : pokemonsDebilesAVolador) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Agua")) {
          for (String tipo : pokemonsDebilesAAgua) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Hielo")) {
          for (String tipo : pokemonsDebilesAHielo) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Planta")) {
          for (String tipo : pokemonsDebilesAPlanta) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Bicho")) {
          for (String tipo : pokemonsDebilesABicho) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Electrico")) {
          for (String tipo : pokemonsDebilesAElectrico) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Normal")) {
          for (String tipo : pokemonsDebilesANormal) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Roca")) {
          for (String tipo : pokemonsDebilesARoca) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Tierra")) {
          for (String tipo : pokemonsDebilesATierra) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Fuego")) {
          for (String tipo : pokemonsDebilesAFuego) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Lucha")) {
          for (String tipo : pokemonsDebilesALucha) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Hada")) {
          for (String tipo : pokemonsDebilesAHada) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Psiquico")) {
          for (String tipo : pokemonsDebilesAPsiquico) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Veneno")) {
          for (String tipo : pokemonsDebilesAVeneno) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Dragon")) {
          for (String tipo : pokemonsDebilesADragon) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Fantasma")) {
          for (String tipo : pokemonsDebilesAFantasma) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        } else if (pokemon.getTipo().equals("Siniestro")) {
          for (String tipo : pokemonsDebilesASiniestro) {
            if (this.getTipo() == tipo) {
              System.out.println(this.getNombre() + " es vulnerable a " + pokemon.getNombre());
            comparando = false;
            }
          }
        }
      }
      if (comparando){
        System.out.println("Ningun pokemon es debil ante otro :p");
        comparando = false;
      }

    }
  }

  // ! CAERSE
  public void caerse(Pokemon pokemon) {
    pokemon.setHP(pokemon.getHP() - (pokemon.getHP() * .03));
  }

  //! USAR LA BOLSITA
  public void usarBolsita(Pokemon pokemon){
    for (String objeto : bolsita) {

      if (objeto == "oranberry"){
        pokemon.HP += 30;
        pokemon.setBolsita("NoOranberry");
        System.out.println("\nEl HP de " + pokemon.nombre + " aumento 30 puntos, ahora tiene " + pokemon.HP + " puntos de vida. ");
      } else if (objeto == "vacio1"){
        System.out.println("No te quedan mas oranberry :c. ");
      }

      if (objeto == "Full Heal" && pokemon.getEstadoDeSalud() != "normal"){
        pokemon.estadoDeSaludo = "normal";
        pokemon.setBolsita("NoFullHeal");
        System.out.println("El estado de saludo de " + pokemon.nombre + " paso a normal gracias al Full Heal. ");
      } else if (objeto == "Full Heal" && pokemon.getEstadoDeSalud() == "normal") {
        System.out.println("El estado de salud de " + pokemon.nombre + " es normal, no se puede usar la Full Heal. ");
      } else if (objeto == "vacio2"){
        System.out.println("No te quedan mas Full Heal :c. ");
        break;
      }
    }
  }

  // ! toString
  public String toString() {
    return "Nombre: " + nombre + "\nTipo: " + tipo + "\nEstado de salud: " + estadoDeSaludo + "\nHP: " + HP;
  }

  public static void main(String[] args) {

    Pokemon charmander = new Pokemon("Charmander", "Fuego", "normal", 100);
    Pokemon pikachu = new Pokemon("Pikachu", "Electrico", "normal", 100);
    Pokemon onix = new Pokemon("Onix", "Tierra", "normal", 100);
    Pokemon Magikarp = new Pokemon("Magikarp", "Agua", "normal", 100);
    Pokemon dragonite = new Pokemon("Dragonite", "Dragon", "normal", 100);
    Pokemon articuno = new Pokemon("Articuno", "Hielo", "normal", 100);
    Pokemon pidgey = new Pokemon("Pidgey", "Volador", "normal", 100);

    System.out.println("\nEnfermedades a Pokemons: ");
    charmander.probabilidadEnfermarse(charmander);
    articuno.probabilidadEnfermarse(articuno);
    pidgey.probabilidadEnfermarse(pidgey);
    System.out.println("Charmander: " + charmander.estadoDeSaludo);
    System.out.println("Articuno : " + articuno.estadoDeSaludo);
    System.out.println("Pidgey : " + pidgey.estadoDeSaludo);

    System.out.println("\nLos pokemons se caen: ");
    System.out.println("Pidgey ha caido 2 veces. ");
    pidgey.caerse(pidgey);
    pidgey.caerse(pidgey);
    System.out.println("Salud de Pidgey: " + pidgey.HP);
    System.out.println("Onix ha caido. ");
    onix.caerse(onix);
    System.out.println("Salud de Onix: " + onix.HP);

    System.out.println("\nComparacion de Pokemons: ");
    charmander.comparaPokemones(Magikarp);
    onix.comparaPokemones(pikachu);
    dragonite.comparaPokemones(articuno);
    pikachu.comparaPokemones(pidgey);
    
    System.out.println("\nInformacion de los Pokemons: ");
    System.out.println(dragonite);
    System.out.println("\n" + articuno);

    System.out.println("\nUso de la bolsita: ");
    pidgey.usarBolsita(pidgey);
    System.out.println("\nSe quiere usar la bolsita en pidgey de nuevo: ");
    pidgey.usarBolsita(pidgey);
    articuno.usarBolsita(articuno);
  }
}
