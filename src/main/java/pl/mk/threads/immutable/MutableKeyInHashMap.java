package pl.mk.threads.immutable;

public class MutableKeyInHashMap {
        private int lon;
        private int lat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MutableKeyInHashMap that = (MutableKeyInHashMap) o;

        if (lon != that.lon) return false;
        return lat == that.lat;
    }

    @Override
    public int hashCode() {
        int result = lon;
        result = 31 * result + lat;
        return result;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }
}
