/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.*;
import java.time.temporal.*;
        
/**
 *
 * @author IFNMG
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        
        LocalDate atentados = LocalDate.of(2001, 9, 11);
        System.out.println(atentados);
        
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        
        String hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        
        formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        
        hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        System.out.println("");
        
        
        System.out.println("Dia da Semana: "+hoje.getDayOfWeek().name());
        System.out.println("Dia: "+hoje.getDayOfMonth());
        System.out.println("Mês: "+hoje.getMonthValue());
        System.out.println("Mês: "+hoje.getMonth().name());
        System.out.println("Ano: "+hoje.getYear());
        System.out.println("");
        
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        String mes = hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        
        System.out.println("Dia da Semana: "+diaDaSemana);
        System.out.println("Mes: "+mes);
        System.out.println("");
        
        
        LocalDate niverW = LocalDate.of(1987, Month.NOVEMBER, 10);
        LocalDate niverC = LocalDate.of(1998, 5, 19);
        
        Period periodo = Period.between(niverW, niverC);
        System.out.println("Anos: "+periodo.getYears());
        System.out.println("Meses: "+periodo.getMonths());
        System.out.println("Dias: "+periodo.getDays());
        System.out.println("");
        
        long totalAnos = ChronoUnit.YEARS.between(niverW, niverC);
        long totalMeses = ChronoUnit.MONTHS.between(niverW, niverC);
        long totalDias = ChronoUnit.DAYS.between(niverW, niverC);
        System.out.println("Total Anos: "+totalAnos);
        System.out.println("Total Meses: "+totalMeses);
        System.out.println("Total Dias: "+totalDias);
        System.out.println("");
        
        System.out.println("Mais 5 Dias: "+hoje.plusDays(5));
        System.out.println("Mais 5 Semanas: "+hoje.plusWeeks(5));
        System.out.println("Mais 5 Anos: "+hoje.plusYears(5));
        System.out.println("Mais 2 Meses: "+hoje.plusMonths(2));
        System.out.println("Menos 1 Ano: "+hoje.minusYears(1));
        System.out.println("Menos 1 mes: "+hoje.minusMonths(1));
        System.out.println("Menos 3 Dias: "+hoje.minusDays(3));

    }
    
}
