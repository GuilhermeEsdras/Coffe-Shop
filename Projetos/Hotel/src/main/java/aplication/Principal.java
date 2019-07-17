package aplication;

import exceptions.DomainException;
import entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");

        try {
            System.out.print("Numero do quarto: ");
            int numero = input.nextInt();
            System.out.print("Data de check-in (dd/MM/aaaa): ");
            Date checkIn = dateFormat.parse(input.next());
            System.out.print("Data de check-out (dd/MM/aaaa): ");
            Date checkOut = dateFormat.parse(input.next());

            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Insira a nova data para atualizar a reserva: ");
            System.out.print("Data de check-in (dd/MM/aaaa): ");
            checkIn = dateFormat.parse(input.next());
            System.out.print("Data de check-out (dd/MM/aaaa): ");
            checkOut = dateFormat.parse(input.next());

            reserva.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formato de data invalido.");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

        input.close();
    }
}
