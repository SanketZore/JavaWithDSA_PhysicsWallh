package HashingDataStructure;

public class _2_CollisionHandlingInHashmap {

	public static void main(String[] args) {

// --------Chaining ----------
		
/*
 
 Search complexity- O(n)
 
 
 Limitation - Extra Space outside of hashtable (Space is available inside hashtable) 
 Advantage -  We can store Infinite number of values
 
 
 // ----------Linear Probing-----------
  
linear probing hash function: LP(v,i) = ( hf(v) + i ) % m
  	where, i= no of collision occured, initially i=0
  		   m= size of hashtable.
  
 time complexity (Worst case)- O(n)
 time complexity (Best case)- O(1)
 
 Primary Clustering- whenever the in linear probing if the two data points have same key value at that point of time they follow same to get a final key. 
 
 // ----------Quadratic Probing-----------
 
 	values =50 75 99 20 35 88 45 23 55 67 
 	QP(v,i) = ( hf(v) + c1i + c2i^2 ) % m )
 	
 	 Quadratic Probing follows Secondary Clustering Clustering.
 	 Search complexity -> O(n)
 	 Limitation: Loss of Data(55), Secondary Clustering
 	 
 	c1=c2=1
 	QP(20,1)=(0+1+1^2)%10 = 2
 	QP(35,1)=(5+1+1^2)%10 = 7
 	QP(45,1)=(5+1+1^2)%10 = 7
 	QP(45,2)=(5+2+2^2)%10 = 1
 	QP(55,3)=(5+3+3^2)%10 = 7
 	QP(55,4)=(5+2+2^2)%10 = 5
 	QP(55,5)=(5+5+5^2)%10 = 5  	-->Loss of Data(55)
 	
 		 Key	Value
		 0		50		
		 1		45 
		 2			
		 3		23
		 4		
		 5		75
		 6		
		 7		35
		 8		88
		 9		99
  
// ----------Double Hashing-----------

 	values =50 75 99 20 35 88 45 23 55 67 
 	QP(v,i) = ( hf1(v) + i hf2(v) )  % m 
			   hf2(v) = 1 + v mod(m-2)
			   
			   where, i= no of collision occured, initially i=0
  		   		m= size of hashtable.

- Possibility of Loss of Data.
- Search Complexity: O(n)	
			   
	DH(20,1)= (0+1*5)%10 =5
			hf2(20)=1 + 20 % 8 = 1 + 4 = 5
			
	DH(20,2)= (0+2*5)%10 =0
			hf2(20)=1 + 20 % 8 = 1 + 4 = 5
			
	DH(20,3)= (0+3*5)%10 =5					-->Loss of Data(20)
			hf2(20)=1 + 20 % 8 = 1 + 4 = 5

 		 Key	Value
		 0		50		
		 1		 
		 2			
		 3		
		 4		
		 5		75
		 6		
		 7		
		 8		
		 9		99
  
  
 */
		
		
		
		
		
		
		
		
	}

}
