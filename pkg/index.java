package pkg;
import java.util.*;
import java.io.File;

public class index
{
	static ArrayList<ArrayList<String>> bank;
	static Character[] alpha;
    static ArrayList<String> index;
    
	public index()
	{
    	bank = new ArrayList<ArrayList<String>>();
    	alpha = new Character[26];
    	index = new ArrayList<String>();
	}
	
	public void createBank()
	{
		for(int i = 0; i < 26; i++) 
        {
            alpha[i] = (char)('a' + i);
        }
        
        String entry = "";
        int counter = 0;
        
        for(int j = 0; j < 26; j++)
        {
            index.add(Character.toString(alpha[j]));
            bank.set(counter, index);
            counter++;
            
            for(int k = 0; k < 26; k++)
            {
                index.set(0,index.get(j) + Character.toString(alpha[k]));
                bank.add(index);
                counter++;
            }
            
        }
	}
}