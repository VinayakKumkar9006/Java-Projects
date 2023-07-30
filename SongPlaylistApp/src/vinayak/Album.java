package vinayak;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
   private String name;
   private String artist;
   private ArrayList<Song> songs;

   
   public Album(String name, String artist) {
	this.name = name;
	this.artist = artist;
	this.songs = new ArrayList<Song>();
}
   public Album() {
	   
   }
   
   public Song findSong(String title) {
	   for(Song cheakedSong : songs) {
		   if(cheakedSong.getTitle().equals(title)) return cheakedSong; 
			   
	   }
	   return null;
   }
   public boolean addSong(String title, double duration) {
	   if(findSong(title) == null) {
		   songs.add(new Song(title,duration));
		 //  System.out.println(title+ "SuccesFully Added to the List");
		   return true;
	   }
	   else {
		//   System.out.println("Song with Name"+ title+"already exist in the List");
		   return false;
	   }
   }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList) {
    	int index = trackNumber -1;
    	if(index > 0 && index <= this.songs.size()) {
    		PlayList.add(this.songs.get(index));
    		return true;
    	}
    //	System.out.println("This Album does not have song with trackNumber"+trackNumber);
    	return false;
    }
    
    public boolean addToPlayList(String title, LinkedList<Song> PlayList) {
    	for(Song cheakedSong : this.songs) {
    		if(cheakedSong.getTitle().equals(title))
    		{
    			PlayList.add(cheakedSong);
    			return true;
    		}    	
    		
    	}
 //   	System.out.println(title +"there is no such song in the album");
    	return false;
    } 
}
