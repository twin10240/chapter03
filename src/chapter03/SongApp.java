package chapter03;

public class SongApp {
	public static void main(String[] args) {
		Song song = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
//		song.setAlbum("Real");
//		song.setArtist("아이유");
//		song.setComposer("이민수");
//		song.setTrack(3);
//		song.setYear(2010);
//		song.setTitle("좋은날");
		
		song.show();
		
		Song song2 = new Song("귀를 기울이면", "여자친구");
		song2.show();
		
		Song song3 = new Song("Artist", "Zico");
		song3.show();
	}
}
