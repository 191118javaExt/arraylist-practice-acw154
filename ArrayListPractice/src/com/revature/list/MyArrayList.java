package com.revature.list;

public class MyArrayList {
	private int arrSize = 5;
	private Object[] arr = new Object[arrSize];
	private int idx;

	public void add(int val) {
		// TODO Auto-generated method stub
		if (idx == arrSize - 1) {
			Object[] newArr = new Object[(arrSize * 3) / 2];
			for (int i = 0; i < arrSize; i++) {
				newArr[i] = arr[i];
			}
			arrSize = ( arrSize * 3 ) / 2;
			arr = newArr;
		}

		arr[idx] = val;
		idx++;
		
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		if (index < 0 || index > arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index] = val;
		}
		
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index > arrSize) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i = index; i < idx; i++) {
			arr[i] = arr[i+1];
		}
		arr[idx-1] = null;
		idx--;
		
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		try {
			return (int) arr[index];
		} catch(NumberFormatException e) {
			System.out.println("Error: Conversion " + e.getMessage() + " is Invalid");
		}
		return -1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String rtn = "";
		for (Object o: arr) {
			rtn += o.toString() + " ";
		}
		return rtn;
	}
}
