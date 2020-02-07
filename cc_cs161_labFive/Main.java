//HEADER
//Program Name: Lab Five Main
//Author: Caelen Curtiss
//Class: CS 161 Winter 2020
//Date: 02/06/2020
//Description: Create, edit, and print a Person's information

class Main{
    public static void main(String[] args){
        //creates a person
       Person personOne = new Person("Jim", "Hall", 12);

       //prints person's info
      System.out.println(personOne.getInfo());

      //changes person's info
      personOne.changeInformation("Jerry", "Man", 13);
      
      //prints new information
      System.out.println(personOne.getInfo());

       
    }
}
/* FOOTER
Jim Hall 12
Jerry Man 13
*/