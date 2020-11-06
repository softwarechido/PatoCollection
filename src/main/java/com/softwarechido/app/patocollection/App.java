package com.softwarechido.app.patocollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

import com.softwarechido.app.patocollection.dominio.Color;
import com.softwarechido.app.patocollection.dominio.Pato;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main(String[] args) {
				
		Pato myPato1 = new Pato("Lucas", 8.5f, Color.NEGRO);
		Pato myPato2 = new Pato("Donald", 9.5f, Color.BLANCO);
		Pato myPato3 = new Pato("Daisy", 5.5f, Color.BLANCO);
		Pato myPato4 = new Pato("Feo", 3.0f, Color.NEGRO);
		Pato myPato5 = new Pato("Hule", 3.0f, Color.AMARILLO);
		
		// Utilizando HashSet
		
		HashSet<Pato> myHashSet = new HashSet<Pato>();
		myHashSet.add(myPato1);
		myHashSet.add(myPato1);
		myHashSet.add(myPato2);
		myHashSet.add(myPato3);
		myHashSet.add(myPato4);
		myHashSet.add(myPato5);
		
		System.out.println(" \n .:: HashSet ::.");
		for (Pato estePato : myHashSet) {
			System.out.println(estePato);			
		}	
			
		// Utilizando LinkedHashSet
		
		LinkedHashSet<Pato> myLinkedHashSet = new LinkedHashSet<Pato>();
		myLinkedHashSet.add(myPato1);
		myLinkedHashSet.add(myPato1);
		myLinkedHashSet.add(myPato2);
		myLinkedHashSet.add(myPato3);
		myLinkedHashSet.add(myPato4);
		myLinkedHashSet.add(myPato5);
		
		System.out.println(" \n .:: LinkedHashSet ::.");
		for (Pato estePato : myLinkedHashSet) {
			System.out.println(estePato);			
		}	
		
		// Utilizando TreeSet
		
		TreeSet<Pato> myTreeSet = new TreeSet<Pato>();
		myTreeSet.add(myPato1);
		myTreeSet.add(myPato1);
		myTreeSet.add(myPato2);
		myTreeSet.add(myPato3);
		myTreeSet.add(myPato4);
		myTreeSet.add(myPato5);
		
		System.out.println(" \n .:: TreeSet ::.");
		for (Pato estePato : myTreeSet) {
			System.out.println(estePato);			
		}	
		
		// Utilizando ArrayList
		
		ArrayList<Pato> myArrayList = new ArrayList<Pato>();
		myArrayList.add(myPato1);
		myArrayList.add(myPato1);
		myArrayList.add(myPato2);
		myArrayList.add(myPato3);
		myArrayList.add(myPato4);
		myArrayList.add(myPato5);
		
		System.out.println(" \n .:: ArrayList ::.");
		for (Pato estePato : myArrayList) {
			System.out.println(estePato);			
		}	
		
		// Utilizando Vector
		
		Vector<Pato> myVector = new Vector<Pato>();
		myVector.add(myPato1);
		myVector.add(myPato1);
		myVector.add(myPato2);
		myVector.add(myPato3);
		myVector.add(myPato4);
		myVector.add(myPato5);
		
		System.out.println(" \n .:: Vector ::.");
		for (Pato estePato : myVector) {
			System.out.println(estePato);			
		}	
		
		
		// Utilizando LinkedList
		
		LinkedList<Pato> myLinkedList = new LinkedList<Pato>();
		myLinkedList.add(myPato1);
		myLinkedList.add(myPato1);
		myLinkedList.add(myPato2);
		myLinkedList.add(myPato3);
		myLinkedList.add(myPato4);
		myLinkedList.add(myPato5);
		
		System.out.println(" \n .:: LinkedList ::.");
		for (Pato estePato : myLinkedList) {
			System.out.println(estePato);			
		}	
		
	}	
}
