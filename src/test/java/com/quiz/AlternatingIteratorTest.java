/**
 * 
 */
package com.quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

/**
 * @author Jag Gangishetti Jan 25, 2019
 * @param <E>
 *
 */
public class AlternatingIteratorTest<E> extends TestCase {

	
	public void testIteratorObjectCreation(){
		
		List<String> list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<Integer> list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		List<String> list3 = new ArrayList();
		list3.add("x");
		list3.add("y");
		
		Iterator<E> iterator1 = (Iterator<E>) list1.iterator();
		Iterator<E> iterator2 = (Iterator<E>) list2.iterator();
		Iterator<E> iterator3 = (Iterator<E>) list3.iterator();
		
		AlternatingIterator<E> ite = new AlternatingIterator<E>(iterator1, iterator2, iterator3);
		
		
	}
	
}
