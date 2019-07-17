package entities;

import exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Data de check-out deve ser posterior a data de check-in");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    private long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Erro na reserva: As datas devem ser posteriores a data atual.");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: A data de check-out deve ser posterior a data de check-in.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto " + roomNumber
                + ", check-in: " + dateFormat.format(checkIn)
                + ", check-out: " + dateFormat.format(checkOut)
                + ", " + duration() + " noites";
    }
}
