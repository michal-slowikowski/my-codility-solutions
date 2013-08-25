package my.solution.codility.alpha;

import java.util.Random;

public class Alpha {

	public final static int DATA_SIZE = 30;
	
	public static void main (String[] args){
		Alpha a = new Alpha();
		int[] inputTable = a.generateInputTale(DATA_SIZE); 
		a.printTable(inputTable);
		System.out.println();
		System.out.println(a.findIndex(inputTable));
	}
	
	public int findIndex(int[] toSearchTable){
		int resultIndex = 0;
		
		int[] alreadyCheckTable = new int[toSearchTable.length];
		int toCheckNumber;
		for (int index=0; index<toSearchTable.length; index++){
			
			toCheckNumber = toSearchTable[index];
			if(alreadyCheckTable[toCheckNumber] == 0){
				resultIndex = index;
				alreadyCheckTable[toCheckNumber] = 1;
			}
			
		}
		
		return resultIndex;
	}
	
	public int[] generateInputTale(int size){
		int[] inputTable = new int[size];
		Random random = new Random();
		
		for (int i =0; i<inputTable.length; i++){
			inputTable[i] = random.nextInt(size);
		}
		
		
		return inputTable;
	}
	
	public void printTable(int[] toPrintTable){
		
		System.out.print("[ ");
		
		for (int elem: toPrintTable){
			System.out.print(" "+elem+" ");
		}
		
		System.out.print(" ]");
		
	}
	
}
