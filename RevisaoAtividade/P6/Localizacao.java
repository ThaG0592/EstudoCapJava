package P6;

public class Localizacao {
    private int latitude;
    private int longitude;
    
    public Localizacao (int Lat, int Long){
        this.latitude = Lat;
        this.longitude = Long;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    public int getLatitude() {
        return latitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    public int getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
       String retorno = "Latitude: " + this.latitude + "\nLongitude: " + this.longitude;
        return retorno;
    }
}
