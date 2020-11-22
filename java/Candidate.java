/* A class for computer strategy */

import java.util.Random;
import java.util.ArrayList;

class Candidate
{
	private int row,col;
	
	Candidate(int r, int c)
	{
		row = r;
		col = c;
	}
	
	int getRow()
	{
		return row;
	}
	
	int getCol()
	{
		return col;
	}
}


class ComputerPlay
{
	//data
	private int row,col;
	private int prevPlay;
	// This is to keep track of what was chosen previously
	private int[][] chosen;
	// Create an array list of candidates
	private ArrayList<Candidate> candidates;
	private int maxR,maxC;
	
	//Constructor
	ComputerPlay()
	{
		maxR=10;
		maxC=10;
		chosen = new int[maxR][maxC];
		
		candidates = new ArrayList<>();
		prevPlay =0;
		// None are chosen at the start of game
		for(int i=0;i<maxR;i++)
		{
			for(int j=0;j<maxC;j++)
			{
				chosen[i][j]=0;
			}
		}
	}
	
	void setPrevPlay(int s)
	{
		prevPlay=s;
	}
	
	//method - play()
	int getRow()
	{
		return row;
	}
	
	int getCol()
	{
		return col;
	}
	
	void play()  // No input given
	{
		Random bag = new Random();
		
		if(prevPlay==0 && candidates.size()==0) // No hits were  made previously and no candidates to explore
		{
			boolean keepGenerating=true;
			while(keepGenerating)
			{
				row = bag.nextInt(10);
				col = bag.nextInt(10);
				if(chosen[row][col]==0)   // Found a spot that was not picked before
					keepGenerating =false;
			} 
			chosen[row][col]=1; // Mark the spot as chosen
		}
		else   // there was a hit
		{
			// Pick in the neighborhood
			if(prevPlay==1)  // Build candidates only when hit is successful
			{
				if(row+1<maxR) //legal position
				{
					if(chosen[row+1][col]==0)
					{
						Candidate c = new Candidate(row+1,col);
						candidates.add(c);
					}
				}
			
				if(row-1>=0) //legal position
				{
					if(chosen[row-1][col]==0)
					{
						Candidate c = new Candidate(row-1,col);
						candidates.add(c);
					}
				}
			
				if(col-1>=0) //legal position
				{
					if(chosen[row][col-1]==0)
					{
						Candidate c = new Candidate(row,col-1);
						candidates.add(c);
					}
				}
			
				if(col+1<maxC) //legal position
				{
					if(chosen[row][col+1]==0)
					{
						Candidate c = new Candidate(row,col+1);
						candidates.add(c);
					}
				}
			}
			
			
			if(candidates.size()>0) // atleast one candidate
			{
				Candidate c = candidates.get(0);
				row = c.getRow();
				col = c.getCol();
				chosen[row][col]=1;  // Mark as chosen
				candidates.remove(0);	// Done with candidate
			}
			else  // No candidates to explore - go back to random
			{
				boolean keepGenerating=true;
				while(keepGenerating)
				{
					row = bag.nextInt(10);
					col = bag.nextInt(10);
					if(chosen[row][col]==0)   // Found a spot that was not picked before
						keepGenerating =false;
				} 
				chosen[row][col]=1; // Mark the spot as chosen
			}
		}
 
	}