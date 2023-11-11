package examen1p1_joseseron;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jose Seron
 */
public class Examen1P1_JoseSeron {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        int randon2 = new Random().nextInt(25, 35);
        System.out.println(randon2);

//        int random = new Random().nextInt((max - min) + 1) + min;
        boolean bandera = true;

        System.out.println("<-------LABORATORIO N------->");

        while (bandera) {
            int opcion = 0;
            System.out.println("Ingrese el ejercicio de desea ejecutar: ");
            System.out.println("1--> Fight or Flight");
            System.out.println("2--> Tri Fuerza");
            System.out.println("3--> Salir del programa");
            opcion = input.nextInt();

            while (opcion < 1 || opcion > 4) {
                System.out.println("Ingrese una opcion valida (1, 2, 3, 4)");
                opcion = input.nextInt();
            }

            switch (opcion) {
                case 1:
                    boolean bandera1 = true;
                    while (bandera1) {
                        int opcion1;

                        {//inicia fight or flight
                            char maestriaChar = 00;
                            String maestriaStr = "";
                            boolean bandera3 = true;

                            int distanciaZombie = 0, balas = 25, vidaZombie = 25, vidaJugador = 25, probInicial = 65, probPrincipiante = 65 + 0, probIntermedio = 65 + 5, probExperto = 65 + 15;


                            System.out.println("Ingrese Maestría");
                            System.out.println("1--> Principiante (0% extra hit damage)");
                            System.out.println("2--> Intermedio (5% extra hit damage)");
                            System.out.println("3--> Experto (15% extra hit damage)");

                            maestriaStr = stringInput.next();
                            //System.out.println(maestriaStr);
                            maestriaChar = maestriaStr.charAt(0);
                            if (maestriaChar < 49 || maestriaChar > 51) {
                                while (maestriaChar < 49 || maestriaChar > 51) {

                                    System.out.println("Ingrese una opcion valida (1-3)");
                                    maestriaStr = stringInput.next();
                                    maestriaChar = maestriaStr.charAt(0);

                                }//fin wh
                            } //fin if

                            if (maestriaChar == 49) {
                                int distanciaInicial = new Random().nextInt(15, 30);
                                while ((vidaZombie > 0 || vidaJugador > 0 || balas > 0) && bandera3) {
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-------------Inicio Ronda-------------");

                                    if (vidaZombie == 25 && vidaJugador == 25 && balas == 25) {
                                        distanciaZombie = distanciaInicial;
                                    }

                                    System.out.println("");

                                    System.out.println("El zombie se encuentra a: " + distanciaZombie + " metros");
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println("");

                                    int probTiro = new Random().nextInt(100);
                                    int daño = new Random().nextInt(1, 7);
                                    int distanciaRecorrida = new Random().nextInt(3, 5);

                                    if (probTiro < 64) { //si el tiro pega

                                        System.out.println("Hit! El jugador ha reducido el HP del zombie por un total de: " + daño + " HP");

                                        vidaZombie = vidaZombie - daño;
                                        if (vidaZombie <= 0) {
                                            vidaZombie = 0;
                                        }
                                        System.out.println("HP zombie: " + vidaZombie);
                                        balas = balas - 1;
                                        distanciaZombie = distanciaZombie - 0;
                                        System.out.println("El zombie se encuentra a: " + distanciaZombie + " metros");
                                    } else { //no pega el tiro
                                        System.out.println("Miss! el jugador fallo el tiro!");

                                        distanciaZombie = distanciaZombie - distanciaRecorrida;
                                        if (distanciaZombie <= 0) {
                                            distanciaZombie = 0;
                                        }
                                        System.out.println("El zombie se encuentra a : " + distanciaZombie + " metros");

                                    }

                                    if (balas < 1) {
                                        System.out.println("");
                                        System.out.println("El jugador se quedo sin balas, el zombie gana");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    } else if (vidaZombie < 1) {
                                        System.out.println("");
                                        System.out.println("El jugador logro matar al Zombie, el jugador gana");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    } else if (distanciaZombie < 1) {
                                        System.out.println("");
                                        System.out.println("El zombie logro matar al jugador");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-------------Fin Ronda-------------");

                                    System.out.println("");
                                    System.out.println("Desea continuar a la siguiente ronda? (S/N)");
                                    char continuar = stringInput.next().charAt(0);
                                    if (continuar == 'N') {
                                        bandera3 = false;
                                    }
                                }
                            } else if (maestriaChar == 50) {

                                int distanciaInicial = new Random().nextInt(15, 30);
                                while ((vidaZombie > 0 || vidaJugador > 0 || balas > 0) && bandera3) {
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-------------Inicio Ronda-------------");

                                    if (vidaZombie == 25 && vidaJugador == 25 && balas == 25) {
                                        distanciaZombie = distanciaInicial;
                                    }

                                    System.out.println("");

                                    System.out.println("El zombie se encuentra a: " + distanciaZombie + " metros");
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println("");

                                    int probTiro = new Random().nextInt(100);
                                    int daño = new Random().nextInt(1, 7);
                                    int distanciaRecorrida = new Random().nextInt(3, 5);

                                    if (probTiro < 70) { //si el tiro pega

                                        System.out.println("Hit! El jugador ha reducido el HP del zombie por un total de: " + daño + " HP");

                                        vidaZombie = vidaZombie - daño;
                                        if (vidaZombie <= 0) {
                                            vidaZombie = 0;
                                        }
                                        System.out.println("HP zombie: " + vidaZombie);
                                        balas = balas - 1;
                                        distanciaZombie = distanciaZombie - 0;
                                        System.out.println("El zombie se encuentra a: " + distanciaZombie + " metros");
                                    } else { //no pega el tiro
                                        System.out.println("Miss! el jugador fallo el tiro!");

                                        distanciaZombie = distanciaZombie - distanciaRecorrida;
                                        if (distanciaZombie <= 0) {
                                            distanciaZombie = 0;
                                        }
                                        System.out.println("El zombie se encuentra a : " + distanciaZombie + " metros");

                                    }

                                    if (balas < 1) {
                                        System.out.println("");
                                        System.out.println("El jugador se quedo sin balas, el zombie gana");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    } else if (vidaZombie < 1) {
                                        System.out.println("");
                                        System.out.println("El jugador logro matar al Zombie, el jugador gana");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    } else if (distanciaZombie < 1) {
                                        System.out.println("");
                                        System.out.println("El zombie logro matar al jugador");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-------------Fin Ronda-------------");

                                    System.out.println("");
                                    System.out.println("Desea continuar a la siguiente ronda? (S/N)");
                                    char continuar = stringInput.next().charAt(0);
                                    if (continuar == 'N') {
                                        bandera3 = false;
                                    }
                                }

                            } else if (maestriaChar == 51) {

                                int distanciaInicial = new Random().nextInt(15, 30);
                                while ((vidaZombie > 0 || vidaJugador > 0 || balas > 0) && bandera3) {
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-------------Inicio Ronda-------------");

                                    if (vidaZombie == 25 && vidaJugador == 25 && balas == 25) {
                                        distanciaZombie = distanciaInicial;
                                    }

                                    System.out.println("");

                                    System.out.println("El zombie se encuentra a: " + distanciaZombie + " metros");
                                    System.out.println("El jugador cuenta con " + balas + " balas");
                                    System.out.println("");

                                    int probTiro = new Random().nextInt(100);
                                    int daño = new Random().nextInt(1, 7);
                                    int distanciaRecorrida = new Random().nextInt(3, 5);

                                    if (probTiro < 80) { //si el tiro pega

                                        System.out.println("Hit! El jugador ha reducido el HP del zombie por un total de: " + daño + " HP");

                                        vidaZombie = vidaZombie - daño;
                                        if (vidaZombie <= 0) {
                                            vidaZombie = 0;
                                        }
                                        System.out.println("HP zombie: " + vidaZombie);
                                        balas = balas - 1;
                                        distanciaZombie = distanciaZombie - 0;
                                        System.out.println("El zombie se encuentra a: " + distanciaZombie + " metros");
                                    } else { //no pega el tiro
                                        System.out.println("Miss! el jugador fallo el tiro!");

                                        distanciaZombie = distanciaZombie - distanciaRecorrida;
                                        if (distanciaZombie <= 0) {
                                            distanciaZombie = 0;
                                        }
                                        System.out.println("El zombie se encuentra a : " + distanciaZombie + " metros");

                                    }

                                    if (balas < 1) {
                                        System.out.println("");
                                        System.out.println("El jugador se quedo sin balas, el zombie gana");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    } else if (vidaZombie < 1) {
                                        System.out.println("");
                                        System.out.println("El jugador logro matar al Zombie, el jugador gana");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    } else if (distanciaZombie < 1) {
                                        System.out.println("");
                                        System.out.println("El zombie logro matar al jugador");
                                        System.out.println("");
                                        bandera3 = false;
                                        break;
                                    }

                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("-------------Fin Ronda-------------");

                                    System.out.println("");
                                    System.out.println("Desea continuar a la siguiente ronda? (S/N)");
                                    char continuar = stringInput.next().charAt(0);
                                    if (continuar == 'N') {
                                        bandera3 = false;
                                    }
                                }
                            }

                        }// fin fight or flight
                        //Codigo del ejercicio

                        System.out.println("Desea continuar con este programa? (0-SI, 1-NO)");
                        opcion1 = input.nextInt();

                        while (opcion1 < 0 || opcion1 > 1) {
                            System.out.println("Ingrese una opcion valida (0-SI, 1-NO)");
                            opcion1 = input.nextInt();
                        }

                        if (opcion1 == 1) {
                            bandera1 = false;
                        }

                        System.out.println("");
                    }
                    break;
                case 2:
                    boolean bandera2 = true;
                    while (bandera2) {
                        int opcion1;

                        //Codigo del ejercicio
                        
                        triforce();
                        
                        
                        
                        System.out.println("Desea continuar con este programa? (0-SI, 1-NO)");
                        opcion1 = input.nextInt();

                        while (opcion1 < 0 || opcion1 > 1) {
                            System.out.println("Ingrese una opcion valida (0-SI, 1-NO)");
                            opcion1 = input.nextInt();
                        }

                        if (opcion1 == 1) {
                            bandera2 = false;
                        }

                        System.out.println("");
                    }

                    break;

                case 3:
                    System.out.println("Saliendo...");
                    bandera = false;
                    break;

                default:
                    throw new AssertionError();
            }

        }

    }

    public static void triforce() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
            int num = input.nextInt();

            boolean bandera = true;
            
        int numRevisado = (num / 2) % 2;

        while (bandera) {
            if (numRevisado != 1) {
                System.out.println("Ingrese un numero valido: (un numero par cuyo resultado el dividir entre 2 sea un numero impar)");
                num = input.nextInt();
            }
            bandera = false;
        }
      
        int n = (num / 2) + 1; //16
        int m = ((num / 2) + 1 + (num / 2)); //31
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (j == (num / 2) && i == 0) {
                    System.out.print("*");
                } else if (i > 0 && j > (num / 2) && (j == (num / 2) + i) || (j == (num / 2) - i)) {
                    System.out.print("*");
                } else if ( (i > n/2 ) && ( j == i-1 ) || (i > n/2 ) && ( j == m-i)  )  {
                    System.out.print("*");
                } else if(i == ((n/2)-1) && (j> n/2 && j < num - (n/2) )){
                    System.out.print("*");
                } else if (i == n - 1 && j == n-1) {
                    System.out.print(" ");
                } else if (i == n - 1 && (j >= 0 && j < m)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println("");
        }

        System.out.println("");



            
}
    
    

}
