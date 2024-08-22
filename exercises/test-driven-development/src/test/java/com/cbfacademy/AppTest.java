
package com.cbfacademy;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

     static Stream<Arguments> inputAndOutputProvider(){
        return Stream.of(
            arguments(1,"1"),
            arguments(2, "2"),
            arguments(3, "Fizz"),
            arguments(4, "4"),
            arguments(5, "Buzz"),
            arguments(6, "Fizz"),
            arguments(7, "7"),
            arguments(8, "8"),
            arguments(9, "Fizz"),
            arguments(10, "Buzz"),
            arguments(11, "11"),
            arguments(12, "Fizz"),
            arguments(13, "13"),
            arguments(14, "14"),
            arguments(15, "FizzBuzz")
        );
    }

    @ParameterizedTest
    @MethodSource("inputAndOutputProvider")
    @DisplayName("return expected value")
    public void returnExpectedValue(Integer number, String expected){
        final String actual = FizzBuzz.of(number);
        assertThat(actual, is(expected));
    }

    // public class YearTest {
    //     @Test
    //     public void testIsLeap() {
    //         Year year = new Year();
    //         assertFalse(year.isLeap(1700));
    //         assertFalse(year.isLeap(1800));
    //         assertFalse(year.isLeap(1900));
    //         assertFalse(year.isLeap(2000));
    //         assertFalse(year.isLeap(2001));
    //         assertFalse(year.isLeap(2002));
    //         assertFalse(year.isLeap(2004));
    //         assertFalse(year.isLeap(2005));
    //         assertFalse(year.isLeap(2008));
    //     }
    // }

    

    

    public class CharacterCopierTest {
        @Test
        public void testCopy(){
            SourceSpy source = new SourceSpy("hello\nworld");
            DestinationSpy destination = new DestinationSpy();
            CharacterCopier copier = new CharacterCopier(source, destination);
            copier.copy();
            assertEquals("hello", destination.getCaptured());
        }
    }

    // public class CharacterCopierTest {
    //     @Test
    //     public void testCopy(){
    //         Source source = mock(Source.class);
    //         Destination destination = mock(Destination.class);

    //         when(source.getChar())
    //             .thenReturn('h')
    //             .thenReturn('e')
    //             .thenReturn('l')
    //             .thenReturn('l')
    //             .thenReturn('o')
    //             .thenReturn('\n');
            
    //         CharacterCopier copier = new CharacterCopier(source, destination);
    //         copier.copy();

    //         verify(destination).setChar('h');
    //         verify(destination).setChar('e');
    //         verify(destination).setChar('l');
    //         verify(destination).setChar('l');
    //         verify(destination).setChar('o');
    //         verify(destination, never()).setChar('\n');
            
    //     }
    // }
}





    // @Test
    // @DisplayName("return 'Fizz' when the input is divisible by 3")
    // public void testReturnFizz() {
    //     final App fizz = new App();
    //     String result = fizz.get(3);
    //     assertEquals(fizz, result);
    // }




// @Test
//     @DisplayName("prints Fizz")
//     public void printsFizz() {
//         assertEquals("Fizz", FizzBuzz.get(3));
    
//   }
// }



// fizzbuzz. java: package com.cbfacademy;
// public class FizzBuzz {
  
//   public static String get(int n) {
//         if (n %3 == 0) {
//             return "Fizz";
//         }
//         return null;
//     }
// };



// package com.cbfacademy;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import static org.hamcrest.CoreMatchers.equalTo;
// import static org.hamcrest.CoreMatchers.is;
// import static org.hamcrest.CoreMatchers.notNullValue;
// import static org.hamcrest.MatcherAssert.assertThat;
// @DisplayName(value = "Basic Test Suite")
// public class AppTest {
//     @Test
//     @DisplayName("creates the app")
//     public void createsAnApp() {
//         final App app = new App();
//         assertThat(app, is(notNullValue()));
//     }
//        @Test
//     @DisplayName("prints Fizz")
//     public void printsFizz() {
//         assertEquals("Fizz", FizzBuzz.get(3));
    
//   }
// }