
package com.cbfacademy;

class DestinationSpy implements Destination {
        private final StringBuilder captured = new StringBuller();

    @override
        public void setChar(char c){
            captured.append(c);

        }

        public String getCaptured(){
            return captured.toString();
        }
    }