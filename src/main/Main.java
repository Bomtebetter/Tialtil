package main;

import polomorf.*;
import polomorf.DoubleHalfPunch;
import polomorf.Knots;
import polomorf.Noose;
import polomorf.P�lstek;

public class Main {

	public static void main(String[] args) {
		
		Knots[] knots = {new Noose(), new P�lstek(), new DoubleHalfPunch()};
		
		for (Knots knot: knots) {
			System.out.println(knot._Lenght);
			knot.name();
			knot.usage();
			knot.difficulty();
			knot.noosieness();
			System.out.println();
			
		}
		
	}
	
}
