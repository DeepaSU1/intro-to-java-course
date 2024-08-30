
package com.cbfacademy;

interface Destination{
    void setCharacter(String character);
}

public class DestinationSpy implements Destination {
        private Integer numberOfCalls = 0;

    @Override

        public void setCharacter(String character){
            this.numberOfCalls = this.numberOfCalls + 1;

        }

        boolean wasCalled(){
            return this.numberOfCalls > 0;
        }
    }