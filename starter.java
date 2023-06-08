import java.util.*;
import java.io.File;
import pkg.*;

class starter 
{
	static int timeLimit = 10; 
    static ArrayList<String> wordBank = new ArrayList<String>();
    
    public static void main(String args[]) throws Exception
    {
    	File file = new File("dict.txt");
    	
        Scanner sc = new Scanner(System.in);
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Scanner sca = new Scanner(file);
        
        while(sca.hasNextLine())
        {
        	wordBank.add(sca.nextLine());
        }
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //    index A = new index();
    //    A.createBank();
        
    // Character[] alpha = new Character[26];
    // ArrayList<String> index = new ArrayList<String>();
            
    // for(int i = 0; i < 26; i++) 
    // {
    //     alpha[i] = (char)('a' + i);
    // }
            
    // String entry = "";
    // int counter = 0;
    
    // for(int j = 0; j < 26; j++)
    // {
    //     index.add(Character.toString(alpha[j]));
    //     bank.add(index);
    //     counter++;
        
    //     for(int k = 0; k < 26; k++)
    //     {
    //         index.set(0,index.get(j) + Character.toString(alpha[k]));
    //         bank.add(index);
    //         counter++;
    //     }
        
    // }
            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // for(int i = 0; i < wordBank.size(); i++)
    // {
        
    //     for(int j = 0; j < wordBank.size(); j++)
    //     {
            
    //     }
    // }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Welcome to BombParty!");
        System.out.println("This is a singleplayer version of the game \"BombParty\" on JKLM");
        System.out.print("Input \"start\" to start the game\n");
        
        String startTrigger = sc.nextLine();
        System.out.println("-----------------------------------------------------------");
        
        int score = 0;
        boolean gameOver = false;
        
        while (!gameOver) 
        {
            String word = getRandomWord();
            System.out.println("Your word: " + word);
            
            long startTime = System.currentTimeMillis();
            String input = sc.nextLine();
            long endTime = System.currentTimeMillis();
            
            double timeElapsed = (endTime - startTime) / 1000.0;
            
            
            
            
            
            
            if (input.equals("quit")) 
            {
                gameOver = true;
            } 
            else if (timeElapsed > timeLimit)
            {
                System.out.println("Oops! Time's up.");
                gameOver = true;
            } 
            else if (input.equalsIgnoreCase(word))
            {
                int wordScore = calculateScore(input);
                score += wordScore;
                System.out.println("Correct! +" + wordScore + " points");
            } 
            else 
            {
                System.out.println("Incorrect word!");
            }
            
            System.out.println("Current score: " + score + "\n");
        }
     
        System.out.println("Game over. Your final score is: " + score);
    }    
	    
    public static String getRandomWord() 
    {
        int index = (int)(Math.random() * wordBank.size());
        String word = wordBank.get(index);
        return word;
    }
    
    public static int calculateScore(String word) 
    {
        return word.length();
    }
}





