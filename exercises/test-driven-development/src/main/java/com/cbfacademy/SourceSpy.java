
package com.cbfacademy;

interface Source {
    String getCharacter();
}

public class SourceSpy implements Source {
        private Integer numberOfCalls = 0;
        
        @Override
        public String getCharacter() {
            this.numberOfCalls = this.numberOfCalls + 1;
            return null;
        }

        Boolean wasCalled(){
            return this.numberOfCalls > 0;
        }
    }