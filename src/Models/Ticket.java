package Models;

import java.util.Date;

/**
 * Модель билета
 */
public class Ticket{

    private long id;
    private int zoneStart;
    private int zoneStop;
    private int routeNumber;
    private int place;
    private int price;
    private Date date;
    private boolean isValid;

    public Ticket(int routeNumber, int place, int price, Date date, boolean isValid) {
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }



    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }


    public void setZoneStop(int zoneStop) {
        this.zoneStop = zoneStop;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

 
    public int getPlace() {
        return place;
    }


    public int getPrice() {
        return price;
    }


    public Date getDate() {
        return date;
    }


    public boolean getValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }


    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                ", " + (isValid ? "Free" : "Busy");
    }


    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    @Override
    public int hashCode() {
        return date.hashCode() ^ (routeNumber + place + price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }


    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDate() == this.date
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }
   
}
