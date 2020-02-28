
public class Album extends Product {

	private String artist;
	
	public Album() {
		super ();
		artist = "";
		count++;
	}

	public void setArtist (String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return author;
	}
	@Override
    public String toString() {
        return super.toString() + " by " + Artist;
    }

}
