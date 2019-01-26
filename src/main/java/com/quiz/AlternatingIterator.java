/**
 * 
 */
package com.quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlternatingIterator <E> implements Iterator {
	
	E[] values;
	int current = 0;  // the current element we are looking at
	List<E> currentItem = new ArrayList();
	List<Iterator<E>> iteratorList = new ArrayList<Iterator<E>>();
	
	public AlternatingIterator(Iterator<E> ...iterators){
		
		for(int i=0; i<iterators.length; i++){
			
			
			if(iterators[i].hasNext()){
				currentItem.add(iterators[i].next());
				
			}
			
			
		}
		
		System.out.println(currentItem.size());
		
		
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext() {
		 if (current < AlternatingIterator.this.values.length) 
             return true;
         else 
             return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
