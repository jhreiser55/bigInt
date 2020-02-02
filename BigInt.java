public class BigInt{
	
	private int[] arrayOfDigits;
	
	public BigInt(){
		this.arrayOfDigits = new int[0];
	}

	public BigInt(int a){
		//No split method for ints so converting to a string then back 
		//to an array of ints
		String[] wow = String.valueOf(a).split("");
		for(int i = 0; i < wow.length; i++){
			arrayOfDigits[i] = Integer.parseInt(wow[i]);
		}
	}
	
	public BigInt(String a){
		//converting string number to an array of strings then to 
		//an array of integers to instanciate the class variable
		String[] bigNum = a.split("");
		arrayOfDigits = new int[bigNum.length];
		for(int i = 0; i < bigNum.length; i++){
			arrayOfDigits[i] = Integer.parseInt(bigNum[i]);
		}
	}

	public String toString(){
		//easier way instead of using a for loop
		return String.valueOf(arrayOfDigits);
	}

	public int comparedTo(BigInt a){
		int[] aArray = a.getArray();
		//comparing lengths because thats a direct sign if one is smaller
		if(aArray.length < arrayOfDigits.length){
			return 1;
		}
		if(aArray.length > arrayOfDigits.length){
			return -1;
		}

		//coparing each placevalue left to right of the integers
		for(int i = 0; i < aArray.length; i++){
			if(aArray[i] < arrayOfDigits[i]){
				return 1;
			}
			if(arrayOfDigits[i] < aArray[i]){
				return -1;
			}
		}
		return 0;
	}

	public BigInt add(BigInt a){
		//so im able to compile without return statement errors
		BigInt THISISATEST = new BigInt();
		
		//start by flipping the arrays to work from left to right
		int[] bob = new int[arrayOfDigits.length];
		int[] fox = new int[a.getArray().length];
		for(int i = 0; i < bob.length; i++){
			bob[i] = arrayOfDigits[bob.length - i];	
		}
		for(int i = 0; i < fox.length; i++){
			fox[i] = a.getArray()[fox.length - i];
		}

		return THISISATEST;
	}

	//method is used to get the array of another bigInt
	public int[] getArray(){
		return arrayOfDigits;
	}
}
