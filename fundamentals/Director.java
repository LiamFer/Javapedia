package fundamentals;

public enum Director {
    NOLAN(1),TARANTINO(2),MICHAEL_BAY(3);
    private final int director;
    Director(int director){
        this.director = director;
    }
    public int getDirector(){return this.director;};
}
