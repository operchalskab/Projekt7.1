public class User {
    private String imie;
    private String nazwizko;
    private int wiek;

    public User(String imie, String nazwizko, int wiek) {
        this.imie = imie;
        this.nazwizko = nazwizko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwizko() {
        return nazwizko;
    }

    public void setNazwizko(String nazwizko) {
        this.nazwizko = nazwizko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
