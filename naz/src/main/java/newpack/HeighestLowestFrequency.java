package newpack;

public class HeighestLowestFrequency {
	
	 public static void main(String args[]){
	        int array[]={1,2,2,3,3,2,2,1,1},i, count1=0,count2=0,count3=0;
	        for(i=0;i<9;i++){
	            switch(array[i]){
	                case 1: count1++;break;
	                case 2: count2++;break;
	                case 3: count3++;break;
	            }
	        }
	        System.out.println("Frequency= "+count1+" "+count2+" "+count3);
	        
	            if((count1>count2)&&(count1>count3))
	                System.out.println("Height count= "+count1);
	            else if((count2>count1)&&(count2>count3))
	                System.out.println("Height count= "+count2);
	            else
	                System.out.println("Height count= "+count3);
	            
	            if((count1<count2)&&(count1<count3))
	                System.out.println("Height count= "+count1);
	            else if((count2<count1)&&(count2<count3))
	                System.out.println("Height count= "+count2);
	            else
	                System.out.println("Lowest count= "+count3);
	                
	    }

}
