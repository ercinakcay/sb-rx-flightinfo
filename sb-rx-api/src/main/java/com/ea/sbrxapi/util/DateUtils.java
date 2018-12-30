package com.ea.sbrxapi.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public final class DateUtils
{
    // ----

    private static final Random RANDOM = new Random();

    // ----

    public static final Locale DEFAULT_LOCALE = new Locale("tr");

    private static final ThreadLocal<DateFormat> tlDateFormat =
            ThreadLocal.<DateFormat>withInitial
                    (() -> {return new SimpleDateFormat("dd MMMM yyyy", DEFAULT_LOCALE);});

    private static final ThreadLocal<DateFormat> tlDateTimeFormat =
            ThreadLocal.<DateFormat>withInitial
                    (() -> {return new SimpleDateFormat("HH:mm", DEFAULT_LOCALE);});

    // ----

    private static final DateTimeFormatter tlDateFormatLD = DateTimeFormatter.ofPattern("dd MMMM yyyy");

    private static final DateTimeFormatter tlDateTimeFormatLD = DateTimeFormatter.ofPattern("HH:mm");


    public static String getNowDate()
    {
        LocalDateTime time = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        return time.format(tlDateFormatLD);
    }

    public static String generateRandomLocalTime(boolean isFirstMean)
    {
        LocalDateTime time = LocalDateTime.of(LocalDate.now(), LocalTime.of((isFirstMean ? 0 : 12) + RANDOM.nextInt(12),
                RANDOM.nextInt(60), RANDOM.nextInt(60), RANDOM.nextInt(999999999 + 1)));
        return time.format(tlDateTimeFormatLD);
    }
}
