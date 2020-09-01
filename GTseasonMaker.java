
package gtseasonmaker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GTseasonMaker {

   
    public static void main(String[] args) {
        
         ArrayList Al = new ArrayList(10);
         
         
        
        int numOfRaces= raceNum();
        
        int groupSelect = Selection();
       
         System.out.println("** Season Selecter** ");
         System.out.println("---------------------");
         
        Al = ranNum(Al,numOfRaces);
        
       if(groupSelect == 5)
       {
           f1Tracks(Al,numOfRaces);
       }
       if(groupSelect == 7)
       {
           rallyTracks(Al,numOfRaces);
       }
       else
       {
          allTracks(Al,numOfRaces);
       }
         
       
         
        
    }
    
    
    public static ArrayList ranNum(ArrayList Al, int numOfRace)
    {
     Random rand = new Random();
      while(Al.size()!=numOfRace)
         {
         int num = rand.nextInt(45);        //CHANGE TO NUM OF TRACKS                                    // Total Number of Tracks
         
         if(Al.isEmpty())
         {
            Al.add(num); 
         }
         else if(Al.contains(num))
         {
            num = rand.nextInt(45);
           
         }
         else
             Al.add(num);
         }
         
         return Al;
    
    }
    
     public static void allTracks(ArrayList t,int numRaces)
    {
                                                                                //Track Representation
     String A = "InterLagos";
     String B = "Monza";
     String C = "Autopolis";
     String D = "Brands Hatch";
     String E = "Barcelona";
     String F = "Spa";
     String G  = "Fuji";
     String H = "Goodwood";
     String I =  "Mount Panorama";
     String J  = "Nurburing GP";
     String K  = "Red bull Ring";
     String L  = "Suzuka";
     String M  = "Tsubuka";
     String N  = "Willow Springs";
     String O  = "Leguna Seca";
     String P  = "Monza (NO CHICANE)";
     String Q  = "Autopolis (SHORTCUT)";
     String R  = "Brands Hatch (INDY)";
     String S  = "Fuji (SHORT)";
     String T  = "Red bull Ring (SHORT)";
     String U  = "Suzuka(EAST)";
     String V  = "Willow Springs(HORSE THEIF)";
     String W  = "Willow Springs (STREETS OF WILLOW)";
     String X  = "Alsace";
     String Y  = "Lago Maggiore (CENTER)";
     String Z  = "Lago Maggiore (EAST)";
     String as  = "Lago Maggiore (WEST)";
     String bs  = "Blue Moon (INFIELD A)";
     String cs  = "Blue Moon (INFIELD B)";
     String ds  = "Sante Criox A";
     String es  = "Sante Criox B";
     String fs  = "Sante Criox C";
     String gs  = "Dragons Trail";
     String hs  = "Dragons Trail (GARDENS)";
     String is  = "Kyoto (MIYABI)";
     String js  = "Kyoto(YAMAGIWA)";
     String ks  = "Kyoto (M + Y)";
     String ls  = "Sardenga Road B";
     String ms  = "Sardenga Road C";
     String ns  = "Sardenga Road A";
     String os  = "Tokyo (INNER)";
     String ps  = "Tokyo (OUTER)";
     String qs  = "Tokyo (EAST IN)";
     String rs  = "Tokyo (EAST OUT)";
     String ss  = "Tokyo (SOUTH IN)";
     String ts  = "Tokyo (SOUTH OUT)";



             
     for(int i =0; i < numRaces ;i++)
     {
         System.out.print(i+1 + ") " );
         
     Object a = t.get(i);
      
      
        if(a.equals(0)){System.out.println(A);}
        if(a.equals(1)){System.out.println(B);}
        if(a.equals(2)){System.out.println(C);}
        if(a.equals(3)){System.out.println(D);}
        if(a.equals(4)){System.out.println(E);}
        if(a.equals(5)){System.out.println(F);}
        if(a.equals(6)){System.out.println(G);}
        if(a.equals(7)){System.out.println(H);}
        if(a.equals(8)){System.out.println(I);}
        if(a.equals(9)){System.out.println(J);}
        if(a.equals(10)){System.out.println(K);}
        if(a.equals(11)){System.out.println(M);}
        if(a.equals(12)){System.out.println(N);}
        if(a.equals(13)){System.out.println(L);}
        if(a.equals(14)){System.out.println(O);}
        if(a.equals(15)){System.out.println(P);}
        if(a.equals(16)){System.out.println(Q);}
        if(a.equals(17)){System.out.println(R);}
        if(a.equals(18)){System.out.println(S);}
        if(a.equals(19)){System.out.println(T);}
        if(a.equals(20)){System.out.println(U);}
        if(a.equals(21)){System.out.println(V);}
        if(a.equals(22)){System.out.println(W);}
        if(a.equals(23)){System.out.println(X);}
        if(a.equals(24)){System.out.println(Y);}
        if(a.equals(25)){System.out.println(Z);}
        if(a.equals(26)){System.out.println(as);}
        if(a.equals(27)){System.out.println(bs);}
        if(a.equals(28)){System.out.println(cs);}
        if(a.equals(29)){System.out.println(ds);}
        if(a.equals(30)){System.out.println(es);}
        if(a.equals(31)){System.out.println(fs);}
        if(a.equals(32)){System.out.println(gs);}
        if(a.equals(33)){System.out.println(hs);}
        if(a.equals(34)){System.out.println(is);}
        if(a.equals(35)){System.out.println(js);}
        if(a.equals(36)){System.out.println(ks);}
        if(a.equals(37)){System.out.println(ms);}
        if(a.equals(38)){System.out.println(ns);}
        if(a.equals(39)){System.out.println(ls);}
        if(a.equals(40)){System.out.println(os);}
        if(a.equals(41)){System.out.println(ps);}
        if(a.equals(42)){System.out.println(qs);}
        if(a.equals(43)){System.out.println(rs);}
        if(a.equals(44)){System.out.println(ss);}
        if(a.equals(45)){System.out.println(ts);}

    
        }
     }
     
     
     public static int Selection()
     {
          Scanner scnr = new Scanner(System.in);
        int groupSelect;
        
         do{
         
         System.out.println("Select Group:");
         System.out.println("-------------");
         System.out.println("1) Group 4");
         System.out.println("2) Group 3");
         System.out.println("3) Group 2");
         System.out.println("4) Group 1");
         System.out.println("5) F1");
         System.out.println("6) Red Bull");
         System.out.println("7) Rally");
         
         System.out.print("#");
         
         groupSelect = scnr.nextInt();
         }
         while(groupSelect != 1 && groupSelect != 2 &&groupSelect != 3&&groupSelect != 4&&groupSelect != 5&&groupSelect != 6&&groupSelect != 7);

         
         
         
         return groupSelect;
     }
     
     public static int raceNum()
     {
                   Scanner scnr = new Scanner(System.in);
                   System.out.println("Select Number of Races:");
                   int num= scnr.nextInt();
                   
                   return num;
         
         
     }
     
     
     public static void rallyTracks(ArrayList t,int numRaces)
     {
     String A  = "Colorado Springs A";
     String B  = "Colorado Springs B";
     String C  = "FisherMan Ranch A";
     String D  = "FisherMan Ranch B";
     String E  = "Sargenga A";
     String F  = "Sardenga B";

             
     for(int i =0; i < numRaces ;i++)
     {
         System.out.print(i+1 + ") " );
         
     Object a = t.get(i);
      
      
        if(a.equals(0)){System.out.println(A);}
        if(a.equals(1)){System.out.println(B);}
        if(a.equals(2)){System.out.println(C);}
        if(a.equals(3)){System.out.println(D);}
        if(a.equals(4)){System.out.println(E);}
        if(a.equals(5)){System.out.println(F);}
      
         
     }
     }
     
     public static void f1Tracks(ArrayList t, int numRaces)
     {
     String A  = "Interlagos";
     String B  = "Monza";
     String C  = "Autopolis";
     String D  = "Brands Hatch";
     String E  = "Barcelona";
     String F  = "Spa";
     String G  = "Fuji";
     String H  = "Goodwood";
     String I  = "Mount Panorama";
     String J  = "Nurburing GP";
     String K  = "Red Bull Ring ";
     String L  = "Suzuka";
     String M  = "Tsubuka";
     String N  = "Willow Springs";
     String O  = "Leguna Seca";


             
     for(int i =0; i < numRaces ;i++)
     {
         System.out.print(i+1 + ") " );
         
     Object a = t.get(i);
      
      
        if(a.equals(0)){System.out.println(A);}
        if(a.equals(1)){System.out.println(B);}
        if(a.equals(2)){System.out.println(C);}
        if(a.equals(3)){System.out.println(D);}
        if(a.equals(4)){System.out.println(E);}
        if(a.equals(5)){System.out.println(F);}
        if(a.equals(6)){System.out.println(G);}
        if(a.equals(7)){System.out.println(H);}
        if(a.equals(8)){System.out.println(I);}
        if(a.equals(9)){System.out.println(J);}
        if(a.equals(10)){System.out.println(K);}
        if(a.equals(11)){System.out.println(L);}
        if(a.equals(12)){System.out.println(M);}
        if(a.equals(13)){System.out.println(N);}
        if(a.equals(14)){System.out.println(O);}

     }
        
  }
}
