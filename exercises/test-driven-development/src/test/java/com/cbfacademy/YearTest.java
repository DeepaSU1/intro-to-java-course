package com.cbfacademy;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName(value = "The leap year kata should return")
public class YearTest {

    static Stream<Arguments> inputAndOutputProvider() {
        return Stream.of(
        arguments(1600, true),
        arguments(1700, false),
        arguments(1800, false),
        arguments(1900, false),
        arguments(2000, true),
        arguments(2001, false),
        arguments(2002, false),
        arguments(2004, true),
        arguments(2005, false),
        arguments(2008, true),
        arguments(2009, false),
        arguments(2010, false),
        arguments(2020, true),
        arguments(2021, false),
        arguments(2022, false)
    

);
        }
    

@ParameterizedTest
@MethodSource("inputAndOutputProvider")
@DisplayName("determine whether a given year is a leap year, or not")
public void returnExpectedValue(Integer number, Boolean expected){
    final Year year = new Year(number);
    assertThat(year.isLeap(), is(expected));
}
}
