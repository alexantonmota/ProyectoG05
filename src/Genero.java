
public enum Genero {
	TERROR,ACCION,COMEDIA,ROMANTICA,THRILLER,SCIFI,ANIME,HISTORIA,CLASICA,MUSICAL,DRAMA,INFANTIL;
	static Genero getGenero(String elemento){
        return Enum.valueOf(Genero.class,elemento);
	}
}
