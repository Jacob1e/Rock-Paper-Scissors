import java.util.Scanner;

public class RockPaperScissors 
{

  Scanner userInput=new Scanner(System.in);  
  String playAgain;
   
  public void StartGame(String playerAmove,String playerBmove)
  {
      switch (playerAmove) {
          case "R":
          case "r":
              switch (playerBmove) {
                  case "S":
                  case "s":
                      System.out.println("Rock breaks Scissors");
                      System.out.println("playerA wins");
                      break;
                  case "R":
                  case "r":
                      System.out.println("Rock vs Rock it's a Tie! ");
                      break;
                  default:
                      System.out.println("Paper covers Rock");
                      System.out.println("playerB wins");
                      break;
              }     break;
          case "P":
          case "p":
              if(playerBmove.equals("R")||playerBmove.equals("r"))
              {
                  System.out.println("Paper covers Rock");
                  System.out.println("playerA wins");
              }
              else if(playerBmove.equals("P")||playerBmove.equals("p"))
                  System.out.println("Paper vs Paper it's a Tie! ");
              
              else
              {
                  System.out.println("Scissors cuts Paper\n");
                  System.out.println("playerB wins");
              }       break;
          default:
      switch (playerBmove) {
          case "P":
          case "p":
              System.out.println("Scissors cuts Paper");
              System.out.println("playerA wins");
              break;
          case "S":
          case "s":
              System.out.println("Scissors vs Scissors it's a Tie! ");
              break;
          default:
              System.out.println("Rock breaks Scissors");
              System.out.println("playerB wins");
              break;
      }
break;
      }
     
     
         
  }
  public void playerMove()
  {
    String playerAmove,playerBmove;

    for(;;) 
    {
   
    for(;;) 
    {
    System.out.println("Enter Move for player A");
    playerAmove=userInput.next();
     
      if(playerAmove.equals("R")||playerAmove.equals("P")||playerAmove.equals("S")     
          ||playerAmove.equals("r")||playerAmove.equals("p")||playerAmove.equals("s"))
      break;
      else
      {
        System.out.println("Enter a valid input(R or P or S or r or p or s");
      }
      }
      for(;;)
      {
      System.out.println("Enter Move for player B");
      playerBmove=userInput.next();
       
      if(playerBmove.equals("R")||playerBmove.equals("P")||playerBmove.equals("S")
          ||playerBmove.equals("r")||playerBmove.equals("p")||playerBmove.equals("s"))
      break;
    else
    {
      System.out.println("Enter a valid input(R or P or S or r or p or s");
    }
    }
    StartGame(playerAmove,playerBmove);
     
    System.out.println("Do you like to play again(Y/N)");
    playAgain=userInput.next(); 
     
    if(!playAgain.equals("Y"))
      break;
    }
  }
  public static void main(String[] args) 
  {
     
    
    new RockPaperScissors().playerMove(); 
       
    
  }
   
}
