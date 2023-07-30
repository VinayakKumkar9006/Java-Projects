package maccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import vinayak.*;
public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<>();  

	public static void main(String[] args) { 
		
		
		Album album = new Album("Album","C/DC");
		
		album.addSong("TNT", 4.5);
		album.addSong("HighWay To Hell", 3.5);
		album.addSong("ThunderStruck", 5.0);
		albums.add(album);
		
		album = new Album("Album2","Eminem");
		
		album.addSong("Rap god", 4.5);
		album.addSong("Hot Afraid", 3.5);
		album.addSong("Loose YourSelf", 4.5);
	    albums.add(album);
	    
	    LinkedList<Song> PlayList_1 = new LinkedList<>();
	    
	    albums.get(0).addToPlayList("TNT", PlayList_1);
	    albums.get(0).addToPlayList("Highway to Hell ", PlayList_1);
	    albums.get(0).addToPlayList("Rap God", PlayList_1);
	    albums.get(0).addToPlayList("Lose Yourself", PlayList_1);
	    
	    play(PlayList_1);

	}
	
	private static void play(LinkedList<Song> PlayList) {
		Scanner s = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = PlayList.listIterator();
		
		if(PlayList.size() == 0) {
			System.out.println("This Plylist have no Song");
		}else {
			System.out.println("Now Playing"+ listIterator.next().toString());
			printMenu();
			
		}
		while(!quit) {
			int action = s.nextInt();
			s.nextLine();
			
			switch(action) {
			
			case 0:
				System.out.println("Playlist is Complete");
				quit = true;
				break;
			
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now Playing"+listIterator.next().toString());
				}else {
					System.out.println("No Song Available, Reached to the end of the list");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now Playing"+listIterator.previous().toString());
				}else {
					System.out.println("We are at the first Song");
					forward = false;
				}
				break;
				
			   case 3:
				   if(forward) {
					   if(listIterator.hasPrevious()) {
						   System.out.println("Now Playing"+listIterator.previous().toString());
						   forward = false;
					   }else {
						   System.out.println("We are at the Start of the list");
					   }
				   }else {
					   if(listIterator.hasNext()) {
						   System.out.println("Now Plying"+listIterator.next().toString());
						   forward = true;
					   }else {
						   System.out.println("We have reached to the end of list");
					   }
				   }
				   break;
				   
			   case 4:
				   printList(PlayList);
				   break;
				   
			   case 5:
				   printMenu();
				   break;
			   case 6:
				   if(PlayList.size() > 0) {
					   listIterator.remove();
					   if(listIterator.hasNext()) {
						   System.out.println("Now Playing"+listIterator.next().toString());
						   
					   }
					   else {
						   if(listIterator.hasPrevious())
						   System.out.println("Now Playing"+listIterator.previous().toString());
					   }
				   }
			}
		}
		s.close();
		
	}
	
	private static void printMenu() {
		System.out.println("Available Options\n press");
		System.out.println("0 - to quit\n"+
		          "1 - to play next song\n"+
				  "2 - to play previous song\n"+
		          "3 - to replay the current song\n"+
				  "4 -  list of All Songs\n"+
		          "5 - print all available"+
				  "6 - delete current song");
	}
	
	private static void printList(LinkedList<Song> PlayList) {
		Iterator<Song> iterator = PlayList.iterator();
		System.out.println("===============");
		
		while (iterator.hasNext()){
			System.out.println(iterator.next());
			}
		System.out.println("================");
		}

}
