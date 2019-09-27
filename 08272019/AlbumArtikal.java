package prodavnica;

public abstract class AlbumArtikal extends Artikal {

	private String izdavac;
	protected Album album;

	public AlbumArtikal(Album album, String izdavac, double cena, int kolicina) {
		super(cena, kolicina);
		this.album = album;
		this.izdavac = izdavac;
	}

	public abstract String ime();

}