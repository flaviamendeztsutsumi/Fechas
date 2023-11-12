package aplicacion;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
     
        DateTimeFormatter formatoEspañol = DateTimeFormatter.ofPattern("d-MM-yyyy, hh:mm:ss a");
        LocalDateTime horaEspaña = LocalDateTime.now(ZoneId.of("Europe/Madrid"));
        String horaEspañaFormateada = horaEspaña.format(formatoEspañol);

        DateTimeFormatter formatoCaracas = DateTimeFormatter.ofPattern("MM-dd-yyyy, hh:mm:ss a");
        LocalDateTime horaCaracas = LocalDateTime.now(ZoneId.of("America/Caracas"));
        String horaCaracasFormateada = horaCaracas.format(formatoCaracas);

        long horasDiferencia = ChronoUnit.HOURS.between(horaEspaña, horaCaracas);

        LocalDateTime neilArmstrongLuna = LocalDateTime.of(1969, 7, 21, 3, 56);
        DateTimeFormatter formatoNeilArmstrong = DateTimeFormatter.ofPattern("d-MM-yyyy, hh:mm:ss a");
        String neilArmstrongFormateada = neilArmstrongLuna.format(formatoNeilArmstrong);

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaDescubrimientoAmerica = LocalDate.of(1492, Month.OCTOBER, 12);
        long añosTranscurridos = ChronoUnit.YEARS.between(fechaDescubrimientoAmerica, fechaActual);

        System.out.println("La fecha actual en España es " + horaEspañaFormateada);
        System.out.println("La fecha actual en Caracas es " + horaCaracasFormateada);
        System.out.println("Las horas de diferencia entre Madrid y Caracas son: " + horasDiferencia + " horas.");
        System.out.println("El tiempo transcurrido desde el descubrimiento de América es de " + añosTranscurridos + " años.");
        System.out.println("Fecha y hora cuando Neil Armstrong pisó la luna en Madrid: " + neilArmstrongFormateada);
    }
}
