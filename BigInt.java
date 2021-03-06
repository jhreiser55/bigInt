public class BigInt{
	
	int[] arrayOfDigits;
	
	public BigInt(){
		this.arrayOfDigits = new int[0];
	}

	public BigInt(int a){
		//No split method for ints so converting to a string then back 
		//to an array of ints
		String aa = String.valueOf(a);
		String[] wow = aa.split("");
		arrayOfDigits = new int[wow.length];
		for(int i = 0; i < wow.length; i++){
			int physics = Integer.parseInt(wow[i]);
			arrayOfDigits[i] = physics;
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
		String a = "";
		for(int i = 0; i < arrayOfDigits.length; i++){
			a += String.valueOf(arrayOfDigits[i]);
		}

		//so it returns 0 instead of a blank number
		if(a.length() == 0){
			a = "0";
		}
		return a;	
	}

	public int compareTo(BigInt a){
		int[] aArray = a.getArray();
		//comparing lengths because thats a direct sign if one is smaller
		if(aArray.length < arrayOfDigits.length){
			return 1;
		}
		if(aArray.length > arrayOfDigits.length){
			return -1;
		}

		//comparing each placevalue left to right of the integers
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

	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow
	//wowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowowow

	public BigInt add(BigInt a){

		//start by flipping the arrays to work from left to right
		int[] original = new int[arrayOfDigits.length];
		int[] adding = new int[a.getArray().length];
		for(int i = 0; i < original.length; i++){
			original[i] = arrayOfDigits[arrayOfDigits.length -1- i];	
		}
		for(int i = 0; i < adding.length; i++){
			adding[i] = a.getArray()[adding.length -1- i];
		}

		//reference arrays so i dont have to add in every if statement
		int[] updatedOriginal;
		int[] updatedAdding;

		if(original.length > adding.length){
			int difference = original.length - adding.length;
			int[] newAdding = new int[adding.length + difference + 1];
			//creating an array the same size as original but adding 0's at the beggining
			for(int i = 0; i < adding.length; i++){
				newAdding[i] = adding[i];
			}
			for(int i = adding.length; i < newAdding.length; i++){
				newAdding[i] = 0;
			}

			int[] newOriginal = new int[original.length + 1];
			for(int i = 0; i < original.length; i++){
				newOriginal[i] = original[i];
			}
			newOriginal[newOriginal.length -1] = 0;

			//adding an extra 0 incase you have to carry an extra digit


			updatedAdding = newAdding;
			updatedOriginal = newOriginal;

		}
		else if(original.length < adding.length){
			int difference = adding.length - original.length;
			int[] newOriginal = new int[original.length + difference + 1];
			//creating an array the same size as adding but inserting 0's ar the beginning 
			for(int i = 0; i < original.length; i++){
				newOriginal[i] = original[i];
			}
			for(int i = original.length; i < newOriginal.length; i++){
				newOriginal[i] = 0;
			}

			int[] newAdding = new int[adding.length + 1];
			for(int i = 0; i < newAdding.length; i++){
				if(i < adding.length){
					newAdding[i] = adding[i];
				}else{
					newAdding[i] = 0;
				}
			}

			updatedOriginal = newOriginal;
			updatedAdding = newAdding;
		}
		else{	//they are the same length
			updatedOriginal = original;
			updatedAdding = adding;
		}
	
		//now to actally add the two integers
		
		int[] answer = new int[updatedOriginal.length];
		for(int i = 0; i < updatedOriginal.length - 1; i++){
			int value = updatedOriginal[i] + updatedAdding[i];
			if(value - 10 > 0){
				value = value - 10;
				updatedOriginal[i+1] += 1;
			}
			else if(value == 10){
				value = 0;
				updatedOriginal[i+1] += 1;
			}
			answer[i] = value;
		}

		//must check if the last digit is 0 or not so it wont be messed up
		//once i flip the array back to correct orientation
	
		int[] finalAnswer;
		if(answer[answer.length - 1] == 0){
			finalAnswer = new int[answer.length - 1];
			for(int i = 0; i < answer.length -1; i++){
				finalAnswer[i] = answer[i];
			}
		}
		else{
			finalAnswer = answer;
		}

		//flipping array to correct orientation
		
		int[] placeHolder = new int[finalAnswer.length + 1];
		int j = finalAnswer.length;
		for(int i = 0; i < finalAnswer.length; i++){
			placeHolder[j - 1] = finalAnswer[i];
			j = j - 1;
		}	
		
		//finalAnswer in string form
		String answerr = "";
		for(int i = 0; i < placeHolder.length - 1; i++){
			answerr += String.valueOf(placeHolder[i]);
		}

		BigInt thingImReturning = new BigInt(answerr);
		return thingImReturning;
	}

	//method is used to get the array of another bigInt
	public int[] getArray(){
		return arrayOfDigits;
	}
}
