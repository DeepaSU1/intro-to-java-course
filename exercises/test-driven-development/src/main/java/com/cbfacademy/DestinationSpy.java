
package com.cbfacademy;

interface Destination{
    void setCharacter(final String character);
}

public class DestinationSpy implements Destination {
        private Integer numberOfCalls = 0;

    @override

        public void setCharacter(final String character){
            this.numberOfCalls += 1;

        }

        boolean wasCalled(){
            return this.numberOfCalls > 0;
        }
    }