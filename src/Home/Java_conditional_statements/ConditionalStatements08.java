package Home.Java_conditional_statements;

import java.util.Scanner;

public class ConditionalStatements08 {




        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your tickect: \n 1) Elite  \n 2) Gold  \n 3) Premium ");
            String movieTicket = sc.nextLine();
            System.out.println("Choose your movie type: \n 1) 2D  \n 2) 3D  \n 3) Imax ");
            String movieType = sc.nextLine();
            int price = 0;

            if(movieTicket.equals("Elite")){
                price = 150;

                switch(movieType ){


                    case "2D":
                        price += 0;
                        break;
                    case "3D":
                        price+=50;
                        break;
                    case "Imax":
                        price+=100;
                        break;
                    default:
                        System.out.println("Invalid movie type");
                }
            }else if(movieTicket.equals("Gold")){

                price = 200;

                switch(movieType ){

                    case "2D":
                        price += 0;
                        break;
                    case "3D":
                        price+=50;
                        break;
                    case "Imax":
                        price+=100;
                        break;
                    default:
                        System.out.println("Invalid movie type");
                }


            }else if(movieTicket.equals("Premium")){
                price = 250;

                switch(movieType ){


                    case "2D":
                        price += 0;
                        break;
                    case "3D":
                        price+=50;
                        break;
                    case "Imax":
                        price+=100;
                        break;
                     default:
                        System.out.println("Invalid movie type");
                }

            }else{
                System.out.println("Invalid movie ticket");

            }


            System.out.println("Total Price: " + price);
        }

}
