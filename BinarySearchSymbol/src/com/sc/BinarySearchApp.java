/**
 * 
 */
package com.sc;

public class BinarySearchApp {

	BinarySearchImpl bubbleSortBasedSearchImpl	=	null;
	BinarySearchImpl quickSortBasedSearchImpl	=	null;
	
	public void search() {
		int sourceNumbers [] 	= 	{1,2,3,4,5,6,7,8,9,10};
		performBubbleSort(sourceNumbers);
		performQuickSort(sourceNumbers);
	}

	private void performQuickSort(int[] sourceNumbers) {
		boolean isPresent =	quickSortBasedSearchImpl.isPresent(sourceNumbers);
		System.out.println("Completed QuickSort "+isPresent);
	}


	private void performBubbleSort(int[] sourceNumbers) {
		boolean isPresent =	bubbleSortBasedSearchImpl.isPresent(sourceNumbers);
		System.out.println("Completed BubbleSort "+isPresent);
	}


	public void setBubbleSortBasedSearchImpl(BinarySearchImpl bubbleSortBasedSearchImpl) {
		this.bubbleSortBasedSearchImpl = bubbleSortBasedSearchImpl;
	}


	public void setQuickSortBasedSearchImpl(BinarySearchImpl quickSortBasedSearchImpl) {
		this.quickSortBasedSearchImpl = quickSortBasedSearchImpl;
	}

}
