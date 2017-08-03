/* Debasish Roy 03/08/2017 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.*;

import javax.swing.JFrame;

public class GeneticWorm extends JFrame{
	
	int x=50,y=50;
	int[] cgp1,cgp2,cgp3,cgp4,cgp5,cgp6,cgp7,cgp8,cgp9,cgp10;
	int[] newMat1,newMat2,newMat3,newMat4,newMat5,newMat6,newMat7,newMat8,newMat9,newMat10;
	int G=0;
	
	int[] fitnessArray = new int[10];
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	public GeneticWorm(){
		setTitle("GeneticWorm");
		setSize(900,700);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.YELLOW);
		
		int[][] gpMain = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				Random rn = new Random();
				gpMain[i][j]=rn.nextInt(2);
			}
		}
		
		//initial gene pool 
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
		System.out.print(gpMain[i][j]+" ");
			}
			System.out.println();
		}
		
		//after matrix multiplication new gene pool 
		
		int[] gp1 = {1,0,0,1,0,1,0,0,1,1};
		int[] gp2 = {0,0,0,1,0,1,0,1,1,0};
		int[] gp3 = {0,1,0,1,0,1,0,1,1,0};
		int[] gp4 = {1,1,0,1,0,1,1,1,1,1};
		int[] gp5 = {1,1,1,0,1,1,1,0,1,1};
		int[] gp6 = {0,0,1,0,1,1,1,1,1,1};
		int[] gp7 = {1,1,1,1,0,0,0,1,1,0};
		int[] gp8 = {0,1,1,0,1,1,1,1,1,0};
		int[] gp9 = {0,1,1,0,1,0,1,1,1,1};
		int[] gp10 = {1,0,0,1,0,1,1,1,0,1};
		
		System.out.println("Initial Gene pool population :---->>>");	
		
		newMat1 = matrixMultiply(gp1,gpMain);
		printGenepool( newMat1);
		System.out.print(" Fitness :--> "+fitnessCal(newMat1));
		System.out.println();
		newMat2 = matrixMultiply(gp2,gpMain);
		printGenepool( newMat2);
		System.out.print(" Fitness :--> "+fitnessCal(newMat2));
		System.out.println();
		newMat3 = matrixMultiply(gp3,gpMain);
		printGenepool( newMat3);
		System.out.print(" Fitness :--> "+fitnessCal(newMat3));
		System.out.println();
		newMat4 = matrixMultiply(gp4,gpMain);
		printGenepool( newMat4);
		System.out.print(" Fitness :--> "+fitnessCal(newMat4));
		System.out.println();
		newMat5 = matrixMultiply(gp5,gpMain);
		printGenepool( newMat5);
		System.out.print(" Fitness :--> "+fitnessCal(newMat5));
		System.out.println();
		newMat6 = matrixMultiply(gp6,gpMain);
		printGenepool( newMat6);
		System.out.print(" Fitness :--> "+fitnessCal(newMat6));
		System.out.println();
		newMat7 = matrixMultiply(gp7,gpMain);
		printGenepool( newMat7);
		System.out.print(" Fitness :--> "+fitnessCal(newMat7));
		System.out.println();
	    newMat8 = matrixMultiply(gp8,gpMain);
		printGenepool( newMat8);
		System.out.print(" Fitness :--> "+fitnessCal(newMat8));
		System.out.println();
		newMat9 = matrixMultiply(gp9,gpMain);
		printGenepool( newMat9);
		System.out.print(" Fitness :--> "+fitnessCal(newMat9));
		System.out.println();
		newMat10 = matrixMultiply(gp10,gpMain);
		printGenepool( newMat10);
		System.out.print(" Fitness :--> "+fitnessCal(newMat10));
		System.out.println();
		
		
		int[] fitnessArray = new int[10];
		
		fitnessArray[0]=fitnessCal(newMat1);
		fitnessArray[1]=fitnessCal(newMat2);
		fitnessArray[2]=fitnessCal(newMat3);
		fitnessArray[3]=fitnessCal(newMat4);
		fitnessArray[4]=fitnessCal(newMat5);
		fitnessArray[5]=fitnessCal(newMat6);
		fitnessArray[6]=fitnessCal(newMat7);
		fitnessArray[7]=fitnessCal(newMat8);
		fitnessArray[8]=fitnessCal(newMat9);
		fitnessArray[9]=fitnessCal(newMat10);
		//for(int i=10;i<15;i++) fitnessArray[i]=-200;
		
		
		
		hm.put(fitnessArray[0],1);
		hm.put(fitnessArray[1],2);
		hm.put(fitnessArray[2],3);
		hm.put(fitnessArray[3],4);
		hm.put(fitnessArray[4],5);
		hm.put(fitnessArray[5],6);
		hm.put(fitnessArray[6],7);
		hm.put(fitnessArray[7],8);
		hm.put(fitnessArray[8],9);
		hm.put(fitnessArray[9],10);
		
		
		Arrays.sort(fitnessArray);
		
		for(int i=9;i>=0;i--){
			System.out.println("Gene Pool Name : gp"+hm.get(fitnessArray[i])+" fitness "+fitnessArray[i]+" %");
		}
		
		
		cgp1 = newMat1;
		cgp2 = newMat2;
		cgp3 = newMat3;
		cgp4 = newMat4;
		cgp5 = newMat5;
		cgp6 = newMat6;
		cgp7 = newMat7;
		cgp8 = newMat8;
		cgp9 = newMat9;
		cgp10 = newMat10;
		
		
		
		
		
	}
	
	
	
	public void paint(Graphics g){
		
		
		
		
		
		
		    
		
			
			
			hm.put(fitnessArray[0],1);
			hm.put(fitnessArray[1],2);
			hm.put(fitnessArray[2],3);
			hm.put(fitnessArray[3],4);
			hm.put(fitnessArray[4],5);
			hm.put(fitnessArray[5],6);
			hm.put(fitnessArray[6],7);
			hm.put(fitnessArray[7],8);
			hm.put(fitnessArray[8],9);
			hm.put(fitnessArray[9],10);
			
		//starting crossover among the population 
		int[] newChild1 = new int[10];
		int[] newChild2 = new int[10];
		int[] newChild3 = new int[10];
		int[] newChild4 = new int[10];
		int[] newChild5 = new int[10];
		
		for(int i=0;i<9;i=i+2){
			int[] arrX = findArray(hm.get(fitnessArray[i]),cgp1,cgp2,cgp3,cgp4,cgp5,cgp6,cgp7,cgp8,cgp9,cgp10);
			int[] arrY = findArray(hm.get(fitnessArray[i+1]),cgp1,cgp2,cgp3,cgp4,cgp5,cgp6,cgp7,cgp8,cgp9,cgp10);
			if(i==8)
			    newChild1 = crossover(arrX,arrY);
			else if(i==6)
				newChild2 = crossover(arrX,arrY);
			else if(i==4)
				newChild3 = crossover(arrX,arrY);
			else if(i==2)
				newChild4 = crossover(arrX,arrY);
			else if(i==0)
				newChild5 = crossover(arrX,arrY);
		}
		
		//now mutation occur in each child 
		
		newChild1 = mutation(newChild1);
		newChild2 = mutation(newChild2);
		newChild3 = mutation(newChild3);
		newChild4 = mutation(newChild4);
		newChild5 = mutation(newChild5);
		
		//now eliminate the gene pool of lower fitness
		
		
        //selection of the fit .
		int i1=-1,i2=-1,i3=-1,i4=-1,i5=-1;
		int fitness1 = fitnessCal(newChild1);
		int ii1=0;
		while(ii1<=9){
			if(fitness1>fitnessArray[ii1]){
				i1=ii1;
				ii1++;
			}else if(fitness1==fitnessArray[ii1]){
				if(ii1>0){
					i1=ii1-1;
					break;
				}else break;
			}
			else ii1++;
		}
		
		if(i1>=0)
			fitnessArray[i1] = fitnessCal(newChild1);
				
		int fitness2 = fitnessCal(newChild2);
		System.out.println(fitness2);
		int ii2=0;
		while(ii2<=9){
			if(fitness2>=fitnessArray[ii2]){
				i2=ii2;
				ii2++;
				
			}else if(fitness2==fitnessArray[ii2]){
				if(ii2>0){
					i2=ii2-1;
					break;
				}else break;
			}
			else ii2++;
				
				
		}
		
		if(i2>=0)
			fitnessArray[i2] = fitnessCal(newChild2);
		
		
		int fitness3 = fitnessCal(newChild3);
		int ii3=0;
		while(ii3<=9){
			if(fitness3>=fitnessArray[ii3]){
				i3=ii3;
				ii3++;
			}else if(fitness3==fitnessArray[ii3]){
				if(ii3>0) {
					i3=ii3-1;
					break;
				}
				else break;
			}
			else ii3++;
		}
		
		if(i3>=0)
			fitnessArray[i3] = fitnessCal(newChild3); 
		
		int fitness4 = fitnessCal(newChild4);
		int ii4=0;
		while(ii4<=9){
			if(fitness4>=fitnessArray[ii4]){
				i4=ii4;
				ii4++;
			}else if(fitness4==fitnessArray[ii4]){
				if(ii4>0) {
					i4=ii4-1;
					break;
				}else break;
			}
			else ii4++;
		}
		
		if(i4>=0)
			fitnessArray[i4] = fitnessCal(newChild4);
		
		int fitness5 = fitnessCal(newChild5);
		int ii5=0;
		while(ii5<=9){
			if(fitness5>=fitnessArray[ii5]){
				i5=ii5;
				ii5++;
			}else if(fitness5==fitnessArray[ii5]){
				if(ii5>0){
					i5=ii5-1;
					break;
				}else break;
			}else ii5++;
		}
		
		if(i5>=0)
			fitnessArray[i5] = fitnessCal(newChild5);
		
		//now replace the new gene pool if it is fit
		
		if(i1==0) cgp1 = newChild1;
		else if(i1==1) cgp2 = newChild1;
		else if(i1==2) cgp3 = newChild1;
		else if(i1==3) cgp4 = newChild1;
		else if(i1==4) cgp5 = newChild1;
		else if(i1==5) cgp6 = newChild1;
		else if(i1==6) cgp7 = newChild1;
		else if(i1==7) cgp8 = newChild1;
		else if(i1==8) cgp9 = newChild1;
		else cgp10 = newChild1;
		
		if(i2==0) cgp1 = newChild2;
		else if(i2==1) cgp2 = newChild2;
		else if(i2==2) cgp3 = newChild2;
		else if(i2==3) cgp4 = newChild2;
		else if(i2==4) cgp5 = newChild2;
		else if(i2==5) cgp6 = newChild2;
		else if(i2==6) cgp7 = newChild2;
		else if(i2==7) cgp8 = newChild2;
		else if(i2==8) cgp9 = newChild2;
		else  cgp10 = newChild2;
		
		if(i3==0) cgp1 = newChild3;
		else if(i3==1) cgp2 = newChild3;
		else if(i3==2) cgp3 = newChild3;
		else if(i3==3) cgp4 = newChild3;
		else if(i3==4) cgp5 = newChild3;
		else if(i3==5) cgp6 = newChild3;
		else if(i3==6) cgp7 = newChild3;
		else if(i3==7) cgp8 = newChild3;
		else if(i3==8) cgp9 = newChild3;
		else cgp10 = newChild3;
		
		if(i4==0) cgp1 = newChild4;
		else if(i4==1) cgp2 = newChild4;
		else if(i4==2) cgp3 = newChild4;
		else if(i4==3) cgp4 = newChild4;
		else if(i4==4) cgp5 = newChild4;
		else if(i4==5) cgp6 = newChild4;
		else if(i4==6) cgp7 = newChild4;
		else if(i4==7) cgp8 = newChild4;
		else if(i4==8) cgp9 = newChild4;
		else  cgp10 = newChild4;
		
		if(i5==0) cgp1 = newChild5;
		else if(i5==1) cgp2 = newChild5;
		else if(i5==2) cgp3 = newChild5;
		else if(i5==3) cgp4 = newChild5;
		else if(i5==4) cgp5 = newChild5;
		else if(i5==5) cgp6 = newChild5;
		else if(i5==6) cgp7 = newChild5;
		else if(i5==7) cgp8 = newChild5;
		else if(i5==8) cgp9 = newChild5;
		else cgp10 = newChild5;
		
		
		
		
		Arrays.sort(fitnessArray);
		
	    for(int j=0;j<10;j++){
	    	g.setColor(Color.RED);
			
			for(int i=0;i<10;i++){
				if(j==0){
					g.fillRect(x, y, 5, cgp1[i]);
					
				}
				
				else if(j==1){
					g.fillRect(x, y, 5, cgp2[i]);
					
					}
					
				else if(j==2){
					g.fillRect(x, y, 5, cgp3[i]);
					
						}
				else if(j==3){
					g.fillRect(x, y, 5, cgp4[i]);
					
						}
				else if(j==4){
					g.fillRect(x, y, 5, cgp5[i]);
					
						}
				else if(j==5){
					g.fillRect(x, y, 5, cgp6[i]);
					
						}
				else if(j==6){
					g.fillRect(x, y, 5, cgp7[i]);
					
						}
				else if(j==7){
					g.fillRect(x, y, 5, cgp8[i]);
					
						}
				else if(j==8){
					g.fillRect(x, y, 5, cgp9[i]);
					
						}
				else if(j==9){
					g.fillRect(x, y, 5, cgp10[i]);
					
						}
				run();
			}
	    }
		  
	  
      
		
		
		g.setColor(Color.BLACK);
		g.drawLine(0, y+1, 700, y);
		g.drawString("Generation "+G, 700, y);
		G++;
	    repaint();
		
		
		
		
		
		
		
		
	}
	
	public void run(){
		try{
			Thread.sleep(5);
			x +=50;
			if(x>=54*10){
				x=50;
				y +=10;
				setBackground(Color.YELLOW);
			}
			if(y>=670) {
				y=50;
				x=50;
				setBackground(Color.WHITE);
				repaint();
			}
			
		}catch(Exception e){
			System.out.println("Exception!!");
		}
	}
	

	//binary matrix multiplication
	public static int[] matrixMultiply(int[] gpB,int[][] gpA){
		int[] newMatrix = new int[10];
		for(int i=0;i<10;i++){
			int sum=0;
			for(int j=0;j<10;j++){
				//binary multiplication rule 
				//OR and AND operations 
				sum += gpB[j]*gpA[i][j];
			}
			newMatrix[i]=sum;
		}
		return newMatrix;
	}
	public static void printGenepool(int[] gp){
		for(int i=0;i<10;i++){
			System.out.print(gp[i]+" ");
		}
	}
	public static int fitnessCal(int[] gp){
		int sum=0;
		for(int i=0;i<gp.length;i++){
			sum += gp[i];
		}
		
		int fitness = (sum>50)?100-(sum-50)*2:100-(50-sum)*2;
		return fitness;
	}
	
	public static int[] crossover(int[] gp1,int[] gp2){
		int[] child = new int[10];
		for(int i=0;i<5;i++) child[i]=gp2[i];
		for(int i=5;i<10;i++) child[i]=gp1[i];
		return child;
	}
	public static int[] mutation(int[] child){
		for(int i=0;i<10;i++){
			if(child[i]<5) {
				child[i] += 1;
				 break;
			}else if(child[i]>5){
				child[i] -=1;
				break;
			}
			
		}
		return child;
	}
	public static int[] findArray(int key ,int[] gp1,int[] gp2,int[] gp3,int[] gp4,int[] gp5,int[] gp6,int[] gp7,int[] gp8,int[] gp9,int[] gp10){
		if(key==1) return gp1;
		else if(key==2) return gp2;
		else if(key==3) return gp3;
		else if(key==4) return gp4;
		else if(key==5) return gp5;
		else if(key==6) return gp6;
		else if(key==7) return gp7;
		else if(key==8) return gp8;
		else if(key==9) return gp9;
		else return gp10;
	}
	
	
	
	public static void main(String[] args){
		new GeneticWorm();
	}
	
	

}
