import java.util.Scanner;
public class chooseYourOwnAdventure 
{
  public static void main(String[] args) 
   {



    Scanner sc = new Scanner(System.in);

    System.out.println("Are you ready?");
    String start = sc.nextLine();

    // String susDecicion = sc.nextLine();




// desision Start


    // Starting If else statment
    if (start.equals("Yes"))
    {
      System.out.println("You have been traveling in space for the last 6 space months. You and 10 crewed space ships finaly arive on mars. You must choose a partner to work with Do you choose Elon musk a billionare who funded the mission or a random crewmate from the last ship to arrive? 'Elon' or 'Crewmember'");
    
      String partnerDecision = sc.nextLine();
      // If the awnser is Yes it will ask for another choice of elon or a crewmate


      // If the user chooses elon it will give you more options



      if (partnerDecision.equals("Elon"))
      {
      System.out.println("You chose elon musk. You and space Elon worked side by side for years space building your new space planet. It has been 5 space years and elon has somthing to show you. You reluctantly follow him onto his spaceship where he shows you an experimental space Teleportation device. He seems exctatic to finaly use it to travel though sapce. He eagerly asks if you will be the first to sapce try it. 'Yes' or 'No'");

        String elonsDecision = sc.nextLine();

        if (elonsDecision.equals("Yes"))
        {
        System.out.println("You decided to try the sapce machine space Elon turns it on and you get in. As you wait for it to work, Elon starts sweating, somthings wrong. The device cracks and you are split in sapce half. End");
        }

        else if (elonsDecision.equals("No"))
        {
        System.out.println("You decide that you will not risk to use it. You tell elon to test it on a sapce rock first. The machine makes a loud space noise and the space rock explodes. Elon feels sorry and you get a space tesla from him as a space gift. End");
        }
      }

    
      // If the user chooses the crewmate it will give you more options
      else if (partnerDecision.equals("Crewmember"))
      { 
      System.out.println("You chose a random space crewmember. He says his name is sapce david. You and space david work throughout each day on various tasks. You notice david seems suspiciusly quiet when asking personal sapce questions. You space wonder weather he is who he says he is. Do you report sapce david to the space group? 'Yes' 'No'");

      String crewmateDecision = sc.nextLine();

      if (crewmateDecision.equals("Yes"))
      {
      System.out.println("You tell the space group and they space agree they see him acting strange. You all go to confront him and find him in his space room. He claims space innocence but the space group is not having it. You launch his ship into space in a random sapce direction. End");
      }

      else if (crewmateDecision.equals("No"))
      {
      System.out.println("You decide sapce David must just be a little stange but nothing else. The next day as you are rewiring an eletrical sapce grid you hear space footsteps behind you. Its david. Just then his head snaps an a SUS space creature climbs out of his body and sapce eats you. End");
      }
      }



    }
    else 
    {
      System.out.println("You die a painful space death");
    }



  }
}





/*
flowchart                 -45 minutes
figure out user input     -20 minutes
starting Decision         -15 minutes
if statments              -45 minutes
text from flowchart       -10 minutes
random problems on the way-20 minutes



*/