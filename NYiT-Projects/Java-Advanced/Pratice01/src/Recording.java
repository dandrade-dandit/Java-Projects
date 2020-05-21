
public class Recording {
	
	//Create a class named Recording that contains fields to hold methods for setting and getting a Recording’s title, artist, and playing time in seconds. 
	
	String recTitle;
	String artistName;
	int playingTime;
	
	public String getRecTitle() {
		return recTitle;
	}
	public String getArtistName() {
		return artistName;
	}
	public int getPlayingTime() {
		return playingTime;
	}
	public void setRecTitle(String recTitle) {
		this.recTitle = recTitle;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

}
